package spring.repository;

import java.util.List;
import java.util.logging.Logger;
<<<<<<< HEAD

import javax.persistence.TypedQuery;

=======
>>>>>>> Tuan
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
@Repository
<<<<<<< HEAD
@Transactional(rollbackFor = Exception.class)
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		Logger logger = Logger.getLogger(this.getClass().getName());
		String msg = "User: " + user;
		logger.info(msg);
		session.saveOrUpdate(user);
	}

	@Override
	public List<User> findAll() {
//		@SuppressWarnings("unchecked")
//		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
//		return query.getResultList();
//		
		Session session = sessionFactory.getCurrentSession();
	    return session.createQuery("FROM User", User.class).getResultList();
	}

	@Override
	public User findById(String id) {
		Session session = sessionFactory.getCurrentSession();
	    return session.get(User.class, id);
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		User usr = findById(id);
		System.out.println(usr);
	    session.remove(usr);
	}

	@Override
	public void update(User user) {
		Session session = sessionFactory.getCurrentSession();
	    session.update(user);
	}

	@Override
	public boolean existUser(String id) {
		Session session = sessionFactory.getCurrentSession();
		User usr = session.get(User.class, id);
		if(usr != null)
		{
			return true;
		}
		return false;
=======
public class UserDAOImpl implements GenericDAO<User> {

	@Autowired
	private SessionFactory sessionFactory;
	Logger logger = Logger.getLogger(this.getClass().getName());
		
	@Override
	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		
		String msg = "Saved User: " + user;
		logger.info(msg);
		session.saveOrUpdate(user);
	}

	@Override
	public List<User> findAll() {
//		@SuppressWarnings("unchecked")
//		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
//		return query.getResultList();
//		
		Session session = sessionFactory.getCurrentSession();
		List<User> users = session.createQuery("FROM User", User.class).getResultList();
		if(users.size() > 0)
		{
			String msg = "Found "+ users.size() +" User: " + users;
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
	    session.update(user);
	}

	@Override
	public boolean isExist(User entity) {
		return findById(entity.getId()) != null;

>>>>>>> Tuan
	}
	
}
