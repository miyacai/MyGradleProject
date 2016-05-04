package org.gradle.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.gradle.mapper.PersonMapper;
import org.gradle.modle.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("personService")
public class PersonServiceImpl {
	
    private static final Logger LOG = LogManager.getLogger(PersonServiceImpl.class);

	@Autowired
	protected PersonMapper personMapper;
	
	public List<Person> getAllPersons() {
		LOG.trace("trace message");
		LOG.debug("debug message");
		LOG.info("info message");
		LOG.warn("warn message");
		LOG.error("error message");
		LOG.fatal("fatal message");
		System.out.println("Hello World!");
		return personMapper.getAllPersons();
	}
	
}
