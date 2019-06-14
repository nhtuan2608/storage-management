package spring.repository;

import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
@Repository
public class UserDAOImpl implements GenericDAO<User> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		Logger logger = Logger.getLogger(this.getClass().getName());
		String msg = "Update User: " + user;
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
	    session.remove(usr);
	}

	@Override
	public void update(User user) {
		Session session = sessionFactory.getCurrentSession();
	    session.update(user);
	}

	@Override
	public boolean isExist(String id) {
		User usr = findById(id);
		if(usr != null)
		{
			return true;
		}
		return false;
	}
	
}
