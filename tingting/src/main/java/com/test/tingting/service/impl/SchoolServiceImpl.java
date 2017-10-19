package com.test.tingting.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.tingting.dao.SchoolDao;
import com.test.tingting.entity.School;
import com.test.tingting.service.ISchoolService;

@Service
public class SchoolServiceImpl implements ISchoolService {

	@Autowired
	private SchoolDao schoolDao;

	@Override
	public List<School> findAll() {
		return schoolDao.findAll();
	}

}
