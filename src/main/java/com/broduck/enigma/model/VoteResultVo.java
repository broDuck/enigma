package com.broduck.enigma.model;

import java.util.List;

/**
 * Created by broduck on 2017-06-06.
 */
public class VoteResultVo {
    private Integer voteItemSn;
    private String voteItemName;

    private Integer voteCount;
    private List<VoteResultDetailVo> rankList;

    public Integer getVoteItemSn() {
        return voteItemSn;
    }

    public void setVoteItemSn(Integer voteItemSn) {
        this.voteItemSn = voteItemSn;
    }

    public String getVoteItemName() {
        return voteItemName;
    }

    public void setVoteItemName(String voteItemName) {
        this.voteItemName = voteItemName;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public List<VoteResultDetailVo> getRankList() {
        return rankList;
    }

    public void setRankList(List<VoteResultDetailVo> rankList) {
        this.rankList = rankList;
    }
}
