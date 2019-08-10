package spring.repository;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Supplier;

@Repository
public class SupplierDAO implements GenericDAO<Supplier>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Supplier entity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
		Logger logger = Logger.getLogger(this.getClass().getName());
		String msg = "Update Supplier: " + entity;
		logger.info(msg);
	}

	@Override
	public List<Supplier> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Supplier",Supplier.class).getResultList();
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
	public boolean isExist(Supplier entity) {
		return findById(entity.getId()) != null;
	}

	@Override
	public boolean isExist(String userName) {
		Session session = sessionFactory.getCurrentSession();
		Supplier supplier = session.get(Supplier.class, userName);
		if(supplier != null) {
			return true;
		}
		return false;
	}

	@Override
	public Supplier findByIntegerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier findByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> getListById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}
