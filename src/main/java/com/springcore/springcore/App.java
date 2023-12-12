package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
        System.out.println( "Hello World!" );
        //extends from bean factory//"context" is basically a container
        //Object toh create he nahi kiya main() me apan ne
        //apne object IOC container manga hai,or context se object nikala hai
        //usne object bana hoga ,provide kiya hoga ,or application bund hone k phele destory kiya hoga
        //So, uss object ka pura life cycle manage kiya hai 
        //toString method se chij print ho rahi thi
        //agar tostring method nahi hogi toh "(HashCode)" print hoga....
        //How you know "setter injection chal raha hai...?
        //check Student.java class..
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/config.xml");
       
        //(context.getbean)bolega apni bean ka name bta do....
        //bean ka name "st1" hai
        Student st1=(Student) context.getBean("st1");
        System.out.println(st1.getStudentId());
        System.out.println(st1.getStudentName());
        System.out.println(st1.getStudentAddress());
        
        
    }
}
