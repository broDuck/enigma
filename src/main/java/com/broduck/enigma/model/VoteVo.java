package com.broduck.enigma.model;

import com.broduck.enigma.generate.model.Vote;
import com.broduck.enigma.generate.model.VoteItem;

import java.util.List;

/**
 * 투표 vo
 * Created by broduck on 2017-05-10.
 */
public class VoteVo extends Vote {
    private List<VoteItem> voteItemList;

    public List<VoteItem> getVoteItemList() {
        return voteItemList;
    }

    public void setVoteItemList(List<VoteItem> voteItemList) {
        this.voteItemList = voteItemList;
    }
}
