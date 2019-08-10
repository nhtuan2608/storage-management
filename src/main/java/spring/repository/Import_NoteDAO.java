package spring.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Import_Note;

@Repository
public class Import_NoteDAO implements GenericDAO<Import_Note>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Import_Note entity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
	}

	@Override
	public List<Import_Note> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Import_Note", Import_Note.class).getResultList();
	}

	@Override
	public Import_Note findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Import_Note.class, id);
	}

	@Override
	public Import_Note findByIntegerId(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Import_Note.class, id);
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		session.remove(findById(id));
	}

	@Override
	public void update(Import_Note entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public boolean isExist(Import_Note entity) {
		return findById(entity.getId()) != null;
	}

	@Override
	public boolean isExist(String name) {
		Session session = sessionFactory.getCurrentSession();
		Import_Note user = session.get(Import_Note.class, name);
		if(user != null) {
			return true;
		}
		return false;
	}

	@Override
	public Import_Note findByName(String id) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("get: "+ session.createQuery("SELECT from_unixtime(time, '%Y %D %M %h:%i:%s') FROM Import_Note WHERE id =:id").setParameter("id", id));	
		return null;
	}

	@Override
	public List<Import_Note> getListById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
