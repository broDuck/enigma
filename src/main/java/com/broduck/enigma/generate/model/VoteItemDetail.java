package com.broduck.enigma.generate.model;

import java.io.Serializable;

public class VoteItemDetail implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitemdetail.vote_item_detail_sn
     *
     * @mbg.generated
     */
    private Integer voteItemDetailSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitemdetail.vote_item_sn
     *
     * @mbg.generated
     */
    private Integer voteItemSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitemdetail.age_kind
     *
     * @mbg.generated
     */
    private Integer ageKind;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitemdetail.male_kind
     *
     * @mbg.generated
     */
    private Boolean maleKind;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitemdetail.vote_count
     *
     * @mbg.generated
     */
    private Integer voteCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table voteitemdetail
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitemdetail.vote_item_detail_sn
     *
     * @return the value of voteitemdetail.vote_item_detail_sn
     *
     * @mbg.generated
     */
    public Integer getVoteItemDetailSn() {
        return voteItemDetailSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitemdetail.vote_item_detail_sn
     *
     * @param voteItemDetailSn the value for voteitemdetail.vote_item_detail_sn
     *
     * @mbg.generated
     */
    public void setVoteItemDetailSn(Integer voteItemDetailSn) {
        this.voteItemDetailSn = voteItemDetailSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitemdetail.vote_item_sn
     *
     * @return the value of voteitemdetail.vote_item_sn
     *
     * @mbg.generated
     */
    public Integer getVoteItemSn() {
        return voteItemSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitemdetail.vote_item_sn
     *
     * @param voteItemSn the value for voteitemdetail.vote_item_sn
     *
     * @mbg.generated
     */
    public void setVoteItemSn(Integer voteItemSn) {
        this.voteItemSn = voteItemSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitemdetail.age_kind
     *
     * @return the value of voteitemdetail.age_kind
     *
     * @mbg.generated
     */
    public Integer getAgeKind() {
        return ageKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitemdetail.age_kind
     *
     * @param ageKind the value for voteitemdetail.age_kind
     *
     * @mbg.generated
     */
    public void setAgeKind(Integer ageKind) {
        this.ageKind = ageKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitemdetail.male_kind
     *
     * @return the value of voteitemdetail.male_kind
     *
     * @mbg.generated
     */
    public Boolean getMaleKind() {
        return maleKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitemdetail.male_kind
     *
     * @param maleKind the value for voteitemdetail.male_kind
     *
     * @mbg.generated
     */
    public void setMaleKind(Boolean maleKind) {
        this.maleKind = maleKind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitemdetail.vote_count
     *
     * @return the value of voteitemdetail.vote_count
     *
     * @mbg.generated
     */
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitemdetail.vote_count
     *
     * @param voteCount the value for voteitemdetail.vote_count
     *
     * @mbg.generated
     */
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitemdetail
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
        VoteItemDetail other = (VoteItemDetail) that;
        return (this.getVoteItemDetailSn() == null ? other.getVoteItemDetailSn() == null : this.getVoteItemDetailSn().equals(other.getVoteItemDetailSn()))
            && (this.getVoteItemSn() == null ? other.getVoteItemSn() == null : this.getVoteItemSn().equals(other.getVoteItemSn()))
            && (this.getAgeKind() == null ? other.getAgeKind() == null : this.getAgeKind().equals(other.getAgeKind()))
            && (this.getMaleKind() == null ? other.getMaleKind() == null : this.getMaleKind().equals(other.getMaleKind()))
            && (this.getVoteCount() == null ? other.getVoteCount() == null : this.getVoteCount().equals(other.getVoteCount()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitemdetail
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVoteItemDetailSn() == null) ? 0 : getVoteItemDetailSn().hashCode());
        result = prime * result + ((getVoteItemSn() == null) ? 0 : getVoteItemSn().hashCode());
        result = prime * result + ((getAgeKind() == null) ? 0 : getAgeKind().hashCode());
        result = prime * result + ((getMaleKind() == null) ? 0 : getMaleKind().hashCode());
        result = prime * result + ((getVoteCount() == null) ? 0 : getVoteCount().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitemdetail
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voteItemDetailSn=").append(voteItemDetailSn);
        sb.append(", voteItemSn=").append(voteItemSn);
        sb.append(", ageKind=").append(ageKind);
        sb.append(", maleKind=").append(maleKind);
        sb.append(", voteCount=").append(voteCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}