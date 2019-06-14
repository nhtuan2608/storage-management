package spring.repository;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Supplier;

@Repository
public class SupplierDAOImpl implements GenericDAO<Supplier>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Supplier entity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
		Logger logger = Logger.getLogger(this.getClass().getName());
		String msg = "Update User: " + entity;
		logger.info(msg);
	}

	@Override
	public List<Supplier> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM SUPPLIER",Supplier.class).getResultList();
	}

	@Override
	public Supplier findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Supplier.class, id);
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		Supplier obj = findById(id);
		session.remove(obj);
	}

	@Override
	public void update(Supplier entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public boolean isExist(String id) {
		Supplier obj = findById(id);
		if(obj != null)
		{
			return true;
		}
		return false;
	}

}
