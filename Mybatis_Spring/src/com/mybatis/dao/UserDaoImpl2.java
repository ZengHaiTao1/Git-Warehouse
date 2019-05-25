package com.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.User;

public class UserDaoImpl2 extends SqlSessionDaoSupport implements UserMapper{

	@Override
	public User findUserById(String id) {
		SqlSession sqlSession = super.getSqlSession();
		User user = sqlSession.selectOne("findUserById",id);
		return user;
	}

	

	
	
}
