package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ctx= new ClassPathXmlApplicationContext("bean.xml");
		
//		 StudentDao stddao=(StudentDao) ctx.getBean("studentDao");
//		 stddao.Test();
//		 stddao.CreateStudent();
//		 stddao.DeleteStudent();
//		 stddao.UpdateStudent();
//		 stddao.GetAllStudent();
		
//		StudentService stdservice=(StudentService) ctx.getBean("studentService");
//		 stdservice.CreateStudent(); 
//		 stdservice.UpdateStudent();
//		 stdservice.DeleteStudent();
//		 stdservice.GetAllStudent();
		
		StudentCantroler stdcantroler=(StudentCantroler) ctx.getBean("studentCantroler");
		stdcantroler.CreateStudent();
		stdcantroler.UpdateStudent();
		stdcantroler.DeleteStudent();
		stdcantroler.GetAllStudent();
	}

}
