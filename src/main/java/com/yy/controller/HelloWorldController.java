package com.yy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String hello(){
        return "hello world";
    }
	
	@RequestMapping("/test")
	public Map<String,String> testMap(){
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "彭云云");
		map.put("sex", "male");
		System.out.println("test for git");
        System.out.println("github updated file");
        System.out.println("github to local");
        System.out.println("test local 2222222222222222");
		System.out.println("test1111111111111111111");
		return map;
	}
}
