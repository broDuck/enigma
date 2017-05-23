package com.broduck.enigma.service;

import com.broduck.enigma.common.MessageException;
import com.broduck.enigma.controller.rqrs.SaveVoteControllerRq;
import com.broduck.enigma.dao.*;
import com.broduck.enigma.generate.model.*;
import com.broduck.enigma.model.VoteVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

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
}