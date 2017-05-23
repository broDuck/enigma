package com.broduck.enigma.controller.rqrs;

import com.broduck.enigma.model.VoteVo;

import java.util.List;

/**
 * 투표 읽어오기
 * Created by broduck on 2017-05-10.
 */
public class ReadVoteListRs extends VoteControllerRs {
    private List<VoteVo> voteList;

    public List<VoteVo> getVoteList() {
        return voteList;
    }

    public void setVoteList(List<VoteVo> voteList) {
        this.voteList = voteList;
    }
}
