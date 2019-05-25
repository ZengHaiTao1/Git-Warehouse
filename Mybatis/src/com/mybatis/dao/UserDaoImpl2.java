package com.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.User;

public class UserDaoImpl2 implements UserMapper{

	//注入
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	private UserMapper userMapper;
	public UserDaoImpl2() throws IOException {
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		sqlSession  = sqlSessionFactory.openSession();
		userMapper= sqlSession.getMapper(UserMapper.class);
	}	
	
	
	@Override
	public User selectUserByStudentID(String id) {
		return userMapper.selectUserByStudentID(id);
	}
	@Override
	public List<User> selectUserBySex(String sex) {
		return userMapper.selectUserBySex(sex);
	}
	@Override
	public int insertUser(User user) {
		int insertUser = userMapper.insertUser(user);
		sqlSession.commit();
		return insertUser;
	}
	@Override
	public int updateUserByStudentID(User user) {
		int updateUserByStudentID = userMapper.updateUserByStudentID(user);
		sqlSession.commit();
		return updateUserByStudentID;
	}
	@Override
	public int DeleteUserByStudentID(String id) {
		int deleteUserByStudentID = userMapper.DeleteUserByStudentID(id);
		sqlSession.commit();
		return deleteUserByStudentID;
	}


	@Override
	public List<User> selectStudentByStudentIDs(String[] ids) {
		return userMapper.selectStudentByStudentIDs(ids);
	}






	
	
}
