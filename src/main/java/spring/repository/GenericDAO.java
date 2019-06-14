package spring.repository;

import java.util.List;

public interface GenericDAO<E> {
	void save(E entity);
	List<E> findAll();
	E findById(String id);
	void delete(String id);
	void update(E entity);
	boolean isExist(String id);
}
