package com.test.tingting.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.tingting.entity.Student;

@Mapper
public interface StudentDao {
	
	public List<Student> findAll();
	
}
