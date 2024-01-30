package com.tech;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	public StudentDao() {
		System.out.println("inside StudentDaoConstructor");
	}
	
	public void Test() {
		System.out.println("inside StudentDao.Test");
	}
	
	public void CreateStudent() {
		System.out.println("Method CreateStudent");
	}
	
   public void UpdateStudent() {
	   System.out.println("Method UpdateStudent");
	}  
      
   public void DeleteStudent() {
	   System.out.println("Method DeleteStudent");
	}
   
   public void  GetAllStudent() {
	   System.out.println("Method GetAllStudent");
	}

}
