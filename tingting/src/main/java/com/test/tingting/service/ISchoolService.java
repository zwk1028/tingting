package com.test.tingting.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.test.tingting.entity.School;

@Path("/school")
public interface ISchoolService {
	
	@Path("/list")
	@GET
	@Produces("application/json")
	public List<School> findAll();
}
