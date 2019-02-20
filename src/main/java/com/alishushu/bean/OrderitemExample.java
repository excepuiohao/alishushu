package com.alishushu.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderitemExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("ORDERID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("ORDERID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("ORDERTIME is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("ORDERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(String value) {
            addCriterion("ORDERTIME =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(String value) {
            addCriterion("ORDERTIME <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(String value) {
            addCriterion("ORDERTIME >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERTIME >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(String value) {
            addCriterion("ORDERTIME <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(String value) {
            addCriterion("ORDERTIME <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLike(String value) {
            addCriterion("ORDERTIME like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotLike(String value) {
            addCriterion("ORDERTIME not like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<String> values) {
            addCriterion("ORDERTIME in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<String> values) {
            addCriterion("ORDERTIME not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(String value1, String value2) {
            addCriterion("ORDERTIME between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(String value1, String value2) {
            addCriterion("ORDERTIME not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andSeleridIsNull() {
            addCriterion("SELERID is null");
            return (Criteria) this;
        }

        public Criteria andSeleridIsNotNull() {
            addCriterion("SELERID is not null");
            return (Criteria) this;
        }

        public Criteria andSeleridEqualTo(String value) {
            addCriterion("SELERID =", value, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridNotEqualTo(String value) {
            addCriterion("SELERID <>", value, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridGreaterThan(String value) {
            addCriterion("SELERID >", value, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridGreaterThanOrEqualTo(String value) {
            addCriterion("SELERID >=", value, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridLessThan(String value) {
            addCriterion("SELERID <", value, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridLessThanOrEqualTo(String value) {
            addCriterion("SELERID <=", value, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridLike(String value) {
            addCriterion("SELERID like", value, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridNotLike(String value) {
            addCriterion("SELERID not like", value, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridIn(List<String> values) {
            addCriterion("SELERID in", values, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridNotIn(List<String> values) {
            addCriterion("SELERID not in", values, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridBetween(String value1, String value2) {
            addCriterion("SELERID between", value1, value2, "selerid");
            return (Criteria) this;
        }

        public Criteria andSeleridNotBetween(String value1, String value2) {
            addCriterion("SELERID not between", value1, value2, "selerid");
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

        public Criteria andRecestateIsNull() {
            addCriterion("RECESTATE is null");
            return (Criteria) this;
        }

        public Criteria andRecestateIsNotNull() {
            addCriterion("RECESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecestateEqualTo(String value) {
            addCriterion("RECESTATE =", value, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateNotEqualTo(String value) {
            addCriterion("RECESTATE <>", value, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateGreaterThan(String value) {
            addCriterion("RECESTATE >", value, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateGreaterThanOrEqualTo(String value) {
            addCriterion("RECESTATE >=", value, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateLessThan(String value) {
            addCriterion("RECESTATE <", value, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateLessThanOrEqualTo(String value) {
            addCriterion("RECESTATE <=", value, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateLike(String value) {
            addCriterion("RECESTATE like", value, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateNotLike(String value) {
            addCriterion("RECESTATE not like", value, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateIn(List<String> values) {
            addCriterion("RECESTATE in", values, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateNotIn(List<String> values) {
            addCriterion("RECESTATE not in", values, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateBetween(String value1, String value2) {
            addCriterion("RECESTATE between", value1, value2, "recestate");
            return (Criteria) this;
        }

        public Criteria andRecestateNotBetween(String value1, String value2) {
            addCriterion("RECESTATE not between", value1, value2, "recestate");
            return (Criteria) this;
        }

        public Criteria andBuyeridIsNull() {
            addCriterion("BUYERID is null");
            return (Criteria) this;
        }

        public Criteria andBuyeridIsNotNull() {
            addCriterion("BUYERID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeridEqualTo(String value) {
            addCriterion("BUYERID =", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotEqualTo(String value) {
            addCriterion("BUYERID <>", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThan(String value) {
            addCriterion("BUYERID >", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThanOrEqualTo(String value) {
            addCriterion("BUYERID >=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThan(String value) {
            addCriterion("BUYERID <", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThanOrEqualTo(String value) {
            addCriterion("BUYERID <=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLike(String value) {
            addCriterion("BUYERID like", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotLike(String value) {
            addCriterion("BUYERID not like", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridIn(List<String> values) {
            addCriterion("BUYERID in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotIn(List<String> values) {
            addCriterion("BUYERID not in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridBetween(String value1, String value2) {
            addCriterion("BUYERID between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotBetween(String value1, String value2) {
            addCriterion("BUYERID not between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andShipstateIsNull() {
            addCriterion("SHIPSTATE is null");
            return (Criteria) this;
        }

        public Criteria andShipstateIsNotNull() {
            addCriterion("SHIPSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andShipstateEqualTo(String value) {
            addCriterion("SHIPSTATE =", value, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateNotEqualTo(String value) {
            addCriterion("SHIPSTATE <>", value, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateGreaterThan(String value) {
            addCriterion("SHIPSTATE >", value, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPSTATE >=", value, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateLessThan(String value) {
            addCriterion("SHIPSTATE <", value, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateLessThanOrEqualTo(String value) {
            addCriterion("SHIPSTATE <=", value, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateLike(String value) {
            addCriterion("SHIPSTATE like", value, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateNotLike(String value) {
            addCriterion("SHIPSTATE not like", value, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateIn(List<String> values) {
            addCriterion("SHIPSTATE in", values, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateNotIn(List<String> values) {
            addCriterion("SHIPSTATE not in", values, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateBetween(String value1, String value2) {
            addCriterion("SHIPSTATE between", value1, value2, "shipstate");
            return (Criteria) this;
        }

        public Criteria andShipstateNotBetween(String value1, String value2) {
            addCriterion("SHIPSTATE not between", value1, value2, "shipstate");
            return (Criteria) this;
        }

        public Criteria andLogistalIsNull() {
            addCriterion("LOGISTAL is null");
            return (Criteria) this;
        }

        public Criteria andLogistalIsNotNull() {
            addCriterion("LOGISTAL is not null");
            return (Criteria) this;
        }

        public Criteria andLogistalEqualTo(String value) {
            addCriterion("LOGISTAL =", value, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalNotEqualTo(String value) {
            addCriterion("LOGISTAL <>", value, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalGreaterThan(String value) {
            addCriterion("LOGISTAL >", value, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTAL >=", value, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalLessThan(String value) {
            addCriterion("LOGISTAL <", value, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalLessThanOrEqualTo(String value) {
            addCriterion("LOGISTAL <=", value, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalLike(String value) {
            addCriterion("LOGISTAL like", value, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalNotLike(String value) {
            addCriterion("LOGISTAL not like", value, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalIn(List<String> values) {
            addCriterion("LOGISTAL in", values, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalNotIn(List<String> values) {
            addCriterion("LOGISTAL not in", values, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalBetween(String value1, String value2) {
            addCriterion("LOGISTAL between", value1, value2, "logistal");
            return (Criteria) this;
        }

        public Criteria andLogistalNotBetween(String value1, String value2) {
            addCriterion("LOGISTAL not between", value1, value2, "logistal");
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