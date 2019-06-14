package spring.repository;

import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.Material_Type;

@Repository
public class Material_TypeDAOImpl implements  GenericDAO<Material_Type>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Material_Type entity) {
		Session session = sessionFactory.getCurrentSession();
		Logger logger = Logger.getLogger(this.getClass().getName());
		String msg = "Update Material: " + entity;
		logger.info(msg);
		session.saveOrUpdate(entity);
	}

	@Override
	public List<Material_Type> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Material_Type", Material_Type.class).getResultList();
	}

	@Override
	public Material_Type findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Material_Type.class, id);
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		Material_Type entity = findById(id);
		session.remove(entity);
	}

	@Override
	public void update(Material_Type entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public boolean isExist(String id) {
		Material_Type obj = findById(id);
		if(obj != null)
		{
			return true;
		}
		else
			return false;
	}

}
