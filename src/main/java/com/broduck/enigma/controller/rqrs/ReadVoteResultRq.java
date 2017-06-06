package com.broduck.enigma.controller.rqrs;

/**
 * Created by broduck on 2017-06-06.
 */
public class ReadVoteResultRq extends VoteControllerRq {
    private Integer voteSn;

    public Integer getVoteSn() {
        return voteSn;
    }

    public void setVoteSn(Integer voteSn) {
        this.voteSn = voteSn;
    }
}
