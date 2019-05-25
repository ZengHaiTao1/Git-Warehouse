package com.mybatis.mapper;

import java.util.List;

import com.mybatis.pojo.Student;
import com.mybatis.pojo.User;

public interface StudentMapper {
	
	public Student selectStudentByStudentName(String name);
	public List<User> selectStudentByStudentName2(String name);
	
		
	
}
