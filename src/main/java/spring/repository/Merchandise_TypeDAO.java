package spring.repository;

import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.Merchandise_Type;

@Repository
public class Merchandise_TypeDAO implements  GenericDAO<Merchandise_Type>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Merchandise_Type entity) {
		Session session = sessionFactory.getCurrentSession();
		Logger logger = Logger.getLogger(this.getClass().getName());
		String msg = "Update Merchandise_Type: " + entity;
		logger.info(msg);
		session.saveOrUpdate(entity);
	}

	@Override
	public List<Merchandise_Type> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Merchandise_Type", Merchandise_Type.class).getResultList();
	}

	@Override
	public Merchandise_Type findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Merchandise_Type.class, id);
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		Merchandise_Type entity = findById(id);
		session.remove(entity);
	}

	@Override
	public void update(Merchandise_Type entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public boolean isExist(Merchandise_Type entity) {
		return findById(entity.getId()) != null;
	}

	@Override
	public boolean findByName(String userName) {
		Session session = sessionFactory.getCurrentSession();
		Merchandise_Type type = session.get(Merchandise_Type.class, userName);
		if(type != null) {
			return true;
		}
		return false;
	}

	@Override
	public Merchandise_Type findByIntegerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
