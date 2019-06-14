package spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.model.Material;

@Repository
public class MaterialDAOImpl implements GenericDAO<Material>{
	
	@Autowired
	private GenericDAO<Material> materialDAO;
	
	@Override
	@Transactional
	public void save(Material entity) {
		materialDAO.save(entity);
	}
	@Override
	@Transactional
	public List<Material> findAll() {
		return materialDAO.findAll();
	}

	@Override
	@Transactional
	public Material findById(String id) {
		return materialDAO.findById(id);
	}

	@Override
	@Transactional
	public void delete(String id) {
		materialDAO.delete(id);
	}

	@Override
	@Transactional
	public void update(Material entity) {
		materialDAO.update(entity);
	}

	@Override
	@Transactional
	public boolean isExist(String id) {
		return materialDAO.isExist(id);
	}

}
