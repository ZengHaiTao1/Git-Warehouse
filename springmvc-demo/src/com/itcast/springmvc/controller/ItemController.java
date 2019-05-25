package com.itcast.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itcast.ssm.po.Scores;

@Controller	  
public class ItemController {

	@RequestMapping(value ="/scoreslist.action")
	public ModelAndView registerUser() {
		
		System.out.println("进来了");
		List<Scores> list = new ArrayList<Scores>();
		list.add(new Scores(1,15 , 15, 16, new Date()) );
		list.add(new Scores(2,30 , 30, 16, new Date()) );
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("Scoreslist", list);
		modelAndView.addObject("a", "aaa");
		// 设置视图jsp，需要设置视图的物理地址
		modelAndView.setViewName("scoreslist");
		
		return modelAndView;
	}

}
