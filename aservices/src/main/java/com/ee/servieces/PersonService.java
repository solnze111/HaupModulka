package com.ee.servieces;

import com.ee.entity.Person.Person;

public class PersonService {

	private Person person = new Person();

	public String persName(String name) {
		person.setPname(name);
		return "hello " + person;
	}
}
