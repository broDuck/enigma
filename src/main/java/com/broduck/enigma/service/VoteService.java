package com.broduck.enigma.service;

import com.broduck.enigma.controller.rqrs.SaveVoteControllerRq;
import com.broduck.enigma.dao.CategoryDao;
import com.broduck.enigma.dao.VoteDao;
import com.broduck.enigma.dao.VoteItemDao;
import com.broduck.enigma.generate.model.Category;
import com.broduck.enigma.generate.model.Vote;
import com.broduck.enigma.generate.model.VoteItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
}