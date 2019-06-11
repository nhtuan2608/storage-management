package spring.service;

import java.util.List;

import spring.model.Person;
import spring.repository.personRepository;
import spring.repository.personRepositoryImpl;

public class personServiceImpl implements personService {
//	private personRepository<Person> personRepo = new personRepositoryImpl(); // có thể thay thế bằng Setter injection
	
	// Sử dụng Setter injection
	// Tạo getter và setter rồi gọi setter bên beans.xml
	private personRepository<Person> personRepo;
	
		
	public personRepository<Person> getPersonRepo() {
		return personRepo;
	}

	public void setPersonRepo(personRepository<Person> personRepo) {
		System.out.println("Setter Injection");
		this.personRepo = personRepo;
	}



	/* (non-Javadoc)
	 * @see spring.service.personService#getAllPerson()
	 */
	public List<Person> getAllPerson(){
		return personRepo.getAllPerson();
		
	}
}
