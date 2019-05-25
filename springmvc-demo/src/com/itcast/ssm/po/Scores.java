package com.itcast.ssm.po;

import java.util.Date;

public class Scores {
    public Scores(Integer id, Integer studentno, Integer subjectid, Integer studentscores, Date examdate) {
		super();
		this.id = id;
		this.studentno = studentno;
		this.subjectid = subjectid;
		this.studentscores = studentscores;
		this.examdate = examdate;
	}

	private Integer id;

    private Integer studentno;

    private Integer subjectid;

    private Integer studentscores;

    private Date examdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentno() {
        return studentno;
    }

    public void setStudentno(Integer studentno) {
        this.studentno = studentno;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public Integer getStudentscores() {
        return studentscores;
    }

    public void setStudentscores(Integer studentscores) {
        this.studentscores = studentscores;
    }

    public Date getExamdate() {
        return examdate;
    }

    public void setExamdate(Date examdate) {
        this.examdate = examdate;
    }
}