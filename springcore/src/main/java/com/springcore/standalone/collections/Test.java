package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
        Person person1=(Person) context.getBean("person1");
        System.out.println(person1);
        System.out.println(person1.getFeestructure());
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        Person person2=(Person) context.getBean("person2");
        System.out.println(person2);
        System.out.println(person2.getFeestructure());
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        

	}

}
