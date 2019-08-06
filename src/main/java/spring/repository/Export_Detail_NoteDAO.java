package spring.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.model.Export_Detail_Note;

@Repository
public class Export_Detail_NoteDAO implements GenericDAO<Export_Detail_Note>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Export_Detail_Note entity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
		
	}

	@Override
	public List<Export_Detail_Note> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Export_Detail_Note> list = session.createQuery("FROM Export_Detail_Note", Export_Detail_Note.class).getResultList();
		return list;
	}

	@Override
	public Export_Detail_Note findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Export_Detail_Note.class, id);
	}
	
	
	public Export_Detail_Note findByForeignKey(String foreignKey) {
		Session session = sessionFactory.getCurrentSession();
		Export_Detail_Note exportDetail = session.createQuery("FROM Export_Detail_Note WHERE export_Note_id='" + foreignKey + "'", Export_Detail_Note.class).getSingleResult();
		return exportDetail;
	}

	@Override
	public Export_Detail_Note findByIntegerId(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Export_Detail_Note.class, id);
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		session.remove(findById(id));
		
	}

	@Override
	public void update(Export_Detail_Note entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public boolean isExist(Export_Detail_Note entity) {
		return findById(entity.getId()) != null;
	}

	@Override
	public boolean isExist(String name) {
		Session session = sessionFactory.getCurrentSession();
		Export_Detail_Note user = session.get(Export_Detail_Note.class, name);
		if(user != null) {
			return true;
		}
		return false;
	}

	@Override
	public Export_Detail_Note findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Export_Detail_Note> getListById(String id) {
		Session session = sessionFactory.getCurrentSession();
		List<Export_Detail_Note> list = session.createQuery("FROM Export_Detail_Note WHERE export_Note_id=:export_Note_id",Export_Detail_Note.class).setParameter("export_Note_id", id).getResultList();
		return list;
	}

}
