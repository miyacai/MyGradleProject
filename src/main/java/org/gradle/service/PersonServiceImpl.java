package org.gradle.service;

import java.util.List;

import org.gradle.mapper.PersonMapper;
import org.gradle.modle.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("personService")
public class PersonServiceImpl {

	@Autowired
	protected PersonMapper personMapper;
	
	public List<Person> getAllPersons() {
		return personMapper.getAllPersons();
	}

}
