package com.broduck.enigma.generate.model;

import java.io.Serializable;

public class VoteResult extends VoteResultKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voteresult.vote_count
     *
     * @mbg.generated
     */
    private Integer voteCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table voteresult
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voteresult.vote_count
     *
     * @return the value of voteresult.vote_count
     *
     * @mbg.generated
     */
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voteresult.vote_count
     *
     * @param voteCount the value for voteresult.vote_count
     *
     * @mbg.generated
     */
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
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
        VoteResult other = (VoteResult) that;
        return (this.getVoteSn() == null ? other.getVoteSn() == null : this.getVoteSn().equals(other.getVoteSn()))
            && (this.getVoteItemSn() == null ? other.getVoteItemSn() == null : this.getVoteItemSn().equals(other.getVoteItemSn()))
            && (this.getAgeKind() == null ? other.getAgeKind() == null : this.getAgeKind().equals(other.getAgeKind()))
            && (this.getMaleKind() == null ? other.getMaleKind() == null : this.getMaleKind().equals(other.getMaleKind()))
            && (this.getVoteCount() == null ? other.getVoteCount() == null : this.getVoteCount().equals(other.getVoteCount()));
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
        result = prime * result + ((getVoteCount() == null) ? 0 : getVoteCount().hashCode());
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
        sb.append(", voteCount=").append(voteCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}