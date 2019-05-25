package com.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.pojo.User;

public class UserDaoImpl implements UserDao {

	//注入
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	public UserDaoImpl() throws IOException {
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		sqlSession  = sqlSessionFactory.openSession();
	}	
	//通过用户ID查询一个用户
	public User selectUserByStudentID(String id){
		return sqlSession.selectOne("com.mybatis.mapper.UserMapper.findUserById", id);
	}
	//通过用户名称模糊查询
	public List<User> selectUserBySex(String sex){
		return sqlSession.selectList("com.mybatis.mapper.UserMapper.selectUserBySex", sex);
	}
	
	public int insertUser(User user) {
		 int i = sqlSession.insert("com.mybatis.mapper.UserMapper.insertUser", user);
		 //注意，除查询外，其余的方法需要提交
		 sqlSession.commit();
		 return i;
	}

	public int updateUserByStudentID( User user) {
		int i =  sqlSession.update("com.mybatis.mapper.UserMapper.updateUserByStudentID", user);
		sqlSession.commit();
		 return i;
	}

	@Override
	public int DeleteUserByStudentID(String id) {
		int i =  sqlSession.delete("com.mybatis.mapper.UserMapper.DeleteUserByStudentID", id);
		sqlSession.commit();
		 return i;
	}



	
	
}
