package com.spring.demo1;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service("UserDAOImol2")
public class UserDAOImol2  implements UserDAO {
		
	

		@Override
	public String toString() {
		return "UserDAOImol2 [b=" + b + "]";
	}
		
		@Value("zht")
		private String a;
		
		@Value("#{'1111'},#{'2222'}")    
		private List<String> b;
		
		@Resource(name = "UserDAOImol")
		private UserDAOImol UserDAOImol;
		public void save() {
			UserDAOImol.save();
			System.out.println("sava方法执行了"+toString());
		}

		@PostConstruct
		public void init() {
			System.out.println("初始化");
		}
		
		@PreDestroy
	    public void clearMovieCache() {
			System.out.println("销毁");
	    }

		
}
