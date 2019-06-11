package spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Person;
import spring.service.personService;

public class springApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans/beans.xml");
//		Person person = (Person)context.getBean("person");
//		person.speak();
			
//		System.out.println(person);
		
		personService service = context.getBean("personService", personService.class);
		System.out.println(service.getAllPerson());
		((ClassPathXmlApplicationContext)context).close();
	}

}
