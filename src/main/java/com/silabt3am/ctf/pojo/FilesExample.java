package com.silabt3am.ctf.pojo;

import java.util.ArrayList;
import java.util.List;

public class FilesExample {
    
    protected String orderByClause;

    
    protected boolean distinct;

   
    protected List<Criteria> oredCriteria;

   
    public FilesExample() {
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

        public Criteria andFilenameIsNull() {
            addCriterion("\"filename\" is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("\"filename\" is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("\"filename\" =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("\"filename\" <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("\"filename\" >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("\"filename\" >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("\"filename\" <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("\"filename\" <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("\"filename\" like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("\"filename\" not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("\"filename\" in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("\"filename\" not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("\"filename\" between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("\"filename\" not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andAddbyIsNull() {
            addCriterion("\"addby\" is null");
            return (Criteria) this;
        }

        public Criteria andAddbyIsNotNull() {
            addCriterion("\"addby\" is not null");
            return (Criteria) this;
        }

        public Criteria andAddbyEqualTo(String value) {
            addCriterion("\"addby\" =", value, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyNotEqualTo(String value) {
            addCriterion("\"addby\" <>", value, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyGreaterThan(String value) {
            addCriterion("\"addby\" >", value, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyGreaterThanOrEqualTo(String value) {
            addCriterion("\"addby\" >=", value, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyLessThan(String value) {
            addCriterion("\"addby\" <", value, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyLessThanOrEqualTo(String value) {
            addCriterion("\"addby\" <=", value, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyLike(String value) {
            addCriterion("\"addby\" like", value, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyNotLike(String value) {
            addCriterion("\"addby\" not like", value, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyIn(List<String> values) {
            addCriterion("\"addby\" in", values, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyNotIn(List<String> values) {
            addCriterion("\"addby\" not in", values, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyBetween(String value1, String value2) {
            addCriterion("\"addby\" between", value1, value2, "addby");
            return (Criteria) this;
        }

        public Criteria andAddbyNotBetween(String value1, String value2) {
            addCriterion("\"addby\" not between", value1, value2, "addby");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("\"size\" is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("\"size\" is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Long value) {
            addCriterion("\"size\" =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Long value) {
            addCriterion("\"size\" <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Long value) {
            addCriterion("\"size\" >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("\"size\" >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Long value) {
            addCriterion("\"size\" <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Long value) {
            addCriterion("\"size\" <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Long> values) {
            addCriterion("\"size\" in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Long> values) {
            addCriterion("\"size\" not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Long value1, Long value2) {
            addCriterion("\"size\" between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Long value1, Long value2) {
            addCriterion("\"size\" not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andMd5IsNull() {
            addCriterion("\"md5\" is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("\"md5\" is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("\"md5\" =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("\"md5\" <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("\"md5\" >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("\"md5\" >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("\"md5\" <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("\"md5\" <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("\"md5\" like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("\"md5\" not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("\"md5\" in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("\"md5\" not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("\"md5\" between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("\"md5\" not between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andChallengeidIsNull() {
            addCriterion("\"challengeid\" is null");
            return (Criteria) this;
        }

        public Criteria andChallengeidIsNotNull() {
            addCriterion("\"challengeid\" is not null");
            return (Criteria) this;
        }

        public Criteria andChallengeidEqualTo(Long value) {
            addCriterion("\"challengeid\" =", value, "challengeid");
            return (Criteria) this;
        }

        public Criteria andChallengeidNotEqualTo(Long value) {
            addCriterion("\"challengeid\" <>", value, "challengeid");
            return (Criteria) this;
        }

        public Criteria andChallengeidGreaterThan(Long value) {
            addCriterion("\"challengeid\" >", value, "challengeid");
            return (Criteria) this;
        }

        public Criteria andChallengeidGreaterThanOrEqualTo(Long value) {
            addCriterion("\"challengeid\" >=", value, "challengeid");
            return (Criteria) this;
        }

        public Criteria andChallengeidLessThan(Long value) {
            addCriterion("\"challengeid\" <", value, "challengeid");
            return (Criteria) this;
        }

        public Criteria andChallengeidLessThanOrEqualTo(Long value) {
            addCriterion("\"challengeid\" <=", value, "challengeid");
            return (Criteria) this;
        }

        public Criteria andChallengeidIn(List<Long> values) {
            addCriterion("\"challengeid\" in", values, "challengeid");
            return (Criteria) this;
        }

        public Criteria andChallengeidNotIn(List<Long> values) {
            addCriterion("\"challengeid\" not in", values, "challengeid");
            return (Criteria) this;
        }

        public Criteria andChallengeidBetween(Long value1, Long value2) {
            addCriterion("\"challengeid\" between", value1, value2, "challengeid");
            return (Criteria) this;
        }

        public Criteria andChallengeidNotBetween(Long value1, Long value2) {
            addCriterion("\"challengeid\" not between", value1, value2, "challengeid");
            return (Criteria) this;
        }

        public Criteria andResindexIsNull() {
            addCriterion("\"resindex\" is null");
            return (Criteria) this;
        }

        public Criteria andResindexIsNotNull() {
            addCriterion("\"resindex\" is not null");
            return (Criteria) this;
        }

        public Criteria andResindexEqualTo(String value) {
            addCriterion("\"resindex\" =", value, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexNotEqualTo(String value) {
            addCriterion("\"resindex\" <>", value, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexGreaterThan(String value) {
            addCriterion("\"resindex\" >", value, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexGreaterThanOrEqualTo(String value) {
            addCriterion("\"resindex\" >=", value, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexLessThan(String value) {
            addCriterion("\"resindex\" <", value, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexLessThanOrEqualTo(String value) {
            addCriterion("\"resindex\" <=", value, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexLike(String value) {
            addCriterion("\"resindex\" like", value, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexNotLike(String value) {
            addCriterion("\"resindex\" not like", value, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexIn(List<String> values) {
            addCriterion("\"resindex\" in", values, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexNotIn(List<String> values) {
            addCriterion("\"resindex\" not in", values, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexBetween(String value1, String value2) {
            addCriterion("\"resindex\" between", value1, value2, "resindex");
            return (Criteria) this;
        }

        public Criteria andResindexNotBetween(String value1, String value2) {
            addCriterion("\"resindex\" not between", value1, value2, "resindex");
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