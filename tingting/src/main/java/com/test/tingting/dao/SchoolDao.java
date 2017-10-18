package com.test.tingting.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.tingting.entity.School;

@Mapper
public interface SchoolDao {
	
	/**
	 * 查询所有的学校
	 * @return
	 */
	public List<School> findAll();
}
