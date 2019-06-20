package spring.repository;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.Material;

/**
* MaterialDAOImpl
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-14 
*/
@Repository
public class MaterialDAOImpl implements GenericDAO<Material>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Material entity) {
		Session session = sessionFactory.getCurrentSession();
		Logger logger = Logger.getLogger(this.getClass().getName());
		String msg = "Update Material: " + entity;
		logger.info(msg);
		session.saveOrUpdate(entity);
	}

	@Override
	public List<Material> findAll() {
		Session session = sessionFactory.getCurrentSession();
	    return session.createQuery("FROM Material", Material.class).getResultList();
	}

	@Override
	public Material findById(String id) {
		Session session = sessionFactory.getCurrentSession();
	    return session.get(Material.class, id);
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		Material obj = findById(id);
	    session.remove(obj);
	}

	@Override
	public void update(Material entity) {
		Session session = sessionFactory.getCurrentSession();
	    session.update(entity);
	}

	@Override
	public boolean isExist(Material entity) {
		return findById(entity.getId()) != null;
	}
	
	
}
