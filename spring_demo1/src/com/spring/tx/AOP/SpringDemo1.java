package com.spring.tx.AOP;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试转账的环境
 * @author jt
 *
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx.xml")*/
public class SpringDemo1 {

	//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("tx.AOP.xml");
	
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void demo1(){
		//AccountService accountService = (AccountService) applicationContext.getBean("AccountServiceImpl");
		accountService.transfer("5", "6", 10);
	}
}
