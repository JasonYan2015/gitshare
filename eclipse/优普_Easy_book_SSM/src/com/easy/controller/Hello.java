package com.easy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller															//标识控制器
public class Hello {
	
	@RequestMapping("/a")
	public String testHello() {
		System.out.println("Hello,you are in.");
		return "toIndex";
	}
	
	@RequestMapping("/param")
	public String testParam(String name){
		System.out.println("名字为"+name);
		return "toIndex";
	}
	
	
}
