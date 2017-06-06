package com.broduck.enigma.controller.rqrs;

import com.broduck.enigma.model.VoteResultVo;

import java.util.List;

/**
 * Created by broduck on 2017-06-06.
 */
public class ReadVoteResultRs extends VoteControllerRs {
    private List<VoteResultVo> resultList;

    public List<VoteResultVo> getResultList() {
        return resultList;
    }

    public void setResultList(List<VoteResultVo> resultList) {
        this.resultList = resultList;
    }
}
