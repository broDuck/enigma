package com.broduck.enigma.generate.model;

import java.util.ArrayList;
import java.util.List;

public class VoteJoinMemberExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public VoteJoinMemberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVoteJoinSnIsNull() {
            addCriterion("vote_join_sn is null");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnIsNotNull() {
            addCriterion("vote_join_sn is not null");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnEqualTo(Integer value) {
            addCriterion("vote_join_sn =", value, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnNotEqualTo(Integer value) {
            addCriterion("vote_join_sn <>", value, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnGreaterThan(Integer value) {
            addCriterion("vote_join_sn >", value, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_join_sn >=", value, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnLessThan(Integer value) {
            addCriterion("vote_join_sn <", value, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnLessThanOrEqualTo(Integer value) {
            addCriterion("vote_join_sn <=", value, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnIn(List<Integer> values) {
            addCriterion("vote_join_sn in", values, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnNotIn(List<Integer> values) {
            addCriterion("vote_join_sn not in", values, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnBetween(Integer value1, Integer value2) {
            addCriterion("vote_join_sn between", value1, value2, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andVoteJoinSnNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_join_sn not between", value1, value2, "voteJoinSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnIsNull() {
            addCriterion("member_sn is null");
            return (Criteria) this;
        }

        public Criteria andMemberSnIsNotNull() {
            addCriterion("member_sn is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSnEqualTo(Integer value) {
            addCriterion("member_sn =", value, "memberSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnNotEqualTo(Integer value) {
            addCriterion("member_sn <>", value, "memberSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnGreaterThan(Integer value) {
            addCriterion("member_sn >", value, "memberSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_sn >=", value, "memberSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnLessThan(Integer value) {
            addCriterion("member_sn <", value, "memberSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnLessThanOrEqualTo(Integer value) {
            addCriterion("member_sn <=", value, "memberSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnIn(List<Integer> values) {
            addCriterion("member_sn in", values, "memberSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnNotIn(List<Integer> values) {
            addCriterion("member_sn not in", values, "memberSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnBetween(Integer value1, Integer value2) {
            addCriterion("member_sn between", value1, value2, "memberSn");
            return (Criteria) this;
        }

        public Criteria andMemberSnNotBetween(Integer value1, Integer value2) {
            addCriterion("member_sn not between", value1, value2, "memberSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnIsNull() {
            addCriterion("vote_sn is null");
            return (Criteria) this;
        }

        public Criteria andVoteSnIsNotNull() {
            addCriterion("vote_sn is not null");
            return (Criteria) this;
        }

        public Criteria andVoteSnEqualTo(Integer value) {
            addCriterion("vote_sn =", value, "voteSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnNotEqualTo(Integer value) {
            addCriterion("vote_sn <>", value, "voteSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnGreaterThan(Integer value) {
            addCriterion("vote_sn >", value, "voteSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_sn >=", value, "voteSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnLessThan(Integer value) {
            addCriterion("vote_sn <", value, "voteSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnLessThanOrEqualTo(Integer value) {
            addCriterion("vote_sn <=", value, "voteSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnIn(List<Integer> values) {
            addCriterion("vote_sn in", values, "voteSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnNotIn(List<Integer> values) {
            addCriterion("vote_sn not in", values, "voteSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnBetween(Integer value1, Integer value2) {
            addCriterion("vote_sn between", value1, value2, "voteSn");
            return (Criteria) this;
        }

        public Criteria andVoteSnNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_sn not between", value1, value2, "voteSn");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table votejoinmember
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table votejoinmember
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}