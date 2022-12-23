package com.testing.controllers;

import com.testing.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	public ResponseEntity<?> getAllPersons() {
		return ResponseEntity.ok(this.personService.getAllPerson());
	}

}
