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
@Transactional
public class UserService implements GenericService<User>{

	   @Autowired
	   private GenericDAO<User> userDAO;

	   @Override
	   public void save(User user) {
		   userDAO.save(user);
	   }
	 
	   @Override
	   public List<User> findAll() {
	      return userDAO.findAll();
	   }

	@Override   
	public void update(User user) {
		userDAO.update(user);
	}

	@Override
	public User findById(String id) {
		return userDAO.findById(id);
	}

	@Override
	public void delete(String id) {
		userDAO.delete(id);	
	}

	@Override
	public boolean isExist(User entity) {
		return userDAO.isExist(entity);
	}

	@Override
	public boolean findByName(String userName) {
		return userDAO.findByName(userName);
	}
	
	@Override
	public User returnUserFindByName(String userName) {
		return userDAO.returnUserFindByName(userName);
	}
	
	@Override
	public User findByIntegerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
