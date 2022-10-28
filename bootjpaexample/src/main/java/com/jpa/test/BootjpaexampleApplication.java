package com.jpa.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		//Create
		
//		User user1=new User();
//		user1.setName("Vishal Singh");
//		user1.setCity("Bharmar");
//		user1.setStatus("I am a Java Programmer");
//		
//		User user2=new User();
//		user2.setName("Vijay Singh");
//		user2.setCity("Jawali");
//		user2.setStatus("I am a Python Programmer");
//		
//		//Saving single User
//		//User resultUser = userRepository.save(user1);
//		
//		//Saving Multiple Users
//		
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
		//Update
//		
//		Optional<User> optional = userRepository.findById(2);
//		
//		User user = optional.get();
//		
//		user.setName("Shanu");
//		
//		User result = userRepository.save(user);
//		
//		System.out.println(result);
		
		//Read
		
//		Iterable<User> itr = userRepository.findAll();
		
		//One Way to Read All
		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
		
		//Second Way to Read All
		
//		itr.forEach(user->System.out.println(user));
		
		//Delete
		
		userRepository.deleteById(2);
		
		System.out.println("Deleted 2nd User");
		
	}

}
