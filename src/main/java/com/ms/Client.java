package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
			
		//old approach
		
	/*	Employee emp=new Employee();
		emp.setEno(101);
		emp.setName("aamir");
		System.out.println(emp); */
		
	//	using spring container (IOC)
		
		ApplicationContext con=new ClassPathXmlApplicationContext("info.xml");
			
		Employee employee=	con.getBean("e1",Employee.class);
		
		System.out.println(employee);

	}

}
