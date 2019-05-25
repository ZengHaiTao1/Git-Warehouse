package com.spring.AOP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo01 {
	
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOP.xml");
		/*UserDAO UserDAOImol = (UserDAO) applicationContext.getBean("UserDAOImol");
		UserDAOImol.save();*/
		
		UserDAOImol UserDAOImol = (UserDAOImol) applicationContext.getBean("UserDAOImol");
		UserDAOImol.find();
		UserDAOImol.update();
		UserDAOImol.delete();
		applicationContext.close();
	}
	
	
}
