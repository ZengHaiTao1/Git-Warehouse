package com.spring.tx;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.demo1.UserDAO;

/**
 * 测试转账的环境
 * @author jt
 *
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx.xml")*/
public class SpringDemo1 {

	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("tx.xml");
	
/*	@Resource(name="accountService")
	private AccountService accountService;*/
	
	@Test
	public void demo1(){
		AccountService accountService = (AccountService) applicationContext.getBean("AccountServiceImpl");
		accountService.transfer("5", "6", 10);
	}
}
