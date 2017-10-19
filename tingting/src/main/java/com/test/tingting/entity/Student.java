package com.test.tingting.entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Student {
	
	private int id;
	
	private String name;
}
