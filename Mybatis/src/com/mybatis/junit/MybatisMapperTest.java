package com.mybatis.junit;

import java.util.List;

import org.junit.Test;

import com.mybatis.dao.UserDaoImpl2;
import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.User;

public class MybatisMapperTest {

	@Test
	public void testMapper() throws Exception {
		/*UserMapper UserDaoImpl2 = new UserDaoImpl2();
		User user = new User();
		user.setUser("王磊", "男", "2017030599", "100", "90", "77", "66", "55", "44");
		UserDaoImpl2.insertUser(user);*/
		//List<User> selectUserBySex = UserDaoImpl2.selectUserBySex("男");
		//for (User user : selectUserBySex) {
		//	 System.out.println(user);
		//}
		
		//一对多查询
		//StudentMapper studentMapperMapper =  new StudentDaoImpl();
		/* Student selectStudentByStudentName = studentMapperMapper.selectStudentByStudentName("王磊");
				System.out.println(selectStudentByStudentName);*/
				
		//一对一查询
			/*	List<User> selectStudentByStudentName2 = studentMapperMapper.selectStudentByStudentName2("王磊");
				for (User user : selectStudentByStudentName2) {
					System.out.println(user);
				}*/
		
		UserMapper UserDaoImpl2 = new UserDaoImpl2();
		String[] ids = {"2017030431","2017030580"};
		List<User> selectStudentByStudentIDs = UserDaoImpl2.selectStudentByStudentIDs(ids);
		for (User user : selectStudentByStudentIDs) {
			 System.out.println(user);
		}
	}
}
