package com.spring.tx.AOP;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账的业务层的实现类
 * @author jt
 *
 */

//事务AOP注解开法
@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

	// 注入DAO:
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	private TransactionTemplate transactiontemplate;
	public void setTransactiontemplate(TransactionTemplate transactiontemplate) {
		this.transactiontemplate = transactiontemplate;
	}

	@Override
	/**
	 * from：转出账号
	 * to：转入账号
	 * money：转账金额
	 */	
	public void transfer( String from,  String to,  int money) {
				accountDao.outMoney(from, money);
				//int d = 1/0;
				accountDao.inMoney(to, money);
		
}

}
