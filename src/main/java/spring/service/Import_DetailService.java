package spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.model.Import_Detail_Note;
import spring.repository.GenericDAO;

@Service
@Transactional
public class Import_DetailService implements GenericService<Import_Detail_Note>{

	@Autowired
	private GenericDAO<Import_Detail_Note> import_detailDAO;
	
	@Override
	public void save(Import_Detail_Note entity) {
		import_detailDAO.save(entity);
	}

	@Override
	public List<Import_Detail_Note> findAll() {
		return import_detailDAO.findAll();
	}

	@Override
	public Import_Detail_Note findById(String id) {
		return import_detailDAO.findById(id);
	}

	@Override
	public Import_Detail_Note findByIntegerId(Integer id) {
		return import_detailDAO.findByIntegerId(id);
	}

	@Override
	public Import_Detail_Note returnUserFindByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		import_detailDAO.delete(id);
	}

	@Override
	public void update(Import_Detail_Note entity) {
		import_detailDAO.update(entity);
	}

	@Override
	public boolean isExist(Import_Detail_Note entity) {
		return import_detailDAO.isExist(entity);
	}

	@Override
	public boolean findByName(String name) {
		return import_detailDAO.isExist(name);
	}

	@Override
	public List<Import_Detail_Note> getListByAttribute(String id) {
		return import_detailDAO.getListById(id);
		
	}

}
