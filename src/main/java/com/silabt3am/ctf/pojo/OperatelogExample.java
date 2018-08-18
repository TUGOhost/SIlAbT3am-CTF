package com.silabt3am.ctf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperatelogExample {
    
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperatelogExample() {
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

        public Criteria andOperatoridIsNull() {
            addCriterion("\"operatorid\" is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("\"operatorid\" is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(Long value) {
            addCriterion("\"operatorid\" =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(Long value) {
            addCriterion("\"operatorid\" <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(Long value) {
            addCriterion("\"operatorid\" >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(Long value) {
            addCriterion("\"operatorid\" >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(Long value) {
            addCriterion("\"operatorid\" <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(Long value) {
            addCriterion("\"operatorid\" <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<Long> values) {
            addCriterion("\"operatorid\" in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<Long> values) {
            addCriterion("\"operatorid\" not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(Long value1, Long value2) {
            addCriterion("\"operatorid\" between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(Long value1, Long value2) {
            addCriterion("\"operatorid\" not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatefuncIsNull() {
            addCriterion("\"operatefunc\" is null");
            return (Criteria) this;
        }

        public Criteria andOperatefuncIsNotNull() {
            addCriterion("\"operatefunc\" is not null");
            return (Criteria) this;
        }

        public Criteria andOperatefuncEqualTo(String value) {
            addCriterion("\"operatefunc\" =", value, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncNotEqualTo(String value) {
            addCriterion("\"operatefunc\" <>", value, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncGreaterThan(String value) {
            addCriterion("\"operatefunc\" >", value, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncGreaterThanOrEqualTo(String value) {
            addCriterion("\"operatefunc\" >=", value, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncLessThan(String value) {
            addCriterion("\"operatefunc\" <", value, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncLessThanOrEqualTo(String value) {
            addCriterion("\"operatefunc\" <=", value, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncLike(String value) {
            addCriterion("\"operatefunc\" like", value, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncNotLike(String value) {
            addCriterion("\"operatefunc\" not like", value, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncIn(List<String> values) {
            addCriterion("\"operatefunc\" in", values, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncNotIn(List<String> values) {
            addCriterion("\"operatefunc\" not in", values, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncBetween(String value1, String value2) {
            addCriterion("\"operatefunc\" between", value1, value2, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatefuncNotBetween(String value1, String value2) {
            addCriterion("\"operatefunc\" not between", value1, value2, "operatefunc");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNull() {
            addCriterion("\"operatetime\" is null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNotNull() {
            addCriterion("\"operatetime\" is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeEqualTo(Date value) {
            addCriterion("\"operatetime\" =", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotEqualTo(Date value) {
            addCriterion("\"operatetime\" <>", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThan(Date value) {
            addCriterion("\"operatetime\" >", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"operatetime\" >=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThan(Date value) {
            addCriterion("\"operatetime\" <", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThanOrEqualTo(Date value) {
            addCriterion("\"operatetime\" <=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIn(List<Date> values) {
            addCriterion("\"operatetime\" in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotIn(List<Date> values) {
            addCriterion("\"operatetime\" not in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeBetween(Date value1, Date value2) {
            addCriterion("\"operatetime\" between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotBetween(Date value1, Date value2) {
            addCriterion("\"operatetime\" not between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNull() {
            addCriterion("\"ipaddr\" is null");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNotNull() {
            addCriterion("\"ipaddr\" is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddrEqualTo(String value) {
            addCriterion("\"ipaddr\" =", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotEqualTo(String value) {
            addCriterion("\"ipaddr\" <>", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThan(String value) {
            addCriterion("\"ipaddr\" >", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("\"ipaddr\" >=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThan(String value) {
            addCriterion("\"ipaddr\" <", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThanOrEqualTo(String value) {
            addCriterion("\"ipaddr\" <=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLike(String value) {
            addCriterion("\"ipaddr\" like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotLike(String value) {
            addCriterion("\"ipaddr\" not like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrIn(List<String> values) {
            addCriterion("\"ipaddr\" in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotIn(List<String> values) {
            addCriterion("\"ipaddr\" not in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrBetween(String value1, String value2) {
            addCriterion("\"ipaddr\" between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotBetween(String value1, String value2) {
            addCriterion("\"ipaddr\" not between", value1, value2, "ipaddr");
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