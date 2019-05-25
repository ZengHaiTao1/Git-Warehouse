package com.itcast.ssm.po;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class Scores implements Serializable{
	@Override
	public String toString() {
		return "Scores [id=" + id + ", studentno=" + studentno + ", subjectid=" + subjectid + ", studentscores="
				+ studentscores + ", examdate=" + examdate + "]";
	}
	private static final long serialVersionUID = 1L;

	public Scores(Integer id, Integer studentno, Integer subjectid, Integer studentscores, Date examdate) {
		super();
		this.id = id;
		this.studentno = studentno;
		this.subjectid = subjectid;
		this.studentscores = studentscores;
		this.examdate = examdate;
	}
	public Scores() {
		
		
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

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getExamdate() throws ParseException {
        return examdate;
    }

    public void setExamdate(Date examdate) {
        this.examdate = examdate;
    }
}