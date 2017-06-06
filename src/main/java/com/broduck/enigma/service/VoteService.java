package com.broduck.enigma.service;

import com.broduck.enigma.common.MessageException;
import com.broduck.enigma.controller.rqrs.SaveVoteControllerRq;
import com.broduck.enigma.dao.*;
import com.broduck.enigma.generate.model.*;
import com.broduck.enigma.model.VoteResultDetailVo;
import com.broduck.enigma.model.VoteResultVo;
import com.broduck.enigma.model.VoteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import sun.misc.resources.Messages_es;

import java.util.*;

/**
 * 투표 서비스
 * Created by broduck on 2017. 4. 24..
 */
@Service
public class VoteService {
    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private VoteDao voteDao;

    @Autowired
    private VoteItemDao voteItemDao;

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private VoteJoinMemberDao voteJoinMemberDao;

    @Autowired
    private VoteResultDao voteResultDao;



    public boolean generateVoteData() {
        categoryDao.generateCategory();

        return true;
    }

    public List<Category> readVoteKindList() {
        return categoryDao.selectList();
    }

    /**
     * 투표 저장
     * @param rq
     */
    public void saveVote(SaveVoteControllerRq rq) {
        Vote vote = new Vote();
        vote.setVoteName(rq.getVoteName());
        vote.setCategorySn(rq.getCategorySn());
        vote.setContent(rq.getVoteContent());
        vote.setFinishYn(false);
        vote.setAgeOpenYn(rq.getAgeOpenYn());
        vote.setSexOpenYn(rq.getSexOpenYn());
        vote.setPrivateOpenYn(rq.getPrivateOpenYn());
        vote.setTargetConfigYn(rq.getPeriod().getCount() != null);
        vote.setTargetVoteCount(rq.getPeriod().getCount());
        vote.setStartDate(rq.getPeriod().getStartDate());
        vote.setEndDate(rq.getPeriod().getEndDate());
        vote.setWriteSubjectSn(rq.getLoginSn());

        voteDao.insert(vote);

        Integer voteSn = vote.getVoteSn();
        for (VoteItem voteItem : rq.getVoteItemList()) {
            voteItem.setVoteSn(voteSn);
        }

        voteItemDao.insertList(rq.getVoteItemList());
    }

    public List<VoteVo> readVoteList() throws MessageException {
        List<VoteVo> voteList = voteDao.selectVoteList();
        if (CollectionUtils.isEmpty(voteList))
            throw new MessageException("투표가 없습니다.");

        return voteList;
    }

    public boolean vote(Integer voteSn, Integer voteItemSn, int loginSn) throws MessageException {
        Vote vote = voteDao.select(voteSn);
        VoteItem voteItem =  voteItemDao.select(voteSn, voteItemSn);
        if (voteItem == null || vote == null)
            throw new MessageException("투표 정보가 유효하지 않습니다.");

        if (voteJoinMemberDao.isExist(loginSn, voteSn))
            throw new MessageException("이미 투표한 항목입니다.");

        // 투표했다고 표시
        voteJoinMemberDao.insert(loginSn, voteSn);

        Member member = memberDao.selectByMemberSn(loginSn);

        VoteResult result = voteResultDao.selectData(voteSn, voteItemSn, getAgeKind(member.getAge()), member.getMaleYn());
        if (result == null) {
            result = new VoteResult();
            result.setVoteSn(voteSn);
            result.setVoteItemSn(voteItemSn);
            result.setAgeKind(getAgeKind(member.getAge()));
            result.setMaleKind(member.getMaleYn());
            result.setVoteCount(1);

            voteResultDao.insert(result);
        } else {
            result.setVoteCount(result.getVoteCount() + 1);

            voteResultDao.update(result);
        }

        return true;
    }

    private Integer getAgeKind(Integer age) {
        age = age / 10;

        return age * 10;
    }

    public List<VoteResultVo> readVoteResultList(Integer voteSn) throws MessageException {
        List<VoteResult> voteResultList = voteResultDao.selectByVoteSn(voteSn);
        List<VoteItem> voteItemList = voteItemDao.selectByVoteSn(voteSn);

        if (CollectionUtils.isEmpty(voteResultList))
            throw new MessageException("아직 투표가 되지 않았습니다. 투표의 첫 주인공이 되어보세요 :)");

        List<VoteResultVo> resultList = new ArrayList<>();

        for (VoteItem data : voteItemList) {
            VoteResultVo result = new VoteResultVo();
            result.setVoteItemSn(data.getVoteItemSn());
            result.setVoteItemName(data.getVoteItemName());
            result.setRankList(getDetailList(data.getVoteItemSn(), voteResultList));

            Integer count = 0;
            for (VoteResultDetailVo detail : result.getRankList()) {
                count += detail.getVoteCount();
            }

            result.setVoteCount(count);

            resultList.add(result);
        }

        return resultList;
    }

    private List<VoteResultDetailVo> getDetailList(Integer voteItemSn, List<VoteResult> list) {
        Map<String, Integer> map = new HashMap<>();

        for (VoteResult data : list) {
            if (!voteItemSn.equals(data.getVoteItemSn())) continue;

            String name = getName(data.getAgeKind(), data.getMaleKind());

            Integer count = map.get(name);
            if (count == null)
                count = 0;

            count += data.getVoteCount();

            map.put(name, count);
        }

        List<VoteResultDetailVo> resultList = new ArrayList<>();

        for (String name : map.keySet()) {
            Integer count = map.get(name);

            VoteResultDetailVo result = new VoteResultDetailVo();
            result.setDetailName(name);
            result.setVoteCount(count);

            resultList.add(result);
        }

        if (resultList.size() < 3) {
            for (int i = 1; i <= 3; i++) {
                VoteResultDetailVo result = new VoteResultDetailVo();
                result.setDetailName("투표결과 없음");
                result.setVoteCount(0);

                resultList.add(result);
            }
        }

        resultList.sort(Comparator.comparing(VoteResultDetailVo::getVoteCount).reversed());

        return resultList;
    }

    private String getName(Integer age, Boolean maleYn) {
        String name = age.toString() + "대";
        name += " " + (maleYn ? "남자" : "여자");

        return name;
    }
}