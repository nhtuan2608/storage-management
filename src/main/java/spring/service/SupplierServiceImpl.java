package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.model.Supplier;
import spring.repository.GenericDAO;

@Service
public class SupplierServiceImpl implements GenericService<Supplier>{

	@Autowired
	private GenericDAO<Supplier> supplierDAO;
	
	
	@Override
	@Transactional
	public void save(Supplier entity) {
		supplierDAO.save(entity);
	}

	@Override
	@Transactional
	public List<Supplier> findAll() {
		return supplierDAO.findAll();
	}

	@Override
	@Transactional
	public Supplier findById(String id) {
		return supplierDAO.findById(id);
	}

	@Override
	@Transactional
	public void delete(String id) {
		supplierDAO.delete(id);
	}

	@Override
	@Transactional
	public void update(Supplier entity) {
		supplierDAO.update(entity);
	}

	@Override
	@Transactional
	public boolean isExist(String id) {
		return supplierDAO.isExist(id);
	}

}
