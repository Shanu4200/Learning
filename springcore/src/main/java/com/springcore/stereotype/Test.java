package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
        Student student = context.getBean("Ob", Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println(student.hashCode());
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        Student student2 = context.getBean("Ob", Student.class);
        System.out.println(student2.hashCode());

	}

}
