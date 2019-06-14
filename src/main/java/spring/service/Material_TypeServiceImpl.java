package spring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.model.Material_Type;
import spring.repository.GenericDAO;

@Service
public class Material_TypeServiceImpl implements GenericService<Material_Type>{

	@Autowired
	private GenericDAO<Material_Type> materialTypeDAO;
	
	@Override
	public void save(Material_Type entity) {
		materialTypeDAO.save(entity);
	}

	@Override
	public List<Material_Type> findAll() {
		return materialTypeDAO.findAll();
	}

	@Override
	public Material_Type findById(String id) {
		return materialTypeDAO.findById(id);
	}

	@Override
	public void delete(String id) {
		materialTypeDAO.delete(id);
	}

	@Override
	public void update(Material_Type entity) {
		materialTypeDAO.update(entity);
	}

	@Override
	public boolean isExist(String id) {
		return materialTypeDAO.isExist(id);
	}
	
}
