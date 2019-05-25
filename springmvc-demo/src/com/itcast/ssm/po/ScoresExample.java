package com.itcast.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScoresExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoresExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentnoIsNull() {
            addCriterion("StudentNo is null");
            return (Criteria) this;
        }

        public Criteria andStudentnoIsNotNull() {
            addCriterion("StudentNo is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnoEqualTo(Integer value) {
            addCriterion("StudentNo =", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotEqualTo(Integer value) {
            addCriterion("StudentNo <>", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoGreaterThan(Integer value) {
            addCriterion("StudentNo >", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("StudentNo >=", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoLessThan(Integer value) {
            addCriterion("StudentNo <", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoLessThanOrEqualTo(Integer value) {
            addCriterion("StudentNo <=", value, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoIn(List<Integer> values) {
            addCriterion("StudentNo in", values, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotIn(List<Integer> values) {
            addCriterion("StudentNo not in", values, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoBetween(Integer value1, Integer value2) {
            addCriterion("StudentNo between", value1, value2, "studentno");
            return (Criteria) this;
        }

        public Criteria andStudentnoNotBetween(Integer value1, Integer value2) {
            addCriterion("StudentNo not between", value1, value2, "studentno");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNull() {
            addCriterion("SubjectId is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("SubjectId is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(Integer value) {
            addCriterion("SubjectId =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(Integer value) {
            addCriterion("SubjectId <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(Integer value) {
            addCriterion("SubjectId >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SubjectId >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(Integer value) {
            addCriterion("SubjectId <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("SubjectId <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<Integer> values) {
            addCriterion("SubjectId in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<Integer> values) {
            addCriterion("SubjectId not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("SubjectId between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("SubjectId not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andStudentscoresIsNull() {
            addCriterion("StudentScores is null");
            return (Criteria) this;
        }

        public Criteria andStudentscoresIsNotNull() {
            addCriterion("StudentScores is not null");
            return (Criteria) this;
        }

        public Criteria andStudentscoresEqualTo(Integer value) {
            addCriterion("StudentScores =", value, "studentscores");
            return (Criteria) this;
        }

        public Criteria andStudentscoresNotEqualTo(Integer value) {
            addCriterion("StudentScores <>", value, "studentscores");
            return (Criteria) this;
        }

        public Criteria andStudentscoresGreaterThan(Integer value) {
            addCriterion("StudentScores >", value, "studentscores");
            return (Criteria) this;
        }

        public Criteria andStudentscoresGreaterThanOrEqualTo(Integer value) {
            addCriterion("StudentScores >=", value, "studentscores");
            return (Criteria) this;
        }

        public Criteria andStudentscoresLessThan(Integer value) {
            addCriterion("StudentScores <", value, "studentscores");
            return (Criteria) this;
        }

        public Criteria andStudentscoresLessThanOrEqualTo(Integer value) {
            addCriterion("StudentScores <=", value, "studentscores");
            return (Criteria) this;
        }

        public Criteria andStudentscoresIn(List<Integer> values) {
            addCriterion("StudentScores in", values, "studentscores");
            return (Criteria) this;
        }

        public Criteria andStudentscoresNotIn(List<Integer> values) {
            addCriterion("StudentScores not in", values, "studentscores");
            return (Criteria) this;
        }

        public Criteria andStudentscoresBetween(Integer value1, Integer value2) {
            addCriterion("StudentScores between", value1, value2, "studentscores");
            return (Criteria) this;
        }

        public Criteria andStudentscoresNotBetween(Integer value1, Integer value2) {
            addCriterion("StudentScores not between", value1, value2, "studentscores");
            return (Criteria) this;
        }

        public Criteria andExamdateIsNull() {
            addCriterion("ExamDate is null");
            return (Criteria) this;
        }

        public Criteria andExamdateIsNotNull() {
            addCriterion("ExamDate is not null");
            return (Criteria) this;
        }

        public Criteria andExamdateEqualTo(Date value) {
            addCriterionForJDBCDate("ExamDate =", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ExamDate <>", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ExamDate >", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ExamDate >=", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateLessThan(Date value) {
            addCriterionForJDBCDate("ExamDate <", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ExamDate <=", value, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateIn(List<Date> values) {
            addCriterionForJDBCDate("ExamDate in", values, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ExamDate not in", values, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ExamDate between", value1, value2, "examdate");
            return (Criteria) this;
        }

        public Criteria andExamdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ExamDate not between", value1, value2, "examdate");
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