package com.prajwal.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prajwal.web.model.Person;
import com.prajwal.web.service.PersonService;

@RestController
@RequestMapping("/server")
public class ServerController {

	@Autowired
	PersonService service;
	
	@GetMapping("/person")
	public List<Person> hello()
	{
		return service.findAll();
	}
}
