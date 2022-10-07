package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while (go)
        {
        	System.out.println("Press 1 to add new student");
        	System.out.println("Press 2 to display all students");
        	System.out.println("Press 3 to get detail of a single student");
        	System.out.println("Press 4 to delete a student");
        	System.out.println("Press 5 to update a student");
        	System.out.println("Press 6 to exit");
        	
        	try {
        		
        		int input = Integer.parseInt(br.readLine());
        	switch(input)
        	{
        	
        	case 1:
        		
        		System.out.println("Enter new student details");
        		
         		System.out.println("Enter Student id=:");
         		int uid = Integer.parseInt(br.readLine());
         		
         		System.out.println("Enter Student name=:");
         		String uName = br.readLine();
         		
         		System.out.println("Enter Student city=:");
         		String uCity = br.readLine();
         		
         		Student student = new Student();
         		student.setStudentId(uid);
         		student.setStudentName(uName);
         		student.setStudentCity(uCity);
    
         	    int result = studentDao.insert(student);
    
         	    System.out.println("Student Added" + result);
         	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         	    System.out.println();
        		break;
        		
        	case 2:
        		
        		 List<Student> students = studentDao.getAllStudents();
        		 for (Student st : students) {
                 
                 System.out.println("Students's Id:"+" "+st.getStudentId());
        		 System.out.println("Student's Name:"+" "+st.getStudentName());
        		 System.out.println("Students's City:"+" "+st.getStudentCity());
        		 System.out.println("----------------------------------------------------------");
        		 }
        		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        		 
        		break;
        		
        	case 3:
        		
        		System.out.println("Enter Student id=:");
         		int userid = Integer.parseInt(br.readLine());
         		Student student1 = studentDao.getStudent(userid);
         		System.out.println("Students's Id:"+" "+student1.getStudentId());
        		System.out.println("Student's Name:"+" "+student1.getStudentName());
        		System.out.println("Students's City:"+" "+student1.getStudentCity());
        		System.out.println("----------------------------------------------------------");
         		
        		break;
        		
        	case 4:
        		
        		System.out.println("Enter Student id=:");
         		int id = Integer.parseInt(br.readLine());
         		studentDao.deleteStudent(id);
        		System.out.println("Student Data Deleted");
        		
        		break;
        		
        	case 5:
        		
                System.out.println("Enter Student id to be updated:");
                
                System.out.println("Enter new student details:");
        		
         		System.out.println("Enter Student id=:");
         		int Id = Integer.parseInt(br.readLine());
         		
         		System.out.println("Enter Student name=:");
         		String Name = br.readLine();
         		
         		System.out.println("Enter Student city=:");
         		String City = br.readLine();
         		
         		Student student5 = new Student();
         		student5.setStudentId(Id);
         		student5.setStudentName(Name);
         		student5.setStudentCity(City);
    
         	    studentDao.updateStudent(student5);
         	    System.out.println("Student Updated");
                
//                int r1 = Integer.parseInt(br.readLine());
//                
//                Student student5 = studentDao.getStudent(r1);
//                
//                System.out.println("Enter Student's new details:");
//        		
//         		System.out.println("Enter Student id=:");
//         		int oid = Integer.parseInt(br.readLine());
//         		
//         		System.out.println("Enter Student name=:");
//         		String oName = br.readLine();
//         		
//         		System.out.println("Enter Student city=:");
//         		String oCity = br.readLine();
//         		
//         		
//         		student5.setStudentId(oid);
//         		student5.setStudentName(oName);
//         		student5.setStudentCity(oCity);
//         		
//         		studentDao.updateStudent(student5);
//         		System.out.println("Student Updated");
        		
        		break;
        		
        	case 6:
        		go = false;
        		break;
        	}
				
			} catch (Exception e) {
				System.out.println("invalid Input try with another one");
				System.out.println(e.getMessage());
			}
        }
        
        System.out.println("Thank you for using my Application");
        
           // C Create or INSERT

//     		Student student = new Student();
//     		Scanner sc = new Scanner(System.in);
//     		System.out.println("Enter Student id=:");
//     		int id = sc.nextInt();
//     		System.out.println("Enter Student name=:");
//     		String name = sc.next();
//     		System.out.println("Enter Student city=:");
//     		String city = sc.next();
//     		sc.close();
//     		student.setStudentId(id);
//     		student.setStudentName(name);
//     		student.setStudentCity(city);
//
//     	    int result = studentDao.insert(student);
//
//     	    System.out.println("Student Added" + result);
    }
}
