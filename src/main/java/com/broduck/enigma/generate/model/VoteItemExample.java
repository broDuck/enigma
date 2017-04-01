package com.broduck.enigma.generate.model;

import java.util.ArrayList;
import java.util.List;

public class VoteItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    public VoteItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
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
     * This method corresponds to the database table voteitem
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
     * This method corresponds to the database table voteitem
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voteitem
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
     * This class corresponds to the database table voteitem
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

        public Criteria andVoteItemSnIsNull() {
            addCriterion("vote_item_sn is null");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnIsNotNull() {
            addCriterion("vote_item_sn is not null");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnEqualTo(Integer value) {
            addCriterion("vote_item_sn =", value, "voteItemSn");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnNotEqualTo(Integer value) {
            addCriterion("vote_item_sn <>", value, "voteItemSn");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnGreaterThan(Integer value) {
            addCriterion("vote_item_sn >", value, "voteItemSn");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_item_sn >=", value, "voteItemSn");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnLessThan(Integer value) {
            addCriterion("vote_item_sn <", value, "voteItemSn");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnLessThanOrEqualTo(Integer value) {
            addCriterion("vote_item_sn <=", value, "voteItemSn");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnIn(List<Integer> values) {
            addCriterion("vote_item_sn in", values, "voteItemSn");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnNotIn(List<Integer> values) {
            addCriterion("vote_item_sn not in", values, "voteItemSn");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnBetween(Integer value1, Integer value2) {
            addCriterion("vote_item_sn between", value1, value2, "voteItemSn");
            return (Criteria) this;
        }

        public Criteria andVoteItemSnNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_item_sn not between", value1, value2, "voteItemSn");
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

        public Criteria andVoteItemNameIsNull() {
            addCriterion("vote_item_name is null");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameIsNotNull() {
            addCriterion("vote_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameEqualTo(String value) {
            addCriterion("vote_item_name =", value, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameNotEqualTo(String value) {
            addCriterion("vote_item_name <>", value, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameGreaterThan(String value) {
            addCriterion("vote_item_name >", value, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("vote_item_name >=", value, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameLessThan(String value) {
            addCriterion("vote_item_name <", value, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameLessThanOrEqualTo(String value) {
            addCriterion("vote_item_name <=", value, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameLike(String value) {
            addCriterion("vote_item_name like", value, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameNotLike(String value) {
            addCriterion("vote_item_name not like", value, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameIn(List<String> values) {
            addCriterion("vote_item_name in", values, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameNotIn(List<String> values) {
            addCriterion("vote_item_name not in", values, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameBetween(String value1, String value2) {
            addCriterion("vote_item_name between", value1, value2, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameNotBetween(String value1, String value2) {
            addCriterion("vote_item_name not between", value1, value2, "voteItemName");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andVoteItemNameLikeInsensitive(String value) {
            addCriterion("upper(vote_item_name) like", value.toUpperCase(), "voteItemName");
            return (Criteria) this;
        }

        public Criteria andPhotoLikeInsensitive(String value) {
            addCriterion("upper(photo) like", value.toUpperCase(), "photo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table voteitem
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
     * This class corresponds to the database table voteitem
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