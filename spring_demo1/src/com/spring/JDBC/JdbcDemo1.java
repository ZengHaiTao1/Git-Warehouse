package com.spring.JDBC;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JDBC模板的使用
 * @author jt
 *
 */
public class JdbcDemo1 {

	@Test
	// jdbc模板的使用类似于Dbutils.
	public void demo1(){
		// 创建连接池:
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setUrl("jdbc:sqlserver://localhost:1433;DatabaseName=Performance_management_system");
		dataSource.setUsername("sa");
		dataSource.setPassword("123456789");
		// 创建jdbc模板
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		jdbcTemplate.update("insert into Administration values (?,?,?)",5,5, "赵冠希");
	}
}
