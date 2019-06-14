package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.model.Material;
import spring.repository.GenericDAO;


/**
* MaterialServiceImpl
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-14 
*/
@Service
public class MaterialServiceImpl implements GenericService<Material>{

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
