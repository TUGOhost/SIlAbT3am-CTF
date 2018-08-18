package com.silabt3am.ctf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChallengesExample {
    
    protected String orderByClause;

   
    protected boolean distinct;


    protected List<Criteria> oredCriteria;

    
    public ChallengesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    
    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

   
    public boolean isDistinct() {
        return distinct;
    }

   
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

   
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    
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

        public Criteria andIdIsNull() {
            addCriterion("\"id\" is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("\"id\" is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("\"id\" =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("\"id\" <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("\"id\" >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"id\" >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("\"id\" <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("\"id\" <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("\"id\" in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("\"id\" not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("\"id\" between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("\"id\" not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("\"title\" is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("\"title\" is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("\"title\" =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("\"title\" <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("\"title\" >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("\"title\" >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("\"title\" <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("\"title\" <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("\"title\" like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("\"title\" not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("\"title\" in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("\"title\" not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("\"title\" between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("\"title\" not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("\"description\" is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("\"description\" is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("\"description\" =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("\"description\" <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("\"description\" >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("\"description\" >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("\"description\" <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("\"description\" <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("\"description\" like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("\"description\" not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("\"description\" in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("\"description\" not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("\"description\" between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("\"description\" not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andAttachidsIsNull() {
            addCriterion("\"attachids\" is null");
            return (Criteria) this;
        }

        public Criteria andAttachidsIsNotNull() {
            addCriterion("\"attachids\" is not null");
            return (Criteria) this;
        }

        public Criteria andAttachidsEqualTo(String value) {
            addCriterion("\"attachids\" =", value, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsNotEqualTo(String value) {
            addCriterion("\"attachids\" <>", value, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsGreaterThan(String value) {
            addCriterion("\"attachids\" >", value, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsGreaterThanOrEqualTo(String value) {
            addCriterion("\"attachids\" >=", value, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsLessThan(String value) {
            addCriterion("\"attachids\" <", value, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsLessThanOrEqualTo(String value) {
            addCriterion("\"attachids\" <=", value, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsLike(String value) {
            addCriterion("\"attachids\" like", value, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsNotLike(String value) {
            addCriterion("\"attachids\" not like", value, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsIn(List<String> values) {
            addCriterion("\"attachids\" in", values, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsNotIn(List<String> values) {
            addCriterion("\"attachids\" not in", values, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsBetween(String value1, String value2) {
            addCriterion("\"attachids\" between", value1, value2, "attachids");
            return (Criteria) this;
        }

        public Criteria andAttachidsNotBetween(String value1, String value2) {
            addCriterion("\"attachids\" not between", value1, value2, "attachids");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("\"score\" is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("\"score\" is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Long value) {
            addCriterion("\"score\" =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Long value) {
            addCriterion("\"score\" <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Long value) {
            addCriterion("\"score\" >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("\"score\" >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Long value) {
            addCriterion("\"score\" <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Long value) {
            addCriterion("\"score\" <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Long> values) {
            addCriterion("\"score\" in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Long> values) {
            addCriterion("\"score\" not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Long value1, Long value2) {
            addCriterion("\"score\" between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Long value1, Long value2) {
            addCriterion("\"score\" not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("\"categoryid\" is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("\"categoryid\" is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Long value) {
            addCriterion("\"categoryid\" =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Long value) {
            addCriterion("\"categoryid\" <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Long value) {
            addCriterion("\"categoryid\" >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("\"categoryid\" >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Long value) {
            addCriterion("\"categoryid\" <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Long value) {
            addCriterion("\"categoryid\" <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Long> values) {
            addCriterion("\"categoryid\" in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Long> values) {
            addCriterion("\"categoryid\" not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Long value1, Long value2) {
            addCriterion("\"categoryid\" between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Long value1, Long value2) {
            addCriterion("\"categoryid\" not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("\"flag\" is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("\"flag\" is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("\"flag\" =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("\"flag\" <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("\"flag\" >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("\"flag\" >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("\"flag\" <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("\"flag\" <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("\"flag\" like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("\"flag\" not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("\"flag\" in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("\"flag\" not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("\"flag\" between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("\"flag\" not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andExposedIsNull() {
            addCriterion("\"exposed\" is null");
            return (Criteria) this;
        }

        public Criteria andExposedIsNotNull() {
            addCriterion("\"exposed\" is not null");
            return (Criteria) this;
        }

        public Criteria andExposedEqualTo(Boolean value) {
            addCriterion("\"exposed\" =", value, "exposed");
            return (Criteria) this;
        }

        public Criteria andExposedNotEqualTo(Boolean value) {
            addCriterion("\"exposed\" <>", value, "exposed");
            return (Criteria) this;
        }

        public Criteria andExposedGreaterThan(Boolean value) {
            addCriterion("\"exposed\" >", value, "exposed");
            return (Criteria) this;
        }

        public Criteria andExposedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("\"exposed\" >=", value, "exposed");
            return (Criteria) this;
        }

        public Criteria andExposedLessThan(Boolean value) {
            addCriterion("\"exposed\" <", value, "exposed");
            return (Criteria) this;
        }

        public Criteria andExposedLessThanOrEqualTo(Boolean value) {
            addCriterion("\"exposed\" <=", value, "exposed");
            return (Criteria) this;
        }

        public Criteria andExposedIn(List<Boolean> values) {
            addCriterion("\"exposed\" in", values, "exposed");
            return (Criteria) this;
        }

        public Criteria andExposedNotIn(List<Boolean> values) {
            addCriterion("\"exposed\" not in", values, "exposed");
            return (Criteria) this;
        }

        public Criteria andExposedBetween(Boolean value1, Boolean value2) {
            addCriterion("\"exposed\" between", value1, value2, "exposed");
            return (Criteria) this;
        }

        public Criteria andExposedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("\"exposed\" not between", value1, value2, "exposed");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("\"available\" is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("\"available\" is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(Date value) {
            addCriterion("\"available\" =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(Date value) {
            addCriterion("\"available\" <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(Date value) {
            addCriterion("\"available\" >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(Date value) {
            addCriterion("\"available\" >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(Date value) {
            addCriterion("\"available\" <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(Date value) {
            addCriterion("\"available\" <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<Date> values) {
            addCriterion("\"available\" in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<Date> values) {
            addCriterion("\"available\" not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(Date value1, Date value2) {
            addCriterion("\"available\" between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(Date value1, Date value2) {
            addCriterion("\"available\" not between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andInvalidateIsNull() {
            addCriterion("\"invalidate\" is null");
            return (Criteria) this;
        }

        public Criteria andInvalidateIsNotNull() {
            addCriterion("\"invalidate\" is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidateEqualTo(Date value) {
            addCriterion("\"invalidate\" =", value, "invalidate");
            return (Criteria) this;
        }

        public Criteria andInvalidateNotEqualTo(Date value) {
            addCriterion("\"invalidate\" <>", value, "invalidate");
            return (Criteria) this;
        }

        public Criteria andInvalidateGreaterThan(Date value) {
            addCriterion("\"invalidate\" >", value, "invalidate");
            return (Criteria) this;
        }

        public Criteria andInvalidateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"invalidate\" >=", value, "invalidate");
            return (Criteria) this;
        }

        public Criteria andInvalidateLessThan(Date value) {
            addCriterion("\"invalidate\" <", value, "invalidate");
            return (Criteria) this;
        }

        public Criteria andInvalidateLessThanOrEqualTo(Date value) {
            addCriterion("\"invalidate\" <=", value, "invalidate");
            return (Criteria) this;
        }

        public Criteria andInvalidateIn(List<Date> values) {
            addCriterion("\"invalidate\" in", values, "invalidate");
            return (Criteria) this;
        }

        public Criteria andInvalidateNotIn(List<Date> values) {
            addCriterion("\"invalidate\" not in", values, "invalidate");
            return (Criteria) this;
        }

        public Criteria andInvalidateBetween(Date value1, Date value2) {
            addCriterion("\"invalidate\" between", value1, value2, "invalidate");
            return (Criteria) this;
        }

        public Criteria andInvalidateNotBetween(Date value1, Date value2) {
            addCriterion("\"invalidate\" not between", value1, value2, "invalidate");
            return (Criteria) this;
        }

        public Criteria andWatchbyIsNull() {
            addCriterion("\"watchby\" is null");
            return (Criteria) this;
        }

        public Criteria andWatchbyIsNotNull() {
            addCriterion("\"watchby\" is not null");
            return (Criteria) this;
        }

        public Criteria andWatchbyEqualTo(String value) {
            addCriterion("\"watchby\" =", value, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyNotEqualTo(String value) {
            addCriterion("\"watchby\" <>", value, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyGreaterThan(String value) {
            addCriterion("\"watchby\" >", value, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyGreaterThanOrEqualTo(String value) {
            addCriterion("\"watchby\" >=", value, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyLessThan(String value) {
            addCriterion("\"watchby\" <", value, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyLessThanOrEqualTo(String value) {
            addCriterion("\"watchby\" <=", value, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyLike(String value) {
            addCriterion("\"watchby\" like", value, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyNotLike(String value) {
            addCriterion("\"watchby\" not like", value, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyIn(List<String> values) {
            addCriterion("\"watchby\" in", values, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyNotIn(List<String> values) {
            addCriterion("\"watchby\" not in", values, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyBetween(String value1, String value2) {
            addCriterion("\"watchby\" between", value1, value2, "watchby");
            return (Criteria) this;
        }

        public Criteria andWatchbyNotBetween(String value1, String value2) {
            addCriterion("\"watchby\" not between", value1, value2, "watchby");
            return (Criteria) this;
        }
    }


    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

 
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