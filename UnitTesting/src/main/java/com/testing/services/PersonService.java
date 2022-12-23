package com.testing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.entities.Person;
import com.testing.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo repo;
	
	public List<Person> getAllPerson() {
		return this.repo.findAll();
	}

}
