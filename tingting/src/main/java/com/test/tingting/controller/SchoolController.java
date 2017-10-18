package com.test.tingting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.tingting.entity.School;
import com.test.tingting.service.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@GetMapping("/list")
	public List<School> findAll(){
		return schoolService.findAll();
	}
}
