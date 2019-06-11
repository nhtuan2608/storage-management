package spring.repository;

import java.util.List;

public interface personRepository<E> {
	List<E> getAllPerson();
}
