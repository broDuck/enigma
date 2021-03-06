package com.broduck.enigma.generate.model;

import java.io.Serializable;

public class VoteResultKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteresult.vote_sn
     *
     * @mbg.generated
     */
    private Integer voteSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteresult.vote_item_sn
     *
     * @mbg.generated
     */
    private Integer voteItemSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteresult.age_kind
     *
     * @mbg.generated
     */
    private Integer ageKind;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteresult.male_kind
     *
     * @mbg.generated
     */
    private Boolean maleKind;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table voteresult
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteresult.vote_sn
     *
     * @return the value of voteresult.vote_sn
     *
     * @mbg.generated
     */
    public Integer getVoteSn() {
        return voteSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteresult.vote_sn
     *
     * @param voteSn the value for voteresult.vote_sn
     *
     * @mbg.generated
     */
    public void setVoteSn(Integer voteSn) {
        this.voteSn = voteSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteresult.vote_item_sn
     *
     * @return the value of voteresult.vote_item_sn
     *
     * @mbg.generated
     */
    public Integer getVoteItemSn() {
        return voteItemSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteresult.vote_item_sn
     *
     * @param voteItemSn the value for voteresult.vote_item_sn
     *
     * @mbg.generated
     */
    public void setVoteItemSn(Integer voteItemSn) {
        this.voteItemSn = voteItemSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteresult.age_kind
     *
     * @return the value of voteresult.age_kind
     *
     * @mbg.generated
     */
    public Integer getAgeKind() {
        return ageKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteresult.age_kind
     *
     * @param ageKind the value for voteresult.age_kind
     *
     * @mbg.generated
     */
    public void setAgeKind(Integer ageKind) {
        this.ageKind = ageKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteresult.male_kind
     *
     * @return the value of voteresult.male_kind
     *
     * @mbg.generated
     */
    public Boolean getMaleKind() {
        return maleKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteresult.male_kind
     *
     * @param maleKind the value for voteresult.male_kind
     *
     * @mbg.generated
     */
    public void setMaleKind(Boolean maleKind) {
        this.maleKind = maleKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteresult
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        VoteResultKey other = (VoteResultKey) that;
        return (this.getVoteSn() == null ? other.getVoteSn() == null : this.getVoteSn().equals(other.getVoteSn()))
            && (this.getVoteItemSn() == null ? other.getVoteItemSn() == null : this.getVoteItemSn().equals(other.getVoteItemSn()))
            && (this.getAgeKind() == null ? other.getAgeKind() == null : this.getAgeKind().equals(other.getAgeKind()))
            && (this.getMaleKind() == null ? other.getMaleKind() == null : this.getMaleKind().equals(other.getMaleKind()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteresult
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVoteSn() == null) ? 0 : getVoteSn().hashCode());
        result = prime * result + ((getVoteItemSn() == null) ? 0 : getVoteItemSn().hashCode());
        result = prime * result + ((getAgeKind() == null) ? 0 : getAgeKind().hashCode());
        result = prime * result + ((getMaleKind() == null) ? 0 : getMaleKind().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteresult
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voteSn=").append(voteSn);
        sb.append(", voteItemSn=").append(voteItemSn);
        sb.append(", ageKind=").append(ageKind);
        sb.append(", maleKind=").append(maleKind);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}