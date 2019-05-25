package com.mybatis.pojo;

import java.io.Serializable;

public class User implements Serializable {
	
	@Override
	public String toString() {
		return "User [student=" + student + ", nane=" + nane + ", sex=" + sex + ", StudentID=" + StudentID + ", js="
				+ js + ", C=" + C + ", database=" + database + ", Careerplanning=" + Careerplanning + ", Mentalhealth="
				+ Mentalhealth + ", Sports=" + Sports + "]";
	}
	public void setUser(String nane, String sex, String studentID, String js, String c, String database, String careerplanning,
			String mentalhealth, String sports) {
		this.nane = nane;
		this.sex = sex;
		StudentID = studentID;
		this.js = js;
		C = c;
		this.database = database;
		Careerplanning = careerplanning;
		Mentalhealth = mentalhealth;
		Sports = sports;
	}
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	private String nane;
	private String sex;
	private String StudentID;
	private String js;
	private String C;
	private String database;
	private String Careerplanning;
	public String getNane() {
		return nane;
	}
	public void setNane(String nane) {
		this.nane = nane;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getJs() {
		return js;
	}
	public void setJs(String js) {
		this.js = js;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getCareerplanning() {
		return Careerplanning;
	}
	public void setCareerplanning(String careerplanning) {
		Careerplanning = careerplanning;
	}
	public String getMentalhealth() {
		return Mentalhealth;
	}
	public void setMentalhealth(String mentalhealth) {
		Mentalhealth = mentalhealth;
	}
	public String getSports() {
		return Sports;
	}
	public void setSports(String sports) {
		Sports = sports;
	}
	private String Mentalhealth;
	private String Sports;

}
