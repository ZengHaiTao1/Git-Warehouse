package com.mybatis.junit;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.mapper.StudentMapper;
import com.mybatis.pojo.User;

public class MybatisSpringText {
	private ApplicationContext context;
	

	@Test
	public void Dao() throws Exception {
		this.context = new ClassPathXmlApplicationContext("mybatisSpring.xml");
		StudentMapper studentMapper = this.context.getBean(StudentMapper.class);
		/*UserMapper userMapper = this.context.getBean(UserMapper.class);
		User user = userMapper.findUserById("2017030431");*/
		List<User> selectStudentByStudentName2 = studentMapper.selectStudentByStudentName2("王磊");
		for (User user : selectStudentByStudentName2) {
			System.out.println(user);
		}
		//System.out.println(user);
		
		
	}
}
