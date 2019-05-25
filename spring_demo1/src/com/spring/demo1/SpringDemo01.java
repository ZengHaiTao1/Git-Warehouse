package com.spring.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:zhujie.xml")
public class SpringDemo01 {
	
	@Resource(name = "UserDAOImol2")
	private UserDAO UserDAOImol;
	
	@Test
	public void demo1() {
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOP.xml");
		/*UserDAO UserDAOImol = (UserDAO) applicationContext.getBean("UserDAOImol");
		UserDAOImol.save();*/
		
		//UserDAO UserDAOImol = (UserDAO) applicationContext.getBean("UserDAOImol");
		UserDAOImol.save();
		//applicationContext.close();
	}
	
	
}
