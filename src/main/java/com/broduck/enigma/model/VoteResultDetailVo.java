package com.broduck.enigma.model;

/**
 * Created by broduck on 2017-06-06.
 */
public class VoteResultDetailVo {
    private Integer ageKind;
    private Boolean maleYn;
    private String detailName;
    private Integer voteCount;

    public Integer getAgeKind() {
        return ageKind;
    }

    public void setAgeKind(Integer ageKind) {
        this.ageKind = ageKind;
    }

    public Boolean getMaleYn() {
        return maleYn;
    }

    public void setMaleYn(Boolean maleYn) {
        this.maleYn = maleYn;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }
}
