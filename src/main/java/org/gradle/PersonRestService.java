package org.gradle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/print")
public class PersonRestService {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Person printS() {
		Person person = new Person();
		person.setName("小明");
		person.setAge(4);
		person.setSex("女");
		return person;
	}
	
}
