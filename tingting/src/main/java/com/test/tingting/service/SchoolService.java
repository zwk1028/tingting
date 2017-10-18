package com.test.tingting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.tingting.dao.SchoolDao;
import com.test.tingting.entity.School;

/**
 * @author ZhangWK
 *	学校服务
 */
@Service
public class SchoolService {

	@Autowired
	private SchoolDao schoolDao;

	public List<School> findAll() {
		return schoolDao.findAll();
	}
}
