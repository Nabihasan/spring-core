package com.ms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CountryMain {

	public static void main(String[] args) {
		
//	CountryInfo in=	CountryInfo.getCountry();
//	
//	System.out.println(in);
		
			ApplicationContext con= new ClassPathXmlApplicationContext("bean.xml");
				
			CountryInfo info=	con.getBean("info",CountryInfo.class);
			System.out.println(info);
		
		//old approach
//		CountryFactory f=new	CountryFactory();
//		
//		System.out.println(f.getCountry());
			
//		ApplicationContext con= new ClassPathXmlApplicationContext("bean.xml");
//		
//		CountryInfo info=	con.getBean("c1",CountryInfo.class);
//		System.out.println(info);
//	
	}

}
