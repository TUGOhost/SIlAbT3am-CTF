package com.silabt3am.ctf.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConfigExample {
    
    protected String orderByClause;

 
    protected boolean distinct;


    protected List<Criteria> oredCriteria;


    public ConfigExample() {
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

        public Criteria andVarnameIsNull() {
            addCriterion("\"varname\" is null");
            return (Criteria) this;
        }

        public Criteria andVarnameIsNotNull() {
            addCriterion("\"varname\" is not null");
            return (Criteria) this;
        }

        public Criteria andVarnameEqualTo(String value) {
            addCriterion("\"varname\" =", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameNotEqualTo(String value) {
            addCriterion("\"varname\" <>", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameGreaterThan(String value) {
            addCriterion("\"varname\" >", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameGreaterThanOrEqualTo(String value) {
            addCriterion("\"varname\" >=", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameLessThan(String value) {
            addCriterion("\"varname\" <", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameLessThanOrEqualTo(String value) {
            addCriterion("\"varname\" <=", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameLike(String value) {
            addCriterion("\"varname\" like", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameNotLike(String value) {
            addCriterion("\"varname\" not like", value, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameIn(List<String> values) {
            addCriterion("\"varname\" in", values, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameNotIn(List<String> values) {
            addCriterion("\"varname\" not in", values, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameBetween(String value1, String value2) {
            addCriterion("\"varname\" between", value1, value2, "varname");
            return (Criteria) this;
        }

        public Criteria andVarnameNotBetween(String value1, String value2) {
            addCriterion("\"varname\" not between", value1, value2, "varname");
            return (Criteria) this;
        }

        public Criteria andVarvalueIsNull() {
            addCriterion("\"varvalue\" is null");
            return (Criteria) this;
        }

        public Criteria andVarvalueIsNotNull() {
            addCriterion("\"varvalue\" is not null");
            return (Criteria) this;
        }

        public Criteria andVarvalueEqualTo(String value) {
            addCriterion("\"varvalue\" =", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueNotEqualTo(String value) {
            addCriterion("\"varvalue\" <>", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueGreaterThan(String value) {
            addCriterion("\"varvalue\" >", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueGreaterThanOrEqualTo(String value) {
            addCriterion("\"varvalue\" >=", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueLessThan(String value) {
            addCriterion("\"varvalue\" <", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueLessThanOrEqualTo(String value) {
            addCriterion("\"varvalue\" <=", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueLike(String value) {
            addCriterion("\"varvalue\" like", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueNotLike(String value) {
            addCriterion("\"varvalue\" not like", value, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueIn(List<String> values) {
            addCriterion("\"varvalue\" in", values, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueNotIn(List<String> values) {
            addCriterion("\"varvalue\" not in", values, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueBetween(String value1, String value2) {
            addCriterion("\"varvalue\" between", value1, value2, "varvalue");
            return (Criteria) this;
        }

        public Criteria andVarvalueNotBetween(String value1, String value2) {
            addCriterion("\"varvalue\" not between", value1, value2, "varvalue");
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