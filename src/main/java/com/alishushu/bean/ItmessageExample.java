package com.alishushu.bean;

import java.util.ArrayList;
import java.util.List;

public class ItmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItmessageExample() {
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

        public Criteria andMessageidIsNull() {
            addCriterion("MESSAGEID is null");
            return (Criteria) this;
        }

        public Criteria andMessageidIsNotNull() {
            addCriterion("MESSAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageidEqualTo(String value) {
            addCriterion("MESSAGEID =", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotEqualTo(String value) {
            addCriterion("MESSAGEID <>", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThan(String value) {
            addCriterion("MESSAGEID >", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGEID >=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThan(String value) {
            addCriterion("MESSAGEID <", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLessThanOrEqualTo(String value) {
            addCriterion("MESSAGEID <=", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidLike(String value) {
            addCriterion("MESSAGEID like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotLike(String value) {
            addCriterion("MESSAGEID not like", value, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidIn(List<String> values) {
            addCriterion("MESSAGEID in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotIn(List<String> values) {
            addCriterion("MESSAGEID not in", values, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidBetween(String value1, String value2) {
            addCriterion("MESSAGEID between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andMessageidNotBetween(String value1, String value2) {
            addCriterion("MESSAGEID not between", value1, value2, "messageid");
            return (Criteria) this;
        }

        public Criteria andFromidIsNull() {
            addCriterion("FROMID is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("FROMID is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(String value) {
            addCriterion("FROMID =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(String value) {
            addCriterion("FROMID <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(String value) {
            addCriterion("FROMID >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(String value) {
            addCriterion("FROMID >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(String value) {
            addCriterion("FROMID <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(String value) {
            addCriterion("FROMID <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLike(String value) {
            addCriterion("FROMID like", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotLike(String value) {
            addCriterion("FROMID not like", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<String> values) {
            addCriterion("FROMID in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<String> values) {
            addCriterion("FROMID not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(String value1, String value2) {
            addCriterion("FROMID between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(String value1, String value2) {
            addCriterion("FROMID not between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("ITEMID is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("ITEMID is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(String value) {
            addCriterion("ITEMID =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(String value) {
            addCriterion("ITEMID <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(String value) {
            addCriterion("ITEMID >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMID >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(String value) {
            addCriterion("ITEMID <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(String value) {
            addCriterion("ITEMID <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLike(String value) {
            addCriterion("ITEMID like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotLike(String value) {
            addCriterion("ITEMID not like", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<String> values) {
            addCriterion("ITEMID in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<String> values) {
            addCriterion("ITEMID not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(String value1, String value2) {
            addCriterion("ITEMID between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(String value1, String value2) {
            addCriterion("ITEMID not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andToidIsNull() {
            addCriterion("TOID is null");
            return (Criteria) this;
        }

        public Criteria andToidIsNotNull() {
            addCriterion("TOID is not null");
            return (Criteria) this;
        }

        public Criteria andToidEqualTo(String value) {
            addCriterion("TOID =", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotEqualTo(String value) {
            addCriterion("TOID <>", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThan(String value) {
            addCriterion("TOID >", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThanOrEqualTo(String value) {
            addCriterion("TOID >=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThan(String value) {
            addCriterion("TOID <", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThanOrEqualTo(String value) {
            addCriterion("TOID <=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLike(String value) {
            addCriterion("TOID like", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotLike(String value) {
            addCriterion("TOID not like", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidIn(List<String> values) {
            addCriterion("TOID in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotIn(List<String> values) {
            addCriterion("TOID not in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidBetween(String value1, String value2) {
            addCriterion("TOID between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotBetween(String value1, String value2) {
            addCriterion("TOID not between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andMesscontextIsNull() {
            addCriterion("MESSCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andMesscontextIsNotNull() {
            addCriterion("MESSCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andMesscontextEqualTo(String value) {
            addCriterion("MESSCONTEXT =", value, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextNotEqualTo(String value) {
            addCriterion("MESSCONTEXT <>", value, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextGreaterThan(String value) {
            addCriterion("MESSCONTEXT >", value, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextGreaterThanOrEqualTo(String value) {
            addCriterion("MESSCONTEXT >=", value, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextLessThan(String value) {
            addCriterion("MESSCONTEXT <", value, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextLessThanOrEqualTo(String value) {
            addCriterion("MESSCONTEXT <=", value, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextLike(String value) {
            addCriterion("MESSCONTEXT like", value, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextNotLike(String value) {
            addCriterion("MESSCONTEXT not like", value, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextIn(List<String> values) {
            addCriterion("MESSCONTEXT in", values, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextNotIn(List<String> values) {
            addCriterion("MESSCONTEXT not in", values, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextBetween(String value1, String value2) {
            addCriterion("MESSCONTEXT between", value1, value2, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesscontextNotBetween(String value1, String value2) {
            addCriterion("MESSCONTEXT not between", value1, value2, "messcontext");
            return (Criteria) this;
        }

        public Criteria andMesstimeIsNull() {
            addCriterion("MESSTIME is null");
            return (Criteria) this;
        }

        public Criteria andMesstimeIsNotNull() {
            addCriterion("MESSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMesstimeEqualTo(String value) {
            addCriterion("MESSTIME =", value, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeNotEqualTo(String value) {
            addCriterion("MESSTIME <>", value, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeGreaterThan(String value) {
            addCriterion("MESSTIME >", value, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeGreaterThanOrEqualTo(String value) {
            addCriterion("MESSTIME >=", value, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeLessThan(String value) {
            addCriterion("MESSTIME <", value, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeLessThanOrEqualTo(String value) {
            addCriterion("MESSTIME <=", value, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeLike(String value) {
            addCriterion("MESSTIME like", value, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeNotLike(String value) {
            addCriterion("MESSTIME not like", value, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeIn(List<String> values) {
            addCriterion("MESSTIME in", values, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeNotIn(List<String> values) {
            addCriterion("MESSTIME not in", values, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeBetween(String value1, String value2) {
            addCriterion("MESSTIME between", value1, value2, "messtime");
            return (Criteria) this;
        }

        public Criteria andMesstimeNotBetween(String value1, String value2) {
            addCriterion("MESSTIME not between", value1, value2, "messtime");
            return (Criteria) this;
        }

        public Criteria andStatesIsNull() {
            addCriterion("STATES is null");
            return (Criteria) this;
        }

        public Criteria andStatesIsNotNull() {
            addCriterion("STATES is not null");
            return (Criteria) this;
        }

        public Criteria andStatesEqualTo(String value) {
            addCriterion("STATES =", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotEqualTo(String value) {
            addCriterion("STATES <>", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThan(String value) {
            addCriterion("STATES >", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThanOrEqualTo(String value) {
            addCriterion("STATES >=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThan(String value) {
            addCriterion("STATES <", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThanOrEqualTo(String value) {
            addCriterion("STATES <=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLike(String value) {
            addCriterion("STATES like", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotLike(String value) {
            addCriterion("STATES not like", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesIn(List<String> values) {
            addCriterion("STATES in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotIn(List<String> values) {
            addCriterion("STATES not in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesBetween(String value1, String value2) {
            addCriterion("STATES between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotBetween(String value1, String value2) {
            addCriterion("STATES not between", value1, value2, "states");
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