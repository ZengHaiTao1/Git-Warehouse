package com.mybatis.junit;


import org.junit.jupiter.api.Test;

import com.mybatis.dao.UserDao;
import com.mybatis.dao.UserDaoImpl;
import com.mybatis.pojo.User;

public class MybatisDaoTest {

	//public SqlSessionFactory sqlSessionFactory;
	
	//@Before
	//public void before() throws Exception {
		//加载核心配置文件
		/*String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);*/
	//}
	
	@Test
	public void testDao() throws Exception {
		UserDao userDao = new UserDaoImpl();
		
		
		//User user = userDao.selectUserByStudentID("2017030431");
		//System.out.println(user);
		
		
	/*	List<User> selectUserBySex = userDao.selectUserBySex("男");
		for (User user2 : selectUserBySex) {
			System.out.println(user2);
		}*/
		
		User user = new User();
		user.setUser("宋七", "男", "2017030580", "80", "90", "77", "66", "55", "44");
		userDao.insertUser(user);
		
		//user.setDatabase("100");
		//int byStudentID = userDao.updateUserByStudentID(user);
		//System.out.println(byStudentID);
		//System.out.println(user);
		
	}
}
