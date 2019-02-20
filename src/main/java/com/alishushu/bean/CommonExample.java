package com.alishushu.bean;

import java.util.ArrayList;
import java.util.List;

public class CommonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonExample() {
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

        public Criteria andCommonidIsNull() {
            addCriterion("COMMONID is null");
            return (Criteria) this;
        }

        public Criteria andCommonidIsNotNull() {
            addCriterion("COMMONID is not null");
            return (Criteria) this;
        }

        public Criteria andCommonidEqualTo(String value) {
            addCriterion("COMMONID =", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidNotEqualTo(String value) {
            addCriterion("COMMONID <>", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidGreaterThan(String value) {
            addCriterion("COMMONID >", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidGreaterThanOrEqualTo(String value) {
            addCriterion("COMMONID >=", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidLessThan(String value) {
            addCriterion("COMMONID <", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidLessThanOrEqualTo(String value) {
            addCriterion("COMMONID <=", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidLike(String value) {
            addCriterion("COMMONID like", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidNotLike(String value) {
            addCriterion("COMMONID not like", value, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidIn(List<String> values) {
            addCriterion("COMMONID in", values, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidNotIn(List<String> values) {
            addCriterion("COMMONID not in", values, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidBetween(String value1, String value2) {
            addCriterion("COMMONID between", value1, value2, "commonid");
            return (Criteria) this;
        }

        public Criteria andCommonidNotBetween(String value1, String value2) {
            addCriterion("COMMONID not between", value1, value2, "commonid");
            return (Criteria) this;
        }

        public Criteria andShopsidIsNull() {
            addCriterion("SHOPSID is null");
            return (Criteria) this;
        }

        public Criteria andShopsidIsNotNull() {
            addCriterion("SHOPSID is not null");
            return (Criteria) this;
        }

        public Criteria andShopsidEqualTo(String value) {
            addCriterion("SHOPSID =", value, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidNotEqualTo(String value) {
            addCriterion("SHOPSID <>", value, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidGreaterThan(String value) {
            addCriterion("SHOPSID >", value, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidGreaterThanOrEqualTo(String value) {
            addCriterion("SHOPSID >=", value, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidLessThan(String value) {
            addCriterion("SHOPSID <", value, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidLessThanOrEqualTo(String value) {
            addCriterion("SHOPSID <=", value, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidLike(String value) {
            addCriterion("SHOPSID like", value, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidNotLike(String value) {
            addCriterion("SHOPSID not like", value, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidIn(List<String> values) {
            addCriterion("SHOPSID in", values, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidNotIn(List<String> values) {
            addCriterion("SHOPSID not in", values, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidBetween(String value1, String value2) {
            addCriterion("SHOPSID between", value1, value2, "shopsid");
            return (Criteria) this;
        }

        public Criteria andShopsidNotBetween(String value1, String value2) {
            addCriterion("SHOPSID not between", value1, value2, "shopsid");
            return (Criteria) this;
        }

        public Criteria andCommcontextIsNull() {
            addCriterion("COMMCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andCommcontextIsNotNull() {
            addCriterion("COMMCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andCommcontextEqualTo(String value) {
            addCriterion("COMMCONTEXT =", value, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextNotEqualTo(String value) {
            addCriterion("COMMCONTEXT <>", value, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextGreaterThan(String value) {
            addCriterion("COMMCONTEXT >", value, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextGreaterThanOrEqualTo(String value) {
            addCriterion("COMMCONTEXT >=", value, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextLessThan(String value) {
            addCriterion("COMMCONTEXT <", value, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextLessThanOrEqualTo(String value) {
            addCriterion("COMMCONTEXT <=", value, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextLike(String value) {
            addCriterion("COMMCONTEXT like", value, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextNotLike(String value) {
            addCriterion("COMMCONTEXT not like", value, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextIn(List<String> values) {
            addCriterion("COMMCONTEXT in", values, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextNotIn(List<String> values) {
            addCriterion("COMMCONTEXT not in", values, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextBetween(String value1, String value2) {
            addCriterion("COMMCONTEXT between", value1, value2, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommcontextNotBetween(String value1, String value2) {
            addCriterion("COMMCONTEXT not between", value1, value2, "commcontext");
            return (Criteria) this;
        }

        public Criteria andCommtimeIsNull() {
            addCriterion("COMMTIME is null");
            return (Criteria) this;
        }

        public Criteria andCommtimeIsNotNull() {
            addCriterion("COMMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCommtimeEqualTo(String value) {
            addCriterion("COMMTIME =", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotEqualTo(String value) {
            addCriterion("COMMTIME <>", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeGreaterThan(String value) {
            addCriterion("COMMTIME >", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMTIME >=", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeLessThan(String value) {
            addCriterion("COMMTIME <", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeLessThanOrEqualTo(String value) {
            addCriterion("COMMTIME <=", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeLike(String value) {
            addCriterion("COMMTIME like", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotLike(String value) {
            addCriterion("COMMTIME not like", value, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeIn(List<String> values) {
            addCriterion("COMMTIME in", values, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotIn(List<String> values) {
            addCriterion("COMMTIME not in", values, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeBetween(String value1, String value2) {
            addCriterion("COMMTIME between", value1, value2, "commtime");
            return (Criteria) this;
        }

        public Criteria andCommtimeNotBetween(String value1, String value2) {
            addCriterion("COMMTIME not between", value1, value2, "commtime");
            return (Criteria) this;
        }

        public Criteria andMorecommIsNull() {
            addCriterion("MORECOMM is null");
            return (Criteria) this;
        }

        public Criteria andMorecommIsNotNull() {
            addCriterion("MORECOMM is not null");
            return (Criteria) this;
        }

        public Criteria andMorecommEqualTo(String value) {
            addCriterion("MORECOMM =", value, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommNotEqualTo(String value) {
            addCriterion("MORECOMM <>", value, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommGreaterThan(String value) {
            addCriterion("MORECOMM >", value, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommGreaterThanOrEqualTo(String value) {
            addCriterion("MORECOMM >=", value, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommLessThan(String value) {
            addCriterion("MORECOMM <", value, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommLessThanOrEqualTo(String value) {
            addCriterion("MORECOMM <=", value, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommLike(String value) {
            addCriterion("MORECOMM like", value, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommNotLike(String value) {
            addCriterion("MORECOMM not like", value, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommIn(List<String> values) {
            addCriterion("MORECOMM in", values, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommNotIn(List<String> values) {
            addCriterion("MORECOMM not in", values, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommBetween(String value1, String value2) {
            addCriterion("MORECOMM between", value1, value2, "morecomm");
            return (Criteria) this;
        }

        public Criteria andMorecommNotBetween(String value1, String value2) {
            addCriterion("MORECOMM not between", value1, value2, "morecomm");
            return (Criteria) this;
        }

        public Criteria andLevelsIsNull() {
            addCriterion("LEVELS is null");
            return (Criteria) this;
        }

        public Criteria andLevelsIsNotNull() {
            addCriterion("LEVELS is not null");
            return (Criteria) this;
        }

        public Criteria andLevelsEqualTo(String value) {
            addCriterion("LEVELS =", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotEqualTo(String value) {
            addCriterion("LEVELS <>", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsGreaterThan(String value) {
            addCriterion("LEVELS >", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsGreaterThanOrEqualTo(String value) {
            addCriterion("LEVELS >=", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsLessThan(String value) {
            addCriterion("LEVELS <", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsLessThanOrEqualTo(String value) {
            addCriterion("LEVELS <=", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsLike(String value) {
            addCriterion("LEVELS like", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotLike(String value) {
            addCriterion("LEVELS not like", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsIn(List<String> values) {
            addCriterion("LEVELS in", values, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotIn(List<String> values) {
            addCriterion("LEVELS not in", values, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsBetween(String value1, String value2) {
            addCriterion("LEVELS between", value1, value2, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotBetween(String value1, String value2) {
            addCriterion("LEVELS not between", value1, value2, "levels");
            return (Criteria) this;
        }

        public Criteria andUsersidIsNull() {
            addCriterion("USERSID is null");
            return (Criteria) this;
        }

        public Criteria andUsersidIsNotNull() {
            addCriterion("USERSID is not null");
            return (Criteria) this;
        }

        public Criteria andUsersidEqualTo(String value) {
            addCriterion("USERSID =", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotEqualTo(String value) {
            addCriterion("USERSID <>", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidGreaterThan(String value) {
            addCriterion("USERSID >", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidGreaterThanOrEqualTo(String value) {
            addCriterion("USERSID >=", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidLessThan(String value) {
            addCriterion("USERSID <", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidLessThanOrEqualTo(String value) {
            addCriterion("USERSID <=", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidLike(String value) {
            addCriterion("USERSID like", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotLike(String value) {
            addCriterion("USERSID not like", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidIn(List<String> values) {
            addCriterion("USERSID in", values, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotIn(List<String> values) {
            addCriterion("USERSID not in", values, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidBetween(String value1, String value2) {
            addCriterion("USERSID between", value1, value2, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotBetween(String value1, String value2) {
            addCriterion("USERSID not between", value1, value2, "usersid");
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