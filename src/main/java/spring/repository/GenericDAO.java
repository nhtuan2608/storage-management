package spring.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
* GenericDAO
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-11 
*/
@Repository
public interface GenericDAO<E> {
	void save(E entity);
	List<E> findAll();
	E findById(String id);
	E findByIntegerId(Integer id);
	void delete(String id);
	void update(E entity);
	boolean isExist(E entity);
	boolean isExist(String name);
	E findByName(String name);
	List<E> getListById(String id);
	
}
