package spring.repository;

import java.util.List;

/**
* GenericDAO
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-11 
*/
public interface GenericDAO<E> {
	void save(E entity);
	List<E> findAll();
	E findById(String id);
	void delete(String id);
	void update(E entity);
	boolean isExist(String id);
}
