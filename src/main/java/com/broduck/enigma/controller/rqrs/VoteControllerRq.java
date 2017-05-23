package com.broduck.enigma.controller.rqrs;

/**
 * 투표 컨트롤러 rq
 * Created by ydh0624 on 2017-04-16.
 */
public class VoteControllerRq extends EnigmaControllerRq {
    private Integer voteSn;
    private Integer voteItemSn;

    public Integer getVoteSn() {
        return voteSn;
    }

    public void setVoteSn(Integer voteSn) {
        this.voteSn = voteSn;
    }

    public Integer getVoteItemSn() {
        return voteItemSn;
    }

    public void setVoteItemSn(Integer voteItemSn) {
        this.voteItemSn = voteItemSn;
    }
}
