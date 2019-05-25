package com.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.mapper.StudentMapper;
import com.mybatis.pojo.Student;
import com.mybatis.pojo.User;

public class StudentDaoImpl implements StudentMapper{

	//注入
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	private StudentMapper studentMapper;
	public StudentDaoImpl() throws IOException {
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		sqlSession  = sqlSessionFactory.openSession();
		studentMapper= sqlSession.getMapper(StudentMapper.class);
	}
	
	public Student selectStudentByStudentName(String name) {
		return studentMapper.selectStudentByStudentName(name);
	}

	@Override
	public List<User> selectStudentByStudentName2(String name) {
		return studentMapper.selectStudentByStudentName2(name);
	}	
	
	




	
	
}
