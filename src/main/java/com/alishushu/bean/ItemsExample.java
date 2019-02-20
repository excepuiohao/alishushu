package com.alishushu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemsExample() {
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

        public Criteria andItemnameIsNull() {
            addCriterion("ITEMNAME is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("ITEMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("ITEMNAME =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("ITEMNAME <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("ITEMNAME >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMNAME >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("ITEMNAME <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("ITEMNAME <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("ITEMNAME like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("ITEMNAME not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("ITEMNAME in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("ITEMNAME not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("ITEMNAME between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("ITEMNAME not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andIteminfoIsNull() {
            addCriterion("ITEMINFO is null");
            return (Criteria) this;
        }

        public Criteria andIteminfoIsNotNull() {
            addCriterion("ITEMINFO is not null");
            return (Criteria) this;
        }

        public Criteria andIteminfoEqualTo(String value) {
            addCriterion("ITEMINFO =", value, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoNotEqualTo(String value) {
            addCriterion("ITEMINFO <>", value, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoGreaterThan(String value) {
            addCriterion("ITEMINFO >", value, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMINFO >=", value, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoLessThan(String value) {
            addCriterion("ITEMINFO <", value, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoLessThanOrEqualTo(String value) {
            addCriterion("ITEMINFO <=", value, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoLike(String value) {
            addCriterion("ITEMINFO like", value, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoNotLike(String value) {
            addCriterion("ITEMINFO not like", value, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoIn(List<String> values) {
            addCriterion("ITEMINFO in", values, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoNotIn(List<String> values) {
            addCriterion("ITEMINFO not in", values, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoBetween(String value1, String value2) {
            addCriterion("ITEMINFO between", value1, value2, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andIteminfoNotBetween(String value1, String value2) {
            addCriterion("ITEMINFO not between", value1, value2, "iteminfo");
            return (Criteria) this;
        }

        public Criteria andItempicIsNull() {
            addCriterion("ITEMPIC is null");
            return (Criteria) this;
        }

        public Criteria andItempicIsNotNull() {
            addCriterion("ITEMPIC is not null");
            return (Criteria) this;
        }

        public Criteria andItempicEqualTo(String value) {
            addCriterion("ITEMPIC =", value, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicNotEqualTo(String value) {
            addCriterion("ITEMPIC <>", value, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicGreaterThan(String value) {
            addCriterion("ITEMPIC >", value, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMPIC >=", value, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicLessThan(String value) {
            addCriterion("ITEMPIC <", value, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicLessThanOrEqualTo(String value) {
            addCriterion("ITEMPIC <=", value, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicLike(String value) {
            addCriterion("ITEMPIC like", value, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicNotLike(String value) {
            addCriterion("ITEMPIC not like", value, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicIn(List<String> values) {
            addCriterion("ITEMPIC in", values, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicNotIn(List<String> values) {
            addCriterion("ITEMPIC not in", values, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicBetween(String value1, String value2) {
            addCriterion("ITEMPIC between", value1, value2, "itempic");
            return (Criteria) this;
        }

        public Criteria andItempicNotBetween(String value1, String value2) {
            addCriterion("ITEMPIC not between", value1, value2, "itempic");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("SHOPID is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("SHOPID is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("SHOPID =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("SHOPID <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("SHOPID >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("SHOPID >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("SHOPID <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("SHOPID <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("SHOPID like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("SHOPID not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("SHOPID in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("SHOPID not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("SHOPID between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("SHOPID not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPutdateIsNull() {
            addCriterion("PUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPutdateIsNotNull() {
            addCriterion("PUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPutdateEqualTo(String value) {
            addCriterion("PUTDATE =", value, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateNotEqualTo(String value) {
            addCriterion("PUTDATE <>", value, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateGreaterThan(String value) {
            addCriterion("PUTDATE >", value, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateGreaterThanOrEqualTo(String value) {
            addCriterion("PUTDATE >=", value, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateLessThan(String value) {
            addCriterion("PUTDATE <", value, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateLessThanOrEqualTo(String value) {
            addCriterion("PUTDATE <=", value, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateLike(String value) {
            addCriterion("PUTDATE like", value, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateNotLike(String value) {
            addCriterion("PUTDATE not like", value, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateIn(List<String> values) {
            addCriterion("PUTDATE in", values, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateNotIn(List<String> values) {
            addCriterion("PUTDATE not in", values, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateBetween(String value1, String value2) {
            addCriterion("PUTDATE between", value1, value2, "putdate");
            return (Criteria) this;
        }

        public Criteria andPutdateNotBetween(String value1, String value2) {
            addCriterion("PUTDATE not between", value1, value2, "putdate");
            return (Criteria) this;
        }

        public Criteria andDowndateIsNull() {
            addCriterion("DOWNDATE is null");
            return (Criteria) this;
        }

        public Criteria andDowndateIsNotNull() {
            addCriterion("DOWNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDowndateEqualTo(String value) {
            addCriterion("DOWNDATE =", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateNotEqualTo(String value) {
            addCriterion("DOWNDATE <>", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateGreaterThan(String value) {
            addCriterion("DOWNDATE >", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNDATE >=", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateLessThan(String value) {
            addCriterion("DOWNDATE <", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateLessThanOrEqualTo(String value) {
            addCriterion("DOWNDATE <=", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateLike(String value) {
            addCriterion("DOWNDATE like", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateNotLike(String value) {
            addCriterion("DOWNDATE not like", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateIn(List<String> values) {
            addCriterion("DOWNDATE in", values, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateNotIn(List<String> values) {
            addCriterion("DOWNDATE not in", values, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateBetween(String value1, String value2) {
            addCriterion("DOWNDATE between", value1, value2, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateNotBetween(String value1, String value2) {
            addCriterion("DOWNDATE not between", value1, value2, "downdate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andPageviewIsNull() {
            addCriterion("PAGEVIEW is null");
            return (Criteria) this;
        }

        public Criteria andPageviewIsNotNull() {
            addCriterion("PAGEVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andPageviewEqualTo(BigDecimal value) {
            addCriterion("PAGEVIEW =", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewNotEqualTo(BigDecimal value) {
            addCriterion("PAGEVIEW <>", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewGreaterThan(BigDecimal value) {
            addCriterion("PAGEVIEW >", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAGEVIEW >=", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewLessThan(BigDecimal value) {
            addCriterion("PAGEVIEW <", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAGEVIEW <=", value, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewIn(List<BigDecimal> values) {
            addCriterion("PAGEVIEW in", values, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewNotIn(List<BigDecimal> values) {
            addCriterion("PAGEVIEW not in", values, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAGEVIEW between", value1, value2, "pageview");
            return (Criteria) this;
        }

        public Criteria andPageviewNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAGEVIEW not between", value1, value2, "pageview");
            return (Criteria) this;
        }

        public Criteria andItemcountIsNull() {
            addCriterion("ITEMCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andItemcountIsNotNull() {
            addCriterion("ITEMCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andItemcountEqualTo(BigDecimal value) {
            addCriterion("ITEMCOUNT =", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountNotEqualTo(BigDecimal value) {
            addCriterion("ITEMCOUNT <>", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountGreaterThan(BigDecimal value) {
            addCriterion("ITEMCOUNT >", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEMCOUNT >=", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountLessThan(BigDecimal value) {
            addCriterion("ITEMCOUNT <", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEMCOUNT <=", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountIn(List<BigDecimal> values) {
            addCriterion("ITEMCOUNT in", values, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountNotIn(List<BigDecimal> values) {
            addCriterion("ITEMCOUNT not in", values, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEMCOUNT between", value1, value2, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEMCOUNT not between", value1, value2, "itemcount");
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