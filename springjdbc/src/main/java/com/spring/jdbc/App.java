package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Program Started");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		// JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);

		// String query="insert into student(id,name,city) values(?,?,?)";

		// int result = template.update(query,1950502100,"Shanu","Himachal Pradesh");

		// System.out.println("Number of records inserted" + result);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// INSERT

		// Student student = new Student();
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Student id=:");
		// int id = sc.nextInt();
		// System.out.println("Enter Student name=:");
		// String name = sc.next();
		// System.out.println("Enter Student city=:");
		// String city = sc.next();
		// sc.close();
		// student.setId(id);
		// student.setName(name);
		// student.setCity(city);

		// int result = studentDao.insert(student);

		// System.out.println("Student Added" + result);

		// UPDATE

		// Student student = new Student();
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Student id=:");
		// int id = sc.nextInt();
		// System.out.println("Enter Student name=:");
		// String name = sc.next();
		// System.out.println("Enter Student city=:");
		// String city = sc.next();
		// sc.close();
		// student.setId(id);
		// student.setName(name);
		// student.setCity(city);
		// int result = studentDao.change(student);

		// System.out.println("Student Updated" + result);

		// DELETE

		// Scanner sc = new Scanner(System.in);
		// System.out.println("delete from student where id=:");
		// int id = sc.nextInt();
		// sc.close();
		// int result = studentDao.delete(id);
		// System.out.println("Student Deleted"+result);

		// ROW MAPPER OBJECT

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Student id=:");
		// int id = sc.nextInt();
		// sc.close();
		// Student student = studentDao.getStudent(id);
		// System.out.println("Student Data:"+" "+student);

		// ROW MAPPER LIST

		 List<Student> students = studentDao.getAllStudents();
		 for (Student s : students) {

		 System.out.println("Students Data:"+" "+students);

		 }

	}
}
