package org.gradle.rest.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.List;

import org.gradle.enumeration.PeopleType;
import org.gradle.modle.Person;
import org.gradle.service.PersonServiceImpl;
import org.gradle.spring.Required;
import org.gradle.spring.Required.RequiredField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "People-API")
@RestController
@RequestMapping("/v1/print")
@Required(RequiredField.SCHOOL)
public class PersonRestService {

	@Autowired
	protected JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("personService")
	protected PersonServiceImpl personServiceImpl;
	
	@ApiOperation(value ="get users", notes = "get users")
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Person> printS() {
		String ls = "select * from users";
		List<Person> persons = (List<Person>) jdbcTemplate.query(ls,
				new Person());
		return persons;
	}

	@ApiOperation(value ="get users with mybatis", notes = "get users with mybatis")
	@RequestMapping(value = "/mybatis", method = RequestMethod.GET)
	public List<Person> getPersons() {
		return personServiceImpl.getAllPersons();
	}
	
	@ApiOperation(value ="get enum", notes = "get enum")
	@RequestMapping(value = "/enum", method = RequestMethod.GET)
	public List<PeopleType> getEnum() {
		List<PeopleType> pelpleTypes = new ArrayList<PeopleType>();
		pelpleTypes.add(PeopleType.FEMALE);
		pelpleTypes.add(PeopleType.MALE);
		return pelpleTypes;
	}
}
