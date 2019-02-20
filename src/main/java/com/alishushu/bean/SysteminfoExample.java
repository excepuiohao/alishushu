package com.alishushu.bean;

import java.util.ArrayList;
import java.util.List;

public class SysteminfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysteminfoExample() {
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

        public Criteria andSysteminfoidIsNull() {
            addCriterion("SYSTEMINFOID is null");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidIsNotNull() {
            addCriterion("SYSTEMINFOID is not null");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidEqualTo(String value) {
            addCriterion("SYSTEMINFOID =", value, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidNotEqualTo(String value) {
            addCriterion("SYSTEMINFOID <>", value, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidGreaterThan(String value) {
            addCriterion("SYSTEMINFOID >", value, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEMINFOID >=", value, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidLessThan(String value) {
            addCriterion("SYSTEMINFOID <", value, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidLessThanOrEqualTo(String value) {
            addCriterion("SYSTEMINFOID <=", value, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidLike(String value) {
            addCriterion("SYSTEMINFOID like", value, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidNotLike(String value) {
            addCriterion("SYSTEMINFOID not like", value, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidIn(List<String> values) {
            addCriterion("SYSTEMINFOID in", values, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidNotIn(List<String> values) {
            addCriterion("SYSTEMINFOID not in", values, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidBetween(String value1, String value2) {
            addCriterion("SYSTEMINFOID between", value1, value2, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andSysteminfoidNotBetween(String value1, String value2) {
            addCriterion("SYSTEMINFOID not between", value1, value2, "systeminfoid");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNull() {
            addCriterion("RELEASEDATE is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("RELEASEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(String value) {
            addCriterion("RELEASEDATE =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(String value) {
            addCriterion("RELEASEDATE <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(String value) {
            addCriterion("RELEASEDATE >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASEDATE >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(String value) {
            addCriterion("RELEASEDATE <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(String value) {
            addCriterion("RELEASEDATE <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLike(String value) {
            addCriterion("RELEASEDATE like", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotLike(String value) {
            addCriterion("RELEASEDATE not like", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<String> values) {
            addCriterion("RELEASEDATE in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<String> values) {
            addCriterion("RELEASEDATE not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(String value1, String value2) {
            addCriterion("RELEASEDATE between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(String value1, String value2) {
            addCriterion("RELEASEDATE not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextIsNull() {
            addCriterion("SYSINFOCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextIsNotNull() {
            addCriterion("SYSINFOCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextEqualTo(String value) {
            addCriterion("SYSINFOCONTEXT =", value, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextNotEqualTo(String value) {
            addCriterion("SYSINFOCONTEXT <>", value, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextGreaterThan(String value) {
            addCriterion("SYSINFOCONTEXT >", value, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextGreaterThanOrEqualTo(String value) {
            addCriterion("SYSINFOCONTEXT >=", value, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextLessThan(String value) {
            addCriterion("SYSINFOCONTEXT <", value, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextLessThanOrEqualTo(String value) {
            addCriterion("SYSINFOCONTEXT <=", value, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextLike(String value) {
            addCriterion("SYSINFOCONTEXT like", value, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextNotLike(String value) {
            addCriterion("SYSINFOCONTEXT not like", value, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextIn(List<String> values) {
            addCriterion("SYSINFOCONTEXT in", values, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextNotIn(List<String> values) {
            addCriterion("SYSINFOCONTEXT not in", values, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextBetween(String value1, String value2) {
            addCriterion("SYSINFOCONTEXT between", value1, value2, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andSysinfocontextNotBetween(String value1, String value2) {
            addCriterion("SYSINFOCONTEXT not between", value1, value2, "sysinfocontext");
            return (Criteria) this;
        }

        public Criteria andManageridIsNull() {
            addCriterion("MANAGERID is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("MANAGERID is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(String value) {
            addCriterion("MANAGERID =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(String value) {
            addCriterion("MANAGERID <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(String value) {
            addCriterion("MANAGERID >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGERID >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(String value) {
            addCriterion("MANAGERID <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(String value) {
            addCriterion("MANAGERID <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLike(String value) {
            addCriterion("MANAGERID like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotLike(String value) {
            addCriterion("MANAGERID not like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<String> values) {
            addCriterion("MANAGERID in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<String> values) {
            addCriterion("MANAGERID not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(String value1, String value2) {
            addCriterion("MANAGERID between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(String value1, String value2) {
            addCriterion("MANAGERID not between", value1, value2, "managerid");
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