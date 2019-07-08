package spring.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Import_Detail_Note;

@Repository
public class Import_DetailDAO implements GenericDAO<Import_Detail_Note>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Import_Detail_Note entity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
	}

	@Override
	public List<Import_Detail_Note> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Import_Detail_Note> list = session.createQuery("FROM Import_Detail_Note", Import_Detail_Note.class).getResultList();
		return list;
	}

	@Override
	public Import_Detail_Note findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Import_Detail_Note.class, id);
	}

	@Override
	public Import_Detail_Note findByIntegerId(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Import_Detail_Note.class, id);
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		session.remove(findById(id));
	}

	@Override
	public void update(Import_Detail_Note entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public boolean isExist(Import_Detail_Note entity) {
		return findById(entity.getId()) != null;
	}

	@Override
	public boolean isExist(String name) {
		Session session = sessionFactory.getCurrentSession();
		Import_Detail_Note user = session.get(Import_Detail_Note.class, name);
		if(user != null) {
			return true;
		}
		return false;
	}

	@Override
	public Import_Detail_Note findByName(String name) {
		return null;
	}

	@Override
	public List<Import_Detail_Note> getListById(String id) {
		Session session = sessionFactory.getCurrentSession();
		List<Import_Detail_Note> list = session.createQuery("FROM Import_Detail_Note WHERE import_Note_id=:import_Note_id",Import_Detail_Note.class).setParameter("import_Note_id", id).getResultList();
		return list;
	}

}
