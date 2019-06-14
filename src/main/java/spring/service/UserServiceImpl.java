package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.model.User;
import spring.repository.GenericDAO;


/**
* UserServiceImpl
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-11 
*/
@Service
public class UserServiceImpl implements GenericService<User>{

	   @Autowired
	   private GenericDAO<User> userDAO;
	 
	   @Override
	   @Transactional
	   public void save(User user) {
		   userDAO.save(user);
	   }
	 
	   @Override
	   @Transactional(readOnly = true)
	   public List<User> findAll() {
	      return userDAO.findAll();
	   }

	@Override   
	@Transactional
	public void update(User user) {
		userDAO.update(user);
	}

	@Override
	@Transactional
	public User findById(String id) {
		return userDAO.findById(id);
	}

	@Override
	@Transactional
	public void delete(String id) {
		userDAO.delete(id);	
	}

	@Override
	@Transactional
	public boolean isExist(String id) {
		return userDAO.isExist(id);
	}
}
