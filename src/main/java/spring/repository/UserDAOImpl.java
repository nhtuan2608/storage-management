package spring.repository;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.model.User;

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
		System.out.println(usr);
	    session.remove(usr);
	}

	@Override
	public void update(User user) {
		Session session = sessionFactory.getCurrentSession();
	    session.update(user);
	}

	@Override
	public boolean isExist(String id) {
		Session session = sessionFactory.getCurrentSession();
		User usr = session.get(User.class, id);
		if(usr != null)
		{
			return true;
		}
		return false;
	}
	
}
