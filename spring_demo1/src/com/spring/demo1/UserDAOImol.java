package com.spring.demo1;

import org.springframework.stereotype.Component;

@Component("UserDAOImol")
public class UserDAOImol implements UserDAO {

	

	public void init() {
		System.out.println("初始化成功");
	}
	
	
	public void save(){
		System.out.println("保存订单...");
	}
	public void update(){
		System.out.println("修改订单...");
	}
	public String delete(){
		System.out.println("删除订单...");
		return "赵冠希";
	}
	public void find(){
		System.out.println("查询订单...");
//		int d = 1/0;
	}

}
