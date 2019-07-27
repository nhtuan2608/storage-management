package spring.repository;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import spring.model.User;

/**
* CRUD
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-11 
*/
//@Qualifier("users")
@Repository
//@Component
//@Transactional
public class UserDAO implements GenericDAO<User> {

	@Autowired
	private SessionFactory sessionFactory;
	Logger logger = Logger.getLogger(this.getClass().getName());
		
	@Override
	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		String msg = "Saved User: " + user;
		logger.info(msg);
//		user.setEnabled(true);
		session.saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
//		@SuppressWarnings("unchecked")
//		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
//		return query.getResultList();
//		
		Session session = sessionFactory.getCurrentSession();
		List<User> users = session.createQuery("FROM User", User.class).getResultList();
//		List<User> users = session.createQuery("FROM User").getResultList();
		if(users.size() > 0)
		{
			String msg = "Found "+ users.size();
			logger.info(msg);
		}
		else if(users.size() == 0)
		{
			String msg = "Found 0 User.";
			logger.info(msg);
		}
	    return users;
	}

	@Override
	public User findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, id);
		String msg = "Found: " + user;
		logger.info(msg);
	    return user;
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		User user = findById(id);
	    session.remove(user);
	    String msg = "Deleted: " + user;
		logger.info(msg);
	}

	@Override
	public void update(User user) {
		Session session = sessionFactory.getCurrentSession();
		String msg = "Updated User: " + user;
		logger.info(msg);
	    session.update(user);
	}

	@Override
	public boolean isExist(User entity) {
		return findById(entity.getId()) != null;

	}

	@Override
	public boolean isExist(String userName) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, userName);
		if(user != null) {
			return true;
		}
		return false;
	}
	
	@Override
	public User findByName(String userName) {
		Session session = sessionFactory.getCurrentSession();
		List<User> query = session.createQuery("FROM User WHERE userName=:userName",User.class).setParameter("userName", userName).list();
		User user = query.get(0); 
		return user;
	}
	
	@Override
	public User findByIntegerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getListById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
