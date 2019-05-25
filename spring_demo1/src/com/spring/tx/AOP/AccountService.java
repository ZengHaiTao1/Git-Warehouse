package com.spring.tx.AOP;

import org.springframework.stereotype.Service;

/**
 * 转账的业务层的接口
 * @author jt
 *
 */
@Service(value = "accountService")
public interface AccountService {
	public void transfer(String from,String to,int i);	
}
