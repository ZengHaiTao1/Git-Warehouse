package com.mybatis.dao;

import java.util.List;

import com.mybatis.pojo.User;

public interface UserDao {

	//遵循四个原则
		//接口 方法名  == User.xml 中 id 名
		//返回值类型  与  Mapper.xml文件中返回值类型要一致
		//方法的入参类型 与Mapper.xml中入参的类型要一致
		//命名空间 绑定此接口
	
	//通过用户ID查询一个用户
		 User selectUserByStudentID(String id);
		List<User> selectUserBySex(String sex);
		int  insertUser(User user);
		int updateUserByStudentID(User user);
		int DeleteUserByStudentID(String id);
}
