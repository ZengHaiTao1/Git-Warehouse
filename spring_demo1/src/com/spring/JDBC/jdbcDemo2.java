package com.spring.JDBC;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcDemo2 {
	@Test
	public void text() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("JDBC.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ac.getBean("jdbcTemplate");
		jdbcTemplate.update("insert into Administration values (?,?,?)",7,7, "赵冠希");
		
	}
}
