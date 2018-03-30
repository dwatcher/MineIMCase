package org.meim.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int start = -1;

    protected int end = -1;

    public RelationExample() {
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

    public void setStart(int start) {
        this.start=start;
    }

    public int getStart() {
        return start;
    }

    public void setEnd(int end) {
        this.end=end;
    }

    public int getEnd() {
        return end;
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

        public Criteria andRelationIdIsNull() {
            addCriterion("relation_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNotNull() {
            addCriterion("relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationIdEqualTo(Integer value) {
            addCriterion("relation_id =", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotEqualTo(Integer value) {
            addCriterion("relation_id <>", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThan(Integer value) {
            addCriterion("relation_id >", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_id >=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThan(Integer value) {
            addCriterion("relation_id <", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("relation_id <=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdIn(List<Integer> values) {
            addCriterion("relation_id in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotIn(List<Integer> values) {
            addCriterion("relation_id not in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("relation_id between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_id not between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andUseraIsNull() {
            addCriterion("usera is null");
            return (Criteria) this;
        }

        public Criteria andUseraIsNotNull() {
            addCriterion("usera is not null");
            return (Criteria) this;
        }

        public Criteria andUseraEqualTo(Integer value) {
            addCriterion("usera =", value, "usera");
            return (Criteria) this;
        }

        public Criteria andUseraNotEqualTo(Integer value) {
            addCriterion("usera <>", value, "usera");
            return (Criteria) this;
        }

        public Criteria andUseraGreaterThan(Integer value) {
            addCriterion("usera >", value, "usera");
            return (Criteria) this;
        }

        public Criteria andUseraGreaterThanOrEqualTo(Integer value) {
            addCriterion("usera >=", value, "usera");
            return (Criteria) this;
        }

        public Criteria andUseraLessThan(Integer value) {
            addCriterion("usera <", value, "usera");
            return (Criteria) this;
        }

        public Criteria andUseraLessThanOrEqualTo(Integer value) {
            addCriterion("usera <=", value, "usera");
            return (Criteria) this;
        }

        public Criteria andUseraIn(List<Integer> values) {
            addCriterion("usera in", values, "usera");
            return (Criteria) this;
        }

        public Criteria andUseraNotIn(List<Integer> values) {
            addCriterion("usera not in", values, "usera");
            return (Criteria) this;
        }

        public Criteria andUseraBetween(Integer value1, Integer value2) {
            addCriterion("usera between", value1, value2, "usera");
            return (Criteria) this;
        }

        public Criteria andUseraNotBetween(Integer value1, Integer value2) {
            addCriterion("usera not between", value1, value2, "usera");
            return (Criteria) this;
        }

        public Criteria andUserbIsNull() {
            addCriterion("userb is null");
            return (Criteria) this;
        }

        public Criteria andUserbIsNotNull() {
            addCriterion("userb is not null");
            return (Criteria) this;
        }

        public Criteria andUserbEqualTo(Integer value) {
            addCriterion("userb =", value, "userb");
            return (Criteria) this;
        }

        public Criteria andUserbNotEqualTo(Integer value) {
            addCriterion("userb <>", value, "userb");
            return (Criteria) this;
        }

        public Criteria andUserbGreaterThan(Integer value) {
            addCriterion("userb >", value, "userb");
            return (Criteria) this;
        }

        public Criteria andUserbGreaterThanOrEqualTo(Integer value) {
            addCriterion("userb >=", value, "userb");
            return (Criteria) this;
        }

        public Criteria andUserbLessThan(Integer value) {
            addCriterion("userb <", value, "userb");
            return (Criteria) this;
        }

        public Criteria andUserbLessThanOrEqualTo(Integer value) {
            addCriterion("userb <=", value, "userb");
            return (Criteria) this;
        }

        public Criteria andUserbIn(List<Integer> values) {
            addCriterion("userb in", values, "userb");
            return (Criteria) this;
        }

        public Criteria andUserbNotIn(List<Integer> values) {
            addCriterion("userb not in", values, "userb");
            return (Criteria) this;
        }

        public Criteria andUserbBetween(Integer value1, Integer value2) {
            addCriterion("userb between", value1, value2, "userb");
            return (Criteria) this;
        }

        public Criteria andUserbNotBetween(Integer value1, Integer value2) {
            addCriterion("userb not between", value1, value2, "userb");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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