package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.model.Supplier;
import spring.repository.GenericDAO;

@Service
@Transactional
public class SupplierService implements GenericService<Supplier>{

	@Autowired
	private GenericDAO<Supplier> supplierDAO;
	
	
	@Override
	public void save(Supplier entity) {
		supplierDAO.save(entity);
	}

	@Override
	public List<Supplier> findAll() {
		return supplierDAO.findAll();
	}

	@Override
	public Supplier findById(String id) {
		return supplierDAO.findById(id);
	}

	@Override
	public void delete(String id) {
		supplierDAO.delete(id);
	}

	@Override
	public void update(Supplier entity) {
		supplierDAO.update(entity);
	}

	@Override
	public boolean isExist(Supplier entity) {
		return supplierDAO.isExist(entity);
	}

}
