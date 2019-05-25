package com.mybatis.pojo;

import java.io.Serializable;
import java.util.List;

public class Student  implements Serializable{

	@Override
	public String toString() {
		return "Student [stuClass=" + stuClass + ", stuName=" + stuName + ", stuId=" + stuId + ", stuPassword="
				+ stuPassword + ", users=" + users + "]";
	}
	private static final long serialVersionUID = 1L;
	private  String stuClass;
	private  String stuName;
	private  String stuId;
	private  String stuPassword;
	private User user;
	
	private List<User> users;


	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuPassword() {
		return stuPassword;
	}
	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}
	

    
    
}