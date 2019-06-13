package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.model.User;
import spring.repository.UserDAO;

@Service
public class UserServiceImpl implements UserService{

	   @Autowired
	   private UserDAO userDao;
	 
	   @Transactional
	   public void save(User user) {
	      userDao.save(user);
	   }
	 
	   @Transactional(readOnly = true)
	   public List<User> findAll() {
	      return userDao.findAll();
	   }

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User findById(String id) {
		return userDao.findById(id);
	}

	@Override
	public void delete(String id) {
		userDao.delete(id);	
	}

	@Override
	public boolean existUser(String id) {
		return userDao.existUser(id);
	}

}
