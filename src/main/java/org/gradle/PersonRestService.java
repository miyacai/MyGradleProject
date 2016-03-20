package org.gradle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/print")
public class PersonRestService {

	@Autowired
	protected JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Person> printS() {
		String ls = "select * from users";
		List<Person> persons = (List<Person>) jdbcTemplate.query(ls,
				new Person());
		return persons;
	}
}
