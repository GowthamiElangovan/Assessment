package com.collabera.assessment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		Laptop lap=(Laptop)context.getBean("laptop");
		System.out.println(lap);
		Employee emp=(Employee)context.getBean("employee"); 
		 System.out.println(emp);
		}
}
