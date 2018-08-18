package com.silabt3am.ctf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    
    protected String orderByClause;

 
    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("\"username\" is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("\"username\" is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("\"username\" =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("\"username\" <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("\"username\" >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("\"username\" >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("\"username\" <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("\"username\" <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("\"username\" like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("\"username\" not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("\"username\" in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("\"username\" not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("\"username\" between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("\"username\" not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("\"password\" is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("\"password\" is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("\"password\" =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("\"password\" <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("\"password\" >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("\"password\" >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("\"password\" <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("\"password\" <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("\"password\" like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("\"password\" not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("\"password\" in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("\"password\" not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("\"password\" between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("\"password\" not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("\"email\" is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("\"email\" is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("\"email\" =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("\"email\" <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("\"email\" >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("\"email\" >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("\"email\" <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("\"email\" <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("\"email\" like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("\"email\" not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("\"email\" in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("\"email\" not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("\"email\" between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("\"email\" not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("\"phone\" is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("\"phone\" is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("\"phone\" =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("\"phone\" <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("\"phone\" >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("\"phone\" >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("\"phone\" <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("\"phone\" <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("\"phone\" like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("\"phone\" not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("\"phone\" in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("\"phone\" not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("\"phone\" between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("\"phone\" not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("\"organization\" is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("\"organization\" is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("\"organization\" =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("\"organization\" <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("\"organization\" >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("\"organization\" >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("\"organization\" <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("\"organization\" <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("\"organization\" like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("\"organization\" not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("\"organization\" in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("\"organization\" not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("\"organization\" between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("\"organization\" not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNull() {
            addCriterion("\"countryid\" is null");
            return (Criteria) this;
        }

        public Criteria andCountryidIsNotNull() {
            addCriterion("\"countryid\" is not null");
            return (Criteria) this;
        }

        public Criteria andCountryidEqualTo(Long value) {
            addCriterion("\"countryid\" =", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotEqualTo(Long value) {
            addCriterion("\"countryid\" <>", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThan(Long value) {
            addCriterion("\"countryid\" >", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidGreaterThanOrEqualTo(Long value) {
            addCriterion("\"countryid\" >=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThan(Long value) {
            addCriterion("\"countryid\" <", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidLessThanOrEqualTo(Long value) {
            addCriterion("\"countryid\" <=", value, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidIn(List<Long> values) {
            addCriterion("\"countryid\" in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotIn(List<Long> values) {
            addCriterion("\"countryid\" not in", values, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidBetween(Long value1, Long value2) {
            addCriterion("\"countryid\" between", value1, value2, "countryid");
            return (Criteria) this;
        }

        public Criteria andCountryidNotBetween(Long value1, Long value2) {
            addCriterion("\"countryid\" not between", value1, value2, "countryid");
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

        public Criteria andIsenabledIsNull() {
            addCriterion("\"isenabled\" is null");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNotNull() {
            addCriterion("\"isenabled\" is not null");
            return (Criteria) this;
        }

        public Criteria andIsenabledEqualTo(Boolean value) {
            addCriterion("\"isenabled\" =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(Boolean value) {
            addCriterion("\"isenabled\" <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(Boolean value) {
            addCriterion("\"isenabled\" >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("\"isenabled\" >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(Boolean value) {
            addCriterion("\"isenabled\" <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("\"isenabled\" <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<Boolean> values) {
            addCriterion("\"isenabled\" in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<Boolean> values) {
            addCriterion("\"isenabled\" not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isenabled\" between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("\"isenabled\" not between", value1, value2, "isenabled");
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

        public Criteria andTokenIsNull() {
            addCriterion("\"token\" is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("\"token\" is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("\"token\" =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("\"token\" <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("\"token\" >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("\"token\" >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("\"token\" <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("\"token\" <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("\"token\" like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("\"token\" not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("\"token\" in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("\"token\" not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("\"token\" between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("\"token\" not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("\"salt\" is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("\"salt\" is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("\"salt\" =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("\"salt\" <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("\"salt\" >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("\"salt\" >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("\"salt\" <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("\"salt\" <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("\"salt\" like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("\"salt\" not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("\"salt\" in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("\"salt\" not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("\"salt\" between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("\"salt\" not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("\"regtime\" is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("\"regtime\" is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Date value) {
            addCriterion("\"regtime\" =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Date value) {
            addCriterion("\"regtime\" <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Date value) {
            addCriterion("\"regtime\" >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"regtime\" >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Date value) {
            addCriterion("\"regtime\" <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("\"regtime\" <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Date> values) {
            addCriterion("\"regtime\" in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Date> values) {
            addCriterion("\"regtime\" not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Date value1, Date value2) {
            addCriterion("\"regtime\" between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("\"regtime\" not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andLastactiveIsNull() {
            addCriterion("\"lastactive\" is null");
            return (Criteria) this;
        }

        public Criteria andLastactiveIsNotNull() {
            addCriterion("\"lastactive\" is not null");
            return (Criteria) this;
        }

        public Criteria andLastactiveEqualTo(Date value) {
            addCriterion("\"lastactive\" =", value, "lastactive");
            return (Criteria) this;
        }

        public Criteria andLastactiveNotEqualTo(Date value) {
            addCriterion("\"lastactive\" <>", value, "lastactive");
            return (Criteria) this;
        }

        public Criteria andLastactiveGreaterThan(Date value) {
            addCriterion("\"lastactive\" >", value, "lastactive");
            return (Criteria) this;
        }

        public Criteria andLastactiveGreaterThanOrEqualTo(Date value) {
            addCriterion("\"lastactive\" >=", value, "lastactive");
            return (Criteria) this;
        }

        public Criteria andLastactiveLessThan(Date value) {
            addCriterion("\"lastactive\" <", value, "lastactive");
            return (Criteria) this;
        }

        public Criteria andLastactiveLessThanOrEqualTo(Date value) {
            addCriterion("\"lastactive\" <=", value, "lastactive");
            return (Criteria) this;
        }

        public Criteria andLastactiveIn(List<Date> values) {
            addCriterion("\"lastactive\" in", values, "lastactive");
            return (Criteria) this;
        }

        public Criteria andLastactiveNotIn(List<Date> values) {
            addCriterion("\"lastactive\" not in", values, "lastactive");
            return (Criteria) this;
        }

        public Criteria andLastactiveBetween(Date value1, Date value2) {
            addCriterion("\"lastactive\" between", value1, value2, "lastactive");
            return (Criteria) this;
        }

        public Criteria andLastactiveNotBetween(Date value1, Date value2) {
            addCriterion("\"lastactive\" not between", value1, value2, "lastactive");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("\"role\" is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("\"role\" is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("\"role\" =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("\"role\" <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("\"role\" >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("\"role\" >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("\"role\" <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("\"role\" <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("\"role\" like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("\"role\" not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("\"role\" in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("\"role\" not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("\"role\" between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("\"role\" not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNull() {
            addCriterion("\"teamid\" is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("\"teamid\" is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(Long value) {
            addCriterion("\"teamid\" =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(Long value) {
            addCriterion("\"teamid\" <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(Long value) {
            addCriterion("\"teamid\" >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(Long value) {
            addCriterion("\"teamid\" >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(Long value) {
            addCriterion("\"teamid\" <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(Long value) {
            addCriterion("\"teamid\" <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<Long> values) {
            addCriterion("\"teamid\" in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<Long> values) {
            addCriterion("\"teamid\" not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(Long value1, Long value2) {
            addCriterion("\"teamid\" between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(Long value1, Long value2) {
            addCriterion("\"teamid\" not between", value1, value2, "teamid");
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