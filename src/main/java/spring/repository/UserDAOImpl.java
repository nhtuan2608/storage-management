package spring.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.DAO.UserDao;
import spring.model.User;

@Repository
public class UserDAOImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		session.close();
	}

	@Override
	public List<User> findAll() {
//		@SuppressWarnings("unchecked")
//		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
//		return query.getResultList();
//		
		Session session = sessionFactory.getCurrentSession();
	    return session.createQuery("FROM Customer", User.class).getResultList();
	}

	@Override
	public User findById(int id) {
		Session session = sessionFactory.getCurrentSession();
	    return session.get(User.class, id);
	}

	@Override
	public void delete(User user) {
		Session session = sessionFactory.getCurrentSession();
	    session.remove(user);
	    session.close();
	}

	@Override
	public void update(User user) {
		Session session = sessionFactory.getCurrentSession();
	    session.update(user);
	}

}
