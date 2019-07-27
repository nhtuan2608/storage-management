//package spring.repository;
//
//import java.util.List;
//import java.util.logging.Logger;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import spring.model.Role;
//
///**
//* CRUD
//* 
//* 
//*
//* @author  Tuan Nguyen
//* @version 1.0
//* @since   2019-06-11 
//*/
////@Qualifier("users")
//@Repository()
//public class RoleDAO implements GenericDAO<Role> {
//
//	@Autowired
//	private SessionFactory sessionFactory;
//	Logger logger = Logger.getLogger(this.getClass().getName());
//		
//	@Override
//	public void save(Role role) {
//		Session session = sessionFactory.getCurrentSession();
//		String msg = "Saved Role: " + role;
//		logger.info(msg);
//		session.saveOrUpdate(role);
//	}
//
//	@Override
//	public List<Role> findAll() {
////		@SuppressWarnings("unchecked")
////		TypedQuery<Role> query = sessionFactory.getCurrentSession().createQuery("from Role");
////		return query.getResultList();
////		
//		Session session = sessionFactory.getCurrentSession();
//		List<Role> roles = session.createQuery("FROM Role", Role.class).getResultList();
//		if(roles.size() > 0)
//		{
//			String msg = "Found "+ roles.size();
//			logger.info(msg);
//		}
//		else if(roles.size() == 0)
//		{
//			String msg = "Found 0 Role.";
//			logger.info(msg);
//		}
//	    return roles;
//	}
//
//	@Override
//	public void delete(String id) {
//		Session session = sessionFactory.getCurrentSession();
//		Role role = findById(id);
//	    session.remove(role);
//	    String msg = "Deleted: " + role;
//		logger.info(msg);
//	}
//
//	@Override
//	public void update(Role role) {
//		Session session = sessionFactory.getCurrentSession();
//		String msg = "Updated Role: " + role;
//		logger.info(msg);
//	    session.update(role);
//	}
//
//	@Override
//	public boolean isExist(Role entity) {
//		return findByIntegerId(entity.getId()) != null;
//
//	}
//
//	@Override
//	public boolean isExist(String name) {
//		Session session = sessionFactory.getCurrentSession();
//		Role role = session.get(Role.class, name);
//		
//		if(role != null) {
//			return true;
//		}
//		return false;
//	}
//	
//	@Override
//	public Role findByName(String name) {
//		Session session = sessionFactory.getCurrentSession();
//		Role role = (Role) session.createQuery("FROM Role WHERE name=:name").setParameter("name", name).uniqueResult();
//		String msg = "Updated Role: " + role;
//		logger.info(msg);
//		return role;
//	}
//	
//	@Override
//	public Role findByIntegerId(Integer id) {
//		Session session = sessionFactory.getCurrentSession();
//		Role role = session.get(Role.class, id);
//		String msg = "Found: " + role;
//		logger.info(msg);
//	    return role;
//	}
//
//	@Override
//	public Role findById(String id) {
//		Session session = sessionFactory.getCurrentSession();
//		Role role = session.get(Role.class, id);
//	    return role;
//	}
//
//	@Override
//	public List<Role> getListById(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//	
//}
