package com.spring.tx;
/**
 * 转账的业务层的接口
 * @author jt
 *
 */
public interface AccountService {
	public void transfer(String from,String to,int i);	
}
