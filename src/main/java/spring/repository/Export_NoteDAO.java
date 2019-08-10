package spring.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.Export_Note;

@Repository
public class Export_NoteDAO implements GenericDAO<Export_Note> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Export_Note entity) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
	}

	@Override
	public List<Export_Note> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Export_Note", Export_Note.class).getResultList();
	}

	@Override
	public Export_Note findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Export_Note.class, id);
	}

	@Override
	public Export_Note findByIntegerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Export_Note entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isExist(Export_Note entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExist(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Export_Note findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Export_Note> getListById(String id) {
		// TODO Auto-generated method stub
		return null;
	}



}
