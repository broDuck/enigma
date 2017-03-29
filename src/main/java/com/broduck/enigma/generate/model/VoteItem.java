package com.broduck.enigma.generate.model;

import java.io.Serializable;

public class VoteItem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitem.vote_item_sn
     *
     * @mbg.generated
     */
    private Integer voteItemSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitem.vote_sn
     *
     * @mbg.generated
     */
    private Integer voteSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitem.vote_item_name
     *
     * @mbg.generated
     */
    private String voteItemName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitem.vote_count
     *
     * @mbg.generated
     */
    private Integer voteCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteitem.photo
     *
     * @mbg.generated
     */
    private String photo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitem.vote_item_sn
     *
     * @return the value of voteitem.vote_item_sn
     *
     * @mbg.generated
     */
    public Integer getVoteItemSn() {
        return voteItemSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitem.vote_item_sn
     *
     * @param voteItemSn the value for voteitem.vote_item_sn
     *
     * @mbg.generated
     */
    public void setVoteItemSn(Integer voteItemSn) {
        this.voteItemSn = voteItemSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitem.vote_sn
     *
     * @return the value of voteitem.vote_sn
     *
     * @mbg.generated
     */
    public Integer getVoteSn() {
        return voteSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitem.vote_sn
     *
     * @param voteSn the value for voteitem.vote_sn
     *
     * @mbg.generated
     */
    public void setVoteSn(Integer voteSn) {
        this.voteSn = voteSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitem.vote_item_name
     *
     * @return the value of voteitem.vote_item_name
     *
     * @mbg.generated
     */
    public String getVoteItemName() {
        return voteItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitem.vote_item_name
     *
     * @param voteItemName the value for voteitem.vote_item_name
     *
     * @mbg.generated
     */
    public void setVoteItemName(String voteItemName) {
        this.voteItemName = voteItemName == null ? null : voteItemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitem.vote_count
     *
     * @return the value of voteitem.vote_count
     *
     * @mbg.generated
     */
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitem.vote_count
     *
     * @param voteCount the value for voteitem.vote_count
     *
     * @mbg.generated
     */
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteitem.photo
     *
     * @return the value of voteitem.photo
     *
     * @mbg.generated
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteitem.photo
     *
     * @param photo the value for voteitem.photo
     *
     * @mbg.generated
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
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
        VoteItem other = (VoteItem) that;
        return (this.getVoteItemSn() == null ? other.getVoteItemSn() == null : this.getVoteItemSn().equals(other.getVoteItemSn()))
            && (this.getVoteSn() == null ? other.getVoteSn() == null : this.getVoteSn().equals(other.getVoteSn()))
            && (this.getVoteItemName() == null ? other.getVoteItemName() == null : this.getVoteItemName().equals(other.getVoteItemName()))
            && (this.getVoteCount() == null ? other.getVoteCount() == null : this.getVoteCount().equals(other.getVoteCount()))
            && (this.getPhoto() == null ? other.getPhoto() == null : this.getPhoto().equals(other.getPhoto()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVoteItemSn() == null) ? 0 : getVoteItemSn().hashCode());
        result = prime * result + ((getVoteSn() == null) ? 0 : getVoteSn().hashCode());
        result = prime * result + ((getVoteItemName() == null) ? 0 : getVoteItemName().hashCode());
        result = prime * result + ((getVoteCount() == null) ? 0 : getVoteCount().hashCode());
        result = prime * result + ((getPhoto() == null) ? 0 : getPhoto().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", voteItemSn=").append(voteItemSn);
        sb.append(", voteSn=").append(voteSn);
        sb.append(", voteItemName=").append(voteItemName);
        sb.append(", voteCount=").append(voteCount);
        sb.append(", photo=").append(photo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}