package com.spring.tx.AOP;
/**
 * 转账的DAO的接口
 * @author jt
 *
 */
public interface AccountDao {
	public void outMoney(String from ,int money);
	public void inMoney(String to ,int money);
}
