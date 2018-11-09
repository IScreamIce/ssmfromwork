package com.kaige123.daomu.DAO.Bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideobuyorderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public VideobuyorderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andVcidIsNull() {
            addCriterion("vcid is null");
            return (Criteria) this;
        }

        public Criteria andVcidIsNotNull() {
            addCriterion("vcid is not null");
            return (Criteria) this;
        }

        public Criteria andVcidEqualTo(Long value) {
            addCriterion("vcid =", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotEqualTo(Long value) {
            addCriterion("vcid <>", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidGreaterThan(Long value) {
            addCriterion("vcid >", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidGreaterThanOrEqualTo(Long value) {
            addCriterion("vcid >=", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidLessThan(Long value) {
            addCriterion("vcid <", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidLessThanOrEqualTo(Long value) {
            addCriterion("vcid <=", value, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidIn(List<Long> values) {
            addCriterion("vcid in", values, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotIn(List<Long> values) {
            addCriterion("vcid not in", values, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidBetween(Long value1, Long value2) {
            addCriterion("vcid between", value1, value2, "vcid");
            return (Criteria) this;
        }

        public Criteria andVcidNotBetween(Long value1, Long value2) {
            addCriterion("vcid not between", value1, value2, "vcid");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateIsNull() {
            addCriterion("createOrderDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateIsNotNull() {
            addCriterion("createOrderDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateEqualTo(String value) {
            addCriterion("createOrderDate =", value, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateNotEqualTo(String value) {
            addCriterion("createOrderDate <>", value, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateGreaterThan(String value) {
            addCriterion("createOrderDate >", value, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateGreaterThanOrEqualTo(String value) {
            addCriterion("createOrderDate >=", value, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateLessThan(String value) {
            addCriterion("createOrderDate <", value, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateLessThanOrEqualTo(String value) {
            addCriterion("createOrderDate <=", value, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateLike(String value) {
            addCriterion("createOrderDate like", value, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateNotLike(String value) {
            addCriterion("createOrderDate not like", value, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateIn(List<String> values) {
            addCriterion("createOrderDate in", values, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateNotIn(List<String> values) {
            addCriterion("createOrderDate not in", values, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateBetween(String value1, String value2) {
            addCriterion("createOrderDate between", value1, value2, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andCreateorderdateNotBetween(String value1, String value2) {
            addCriterion("createOrderDate not between", value1, value2, "createorderdate");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberIsNull() {
            addCriterion("ThridPartyorderNumber is null");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberIsNotNull() {
            addCriterion("ThridPartyorderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberEqualTo(Date value) {
            addCriterion("ThridPartyorderNumber =", value, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberNotEqualTo(Date value) {
            addCriterion("ThridPartyorderNumber <>", value, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberGreaterThan(Date value) {
            addCriterion("ThridPartyorderNumber >", value, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberGreaterThanOrEqualTo(Date value) {
            addCriterion("ThridPartyorderNumber >=", value, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberLessThan(Date value) {
            addCriterion("ThridPartyorderNumber <", value, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberLessThanOrEqualTo(Date value) {
            addCriterion("ThridPartyorderNumber <=", value, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberIn(List<Date> values) {
            addCriterion("ThridPartyorderNumber in", values, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberNotIn(List<Date> values) {
            addCriterion("ThridPartyorderNumber not in", values, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberBetween(Date value1, Date value2) {
            addCriterion("ThridPartyorderNumber between", value1, value2, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andThridpartyordernumberNotBetween(Date value1, Date value2) {
            addCriterion("ThridPartyorderNumber not between", value1, value2, "thridpartyordernumber");
            return (Criteria) this;
        }

        public Criteria andPayoverdateIsNull() {
            addCriterion("payOverDate is null");
            return (Criteria) this;
        }

        public Criteria andPayoverdateIsNotNull() {
            addCriterion("payOverDate is not null");
            return (Criteria) this;
        }

        public Criteria andPayoverdateEqualTo(Date value) {
            addCriterion("payOverDate =", value, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPayoverdateNotEqualTo(Date value) {
            addCriterion("payOverDate <>", value, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPayoverdateGreaterThan(Date value) {
            addCriterion("payOverDate >", value, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPayoverdateGreaterThanOrEqualTo(Date value) {
            addCriterion("payOverDate >=", value, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPayoverdateLessThan(Date value) {
            addCriterion("payOverDate <", value, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPayoverdateLessThanOrEqualTo(Date value) {
            addCriterion("payOverDate <=", value, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPayoverdateIn(List<Date> values) {
            addCriterion("payOverDate in", values, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPayoverdateNotIn(List<Date> values) {
            addCriterion("payOverDate not in", values, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPayoverdateBetween(Date value1, Date value2) {
            addCriterion("payOverDate between", value1, value2, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPayoverdateNotBetween(Date value1, Date value2) {
            addCriterion("payOverDate not between", value1, value2, "payoverdate");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("payType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("payType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaymonyIsNull() {
            addCriterion("payMony is null");
            return (Criteria) this;
        }

        public Criteria andPaymonyIsNotNull() {
            addCriterion("payMony is not null");
            return (Criteria) this;
        }

        public Criteria andPaymonyEqualTo(BigDecimal value) {
            addCriterion("payMony =", value, "paymony");
            return (Criteria) this;
        }

        public Criteria andPaymonyNotEqualTo(BigDecimal value) {
            addCriterion("payMony <>", value, "paymony");
            return (Criteria) this;
        }

        public Criteria andPaymonyGreaterThan(BigDecimal value) {
            addCriterion("payMony >", value, "paymony");
            return (Criteria) this;
        }

        public Criteria andPaymonyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payMony >=", value, "paymony");
            return (Criteria) this;
        }

        public Criteria andPaymonyLessThan(BigDecimal value) {
            addCriterion("payMony <", value, "paymony");
            return (Criteria) this;
        }

        public Criteria andPaymonyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payMony <=", value, "paymony");
            return (Criteria) this;
        }

        public Criteria andPaymonyIn(List<BigDecimal> values) {
            addCriterion("payMony in", values, "paymony");
            return (Criteria) this;
        }

        public Criteria andPaymonyNotIn(List<BigDecimal> values) {
            addCriterion("payMony not in", values, "paymony");
            return (Criteria) this;
        }

        public Criteria andPaymonyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payMony between", value1, value2, "paymony");
            return (Criteria) this;
        }

        public Criteria andPaymonyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payMony not between", value1, value2, "paymony");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidIsNull() {
            addCriterion("Rreferee1Uid is null");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidIsNotNull() {
            addCriterion("Rreferee1Uid is not null");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidEqualTo(Long value) {
            addCriterion("Rreferee1Uid =", value, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidNotEqualTo(Long value) {
            addCriterion("Rreferee1Uid <>", value, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidGreaterThan(Long value) {
            addCriterion("Rreferee1Uid >", value, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidGreaterThanOrEqualTo(Long value) {
            addCriterion("Rreferee1Uid >=", value, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidLessThan(Long value) {
            addCriterion("Rreferee1Uid <", value, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidLessThanOrEqualTo(Long value) {
            addCriterion("Rreferee1Uid <=", value, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidIn(List<Long> values) {
            addCriterion("Rreferee1Uid in", values, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidNotIn(List<Long> values) {
            addCriterion("Rreferee1Uid not in", values, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidBetween(Long value1, Long value2) {
            addCriterion("Rreferee1Uid between", value1, value2, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andRreferee1uidNotBetween(Long value1, Long value2) {
            addCriterion("Rreferee1Uid not between", value1, value2, "rreferee1uid");
            return (Criteria) this;
        }

        public Criteria andMony1IsNull() {
            addCriterion("mony1 is null");
            return (Criteria) this;
        }

        public Criteria andMony1IsNotNull() {
            addCriterion("mony1 is not null");
            return (Criteria) this;
        }

        public Criteria andMony1EqualTo(BigDecimal value) {
            addCriterion("mony1 =", value, "mony1");
            return (Criteria) this;
        }

        public Criteria andMony1NotEqualTo(BigDecimal value) {
            addCriterion("mony1 <>", value, "mony1");
            return (Criteria) this;
        }

        public Criteria andMony1GreaterThan(BigDecimal value) {
            addCriterion("mony1 >", value, "mony1");
            return (Criteria) this;
        }

        public Criteria andMony1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mony1 >=", value, "mony1");
            return (Criteria) this;
        }

        public Criteria andMony1LessThan(BigDecimal value) {
            addCriterion("mony1 <", value, "mony1");
            return (Criteria) this;
        }

        public Criteria andMony1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("mony1 <=", value, "mony1");
            return (Criteria) this;
        }

        public Criteria andMony1In(List<BigDecimal> values) {
            addCriterion("mony1 in", values, "mony1");
            return (Criteria) this;
        }

        public Criteria andMony1NotIn(List<BigDecimal> values) {
            addCriterion("mony1 not in", values, "mony1");
            return (Criteria) this;
        }

        public Criteria andMony1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("mony1 between", value1, value2, "mony1");
            return (Criteria) this;
        }

        public Criteria andMony1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mony1 not between", value1, value2, "mony1");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidIsNull() {
            addCriterion("Rreferee2Uid is null");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidIsNotNull() {
            addCriterion("Rreferee2Uid is not null");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidEqualTo(Long value) {
            addCriterion("Rreferee2Uid =", value, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidNotEqualTo(Long value) {
            addCriterion("Rreferee2Uid <>", value, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidGreaterThan(Long value) {
            addCriterion("Rreferee2Uid >", value, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidGreaterThanOrEqualTo(Long value) {
            addCriterion("Rreferee2Uid >=", value, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidLessThan(Long value) {
            addCriterion("Rreferee2Uid <", value, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidLessThanOrEqualTo(Long value) {
            addCriterion("Rreferee2Uid <=", value, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidIn(List<Long> values) {
            addCriterion("Rreferee2Uid in", values, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidNotIn(List<Long> values) {
            addCriterion("Rreferee2Uid not in", values, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidBetween(Long value1, Long value2) {
            addCriterion("Rreferee2Uid between", value1, value2, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andRreferee2uidNotBetween(Long value1, Long value2) {
            addCriterion("Rreferee2Uid not between", value1, value2, "rreferee2uid");
            return (Criteria) this;
        }

        public Criteria andMony2IsNull() {
            addCriterion("mony2 is null");
            return (Criteria) this;
        }

        public Criteria andMony2IsNotNull() {
            addCriterion("mony2 is not null");
            return (Criteria) this;
        }

        public Criteria andMony2EqualTo(BigDecimal value) {
            addCriterion("mony2 =", value, "mony2");
            return (Criteria) this;
        }

        public Criteria andMony2NotEqualTo(BigDecimal value) {
            addCriterion("mony2 <>", value, "mony2");
            return (Criteria) this;
        }

        public Criteria andMony2GreaterThan(BigDecimal value) {
            addCriterion("mony2 >", value, "mony2");
            return (Criteria) this;
        }

        public Criteria andMony2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mony2 >=", value, "mony2");
            return (Criteria) this;
        }

        public Criteria andMony2LessThan(BigDecimal value) {
            addCriterion("mony2 <", value, "mony2");
            return (Criteria) this;
        }

        public Criteria andMony2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("mony2 <=", value, "mony2");
            return (Criteria) this;
        }

        public Criteria andMony2In(List<BigDecimal> values) {
            addCriterion("mony2 in", values, "mony2");
            return (Criteria) this;
        }

        public Criteria andMony2NotIn(List<BigDecimal> values) {
            addCriterion("mony2 not in", values, "mony2");
            return (Criteria) this;
        }

        public Criteria andMony2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("mony2 between", value1, value2, "mony2");
            return (Criteria) this;
        }

        public Criteria andMony2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mony2 not between", value1, value2, "mony2");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyIsNull() {
            addCriterion("BeLeftOverMony is null");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyIsNotNull() {
            addCriterion("BeLeftOverMony is not null");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyEqualTo(BigDecimal value) {
            addCriterion("BeLeftOverMony =", value, "beleftovermony");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyNotEqualTo(BigDecimal value) {
            addCriterion("BeLeftOverMony <>", value, "beleftovermony");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyGreaterThan(BigDecimal value) {
            addCriterion("BeLeftOverMony >", value, "beleftovermony");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BeLeftOverMony >=", value, "beleftovermony");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyLessThan(BigDecimal value) {
            addCriterion("BeLeftOverMony <", value, "beleftovermony");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BeLeftOverMony <=", value, "beleftovermony");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyIn(List<BigDecimal> values) {
            addCriterion("BeLeftOverMony in", values, "beleftovermony");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyNotIn(List<BigDecimal> values) {
            addCriterion("BeLeftOverMony not in", values, "beleftovermony");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BeLeftOverMony between", value1, value2, "beleftovermony");
            return (Criteria) this;
        }

        public Criteria andBeleftovermonyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BeLeftOverMony not between", value1, value2, "beleftovermony");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table videobuyorder
     *
     * @mbg.generated do_not_delete_during_merge Sat Oct 13 11:12:28 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table videobuyorder
     *
     * @mbg.generated Sat Oct 13 11:12:28 CST 2018
     */
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