package com.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentCantroler {
	
	public StudentCantroler() {
		System.out.println("inside StudentCantroler.Const");
	}
	
	@Autowired
	StudentService stdservice;
	
	public void CreateStudent() {
		System.out.println(" StudentCantroler Method CreateStudent");
		stdservice.CreateStudent();
	}
	
   public void UpdateStudent() {
	   System.out.println("   StudentCantroler Method UpdateStudent");
	   stdservice.UpdateStudent();
	}  
      
   public void DeleteStudent() {
	   System.out.println("  StudentCantroler Method DeleteStudent");
	   stdservice.DeleteStudent();
	}
   
   public void  GetAllStudent() {
	   System.out.println(" StudentCantroler Method GetAllStudent");
	   stdservice.GetAllStudent();
	}

}
