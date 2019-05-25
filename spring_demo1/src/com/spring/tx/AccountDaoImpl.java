package com.spring.tx;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 转账的DAO的实现类
 * @author jt
 *
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String from, int money) {
		this.getJdbcTemplate().update("update Administration  set password = password + ? where ID = ? ", money,from);
	}

	@Override
	public void inMoney(String to, int money) {
		this.getJdbcTemplate().update("update Administration  set password = password - ? where ID = ? ", money ,to);
	}

}
