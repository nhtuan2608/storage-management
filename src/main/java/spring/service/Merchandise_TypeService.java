package spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.model.Merchandise_Type;
import spring.repository.GenericDAO;

@Service
@Transactional
public class Merchandise_TypeService implements GenericService<Merchandise_Type>{

	@Autowired
	private GenericDAO<Merchandise_Type> merchandise_TypeDAO;
	
	@Override
	public void save(Merchandise_Type entity) {
		merchandise_TypeDAO.save(entity);
	}

	@Override
	public List<Merchandise_Type> findAll() {
		return merchandise_TypeDAO.findAll();
	}

	@Override
	public Merchandise_Type findById(String id) {
		return merchandise_TypeDAO.findById(id);
	}

	@Override
	public void delete(String id) {
		merchandise_TypeDAO.delete(id);
	}

	@Override
	public void update(Merchandise_Type entity) {
		merchandise_TypeDAO.update(entity);
	}

	@Override
	public boolean isExist(Merchandise_Type entity) {
		return merchandise_TypeDAO.isExist(entity);
	}

	@Override
	public boolean findByName(String name) {
		return merchandise_TypeDAO.findByName(name);
	}

	@Override
	public Merchandise_Type findByIntegerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Merchandise_Type returnUserFindByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
