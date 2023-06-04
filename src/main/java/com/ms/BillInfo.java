package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BillInfo {

	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("bills.xml");
		Bill bill=	context.getBean("b1",Bill.class);
		System.out.println(bill);
	}

}
