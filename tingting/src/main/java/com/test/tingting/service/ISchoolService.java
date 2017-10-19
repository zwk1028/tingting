package com.test.tingting.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.test.tingting.entity.School;

@WebService
public interface ISchoolService {

	@WebMethod
	String getName(String schoolId);

	@WebMethod
	School getSchool(String schoolId);
}
