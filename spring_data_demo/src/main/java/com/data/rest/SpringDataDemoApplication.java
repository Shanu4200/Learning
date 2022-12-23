package com.data.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
	
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Book book=new Book();
		book.setTitle("My First Book's Demo");
		book.setContent("This is a demo of First Book.");
		
		Book book1=new Book();
		book.setTitle("My Second Book's Demo");
		book.setContent("This is a demo of Second Book.");
		
		Book book2=new Book();
		book.setTitle("My Third Book's Demo");
		book.setContent("This is a demo of Third Book.");
		
		this.bookRepository.save(book);
		
		this.bookRepository.save(book1);
		
		this.bookRepository.save(book2);
		
	}

}
