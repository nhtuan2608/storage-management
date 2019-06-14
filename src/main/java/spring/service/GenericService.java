package spring.service;

import java.util.List;

/**
* GenericService
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-11 
*/
public interface GenericService<E> {
	void save(E entity);
	List<E> findAll();
	E findById(String id);
	void delete(String id);
	void update(E entity);
	boolean isExist(String id);
}
