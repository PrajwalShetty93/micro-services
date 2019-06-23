package com.prajwal.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prajwal.web.model.Person;
import com.prajwal.web.repository.PersonRepository;
@Service
public class PersonService {

	@Autowired
	PersonRepository repository;
	
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
