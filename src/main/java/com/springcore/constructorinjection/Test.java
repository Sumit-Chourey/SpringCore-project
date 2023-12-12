package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello world");
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		Person p= (Person) context.getBean("pr1");
		
		System.out.println("Hello planet");
		System.out.println(p);
		
		//3rd Addition class
		Addition add=(Addition) context.getBean("add");
		add.doSum();
		
	}

}
