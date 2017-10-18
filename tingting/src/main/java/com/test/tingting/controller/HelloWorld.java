package com.test.tingting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.tingting.entity.School;
import com.test.tingting.service.SchoolService;

@RestController
public class HelloWorld {
	@Autowired
	private SchoolService schoolService;
	
	@GetMapping("/hello")
	public String helloworld() {
		return "helloWorld";
	}
	
	@GetMapping("/school")
	public List<School> findAll(){
		return schoolService.findAll();
	}
}
