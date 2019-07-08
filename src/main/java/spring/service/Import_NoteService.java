package spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.model.Import_Note;
import spring.repository.GenericDAO;
@Service
@Transactional
public class Import_NoteService implements GenericService<Import_Note>{

	@Autowired
	private GenericDAO<Import_Note> import_noteDAO;
	
	@Override
	public void save(Import_Note entity) {
		import_noteDAO.save(entity);
	}

	@Override
	public List<Import_Note> findAll() {
		return import_noteDAO.findAll();
	}

	@Override
	public Import_Note findById(String id) {
		return import_noteDAO.findById(id);
	}

	@Override
	public Import_Note findByIntegerId(Integer id) {
		return import_noteDAO.findByIntegerId(id);
	}

	@Override
	public Import_Note returnUserFindByName(String userName) {
		return null;
	}

	@Override
	public void delete(String id) {
		import_noteDAO.delete(id);
	}

	@Override
	public void update(Import_Note entity) {
		import_noteDAO.update(entity);		
	}

	@Override
	public boolean isExist(Import_Note entity) {
		return import_noteDAO.isExist(entity);
	}

	@Override
	public boolean findByName(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Import_Note> getListByAttribute(String t) {
		// TODO Auto-generated method stub
		return null;
	}

}
