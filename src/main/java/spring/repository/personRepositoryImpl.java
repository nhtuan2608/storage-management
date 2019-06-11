package spring.repository;

import java.util.ArrayList;
import java.util.List;

import spring.model.Person;

public class personRepositoryImpl implements personRepository<Person>{

	
	public List<Person> getAllPerson() {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(1, "Tuan"));
		return personList;
	}

}
