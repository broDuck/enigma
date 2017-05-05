package com.broduck.enigma.controller.rqrs;

import com.broduck.enigma.generate.model.VoteItem;
import com.broduck.enigma.model.VoteOpenSetting;
import com.broduck.enigma.model.VotePeriod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 투표생성
 * Created by broduck on 2017. 4. 26..
 */
public class SaveVoteControllerRq extends VoteControllerRq {
    private String voteName;
    private String voteContent;
    private List<VoteItem> voteItemList;
    private Integer categorySn;
    private VotePeriod period;
    private Boolean ageOpenYn;
    private Boolean sexOpenYn;
    private Boolean privateOpenYn;
    private List<String> voteKeywordList;

    public String getVoteName() {
        return voteName;
    }

    public void setVoteName(String voteName) {
        this.voteName = voteName;
    }

    public String getVoteContent() {
        return voteContent;
    }

    public void setVoteContent(String voteContent) {
        this.voteContent = voteContent;
    }

    public List<VoteItem> getVoteItemList() {
        return voteItemList;
    }

    public void setVoteItemList(List<VoteItem> voteItemList) {
        this.voteItemList = voteItemList;
    }

    public Integer getCategorySn() {
        return categorySn;
    }

    public void setCategorySn(Integer categorySn) {
        this.categorySn = categorySn;
    }

    public VotePeriod getPeriod() {
        return period;
    }

    public void setPeriod(VotePeriod period) {
        this.period = period;
    }

    public Boolean getAgeOpenYn() {
        return ageOpenYn;
    }

    public void setAgeOpenYn(Boolean ageOpenYn) {
        this.ageOpenYn = ageOpenYn;
    }

    public Boolean getSexOpenYn() {
        return sexOpenYn;
    }

    public void setSexOpenYn(Boolean sexOpenYn) {
        this.sexOpenYn = sexOpenYn;
    }

    public Boolean getPrivateOpenYn() {
        return privateOpenYn;
    }

    public void setPrivateOpenYn(Boolean privateOpenYn) {
        this.privateOpenYn = privateOpenYn;
    }

    public List<String> getVoteKeywordList() {
        return voteKeywordList;
    }

    public void setVoteKeywordList(List<String> voteKeywordList) {
        this.voteKeywordList = voteKeywordList;
    }
}
