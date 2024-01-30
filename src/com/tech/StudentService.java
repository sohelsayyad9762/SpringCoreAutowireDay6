package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public StudentService() {
		System.out.println("inside StudentServiceConstructor");
	}
	
	@Autowired
	StudentDao stdlist;
	
	public void CreateStudent() {
		System.out.println(" StudentService Method CreateStudent");
		stdlist.CreateStudent();
	}
	
   public void UpdateStudent() {
	   System.out.println("   StudentService Method UpdateStudent");
	   stdlist.UpdateStudent();
	}  
      
   public void DeleteStudent() {
	   System.out.println("  StudentService Method DeleteStudent");
	   stdlist.DeleteStudent();
	}
   
   public void  GetAllStudent() {
	   System.out.println(" StudentService Method GetAllStudent");
	   stdlist.GetAllStudent();
	}

}
