package com.tech;

import org.springframework.stereotype.Repository;

@Repository
public class Student {
	
	String id;
	
	String name;
	
	public Student() {
		System.out.println("inside StudentConstructor");
	}
	
	
	

}
