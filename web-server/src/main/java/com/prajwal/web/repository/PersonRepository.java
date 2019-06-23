package com.prajwal.web.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prajwal.web.model.Person;

@Repository
public class PersonRepository {

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Person(1,"Person 1"," Description 1"),new Person(2,"Person 2"," Description 2"));
	}

}
