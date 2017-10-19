package com.test.tingting.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.test.tingting.entity.Student;

@WebService
public interface IStudentService {
	
	@WebMethod
	public List<Student> findAll();
}
