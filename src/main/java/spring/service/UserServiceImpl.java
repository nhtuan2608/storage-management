package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.model.User;
<<<<<<< HEAD
import spring.repository.UserDAO;
=======
import spring.repository.GenericDAO;
>>>>>>> Tuan


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
@Transactional
public class UserServiceImpl implements GenericService<User>{

	   @Autowired
<<<<<<< HEAD
	   private UserDAO userDao;
=======
	   private GenericDAO<User> userDAO;
>>>>>>> Tuan
	 
	   @Override
	   public void save(User user) {
		   userDAO.save(user);
	   }
	 
	   @Override
	   @Transactional(readOnly = true)
	   public List<User> findAll() {
<<<<<<< HEAD
	      return userDao.findAll();
	   }

	@Override
	public void update(User user) {
		userDao.update(user);
=======
	      return userDAO.findAll();
	   }

	@Override   
	public void update(User user) {
		userDAO.update(user);
>>>>>>> Tuan
	}

	@Override
	public User findById(String id) {
<<<<<<< HEAD
		return userDao.findById(id);
=======
		return userDAO.findById(id);
>>>>>>> Tuan
	}

	@Override
	public void delete(String id) {
<<<<<<< HEAD
		userDao.delete(id);	
	}

	@Override
	public boolean existUser(String id) {
		return userDao.existUser(id);
	}

=======
		userDAO.delete(id);	
	}

	@Override
	public boolean isExist(User entity) {
		return userDAO.isExist(entity);
	}
>>>>>>> Tuan
}
