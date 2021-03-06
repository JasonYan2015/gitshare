package com.easy.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.easy.model.Book;

@Controller								//注解声名controller
@SessionAttributes({"name"})
public class BookController {

	@RequestMapping("/add")				//注解声名跳转对象
	public String add(Book book) {
		//springMVC提供的，将类放进方法当做参数，通过依赖的方法
		System.out.println("接到的值为"+book);		
		return "toIndex";
	}
	
	@RequestMapping("/select")
	public String s(Map<String, Object> map){
		//使用map来操作回显（map相当于request）
		//request.setAttribute("name","xiaoming");
		map.put("name", "xiaoming");						//与上一行注释的这句request是一样的
		return "toIndex";
	}
	
	@RequestMapping("/c")
	public String c(){
		
		
		return "index";
	}
}
