package spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.model.Export_Note;
import spring.repository.GenericDAO;

@Service
@Transactional
public class Export_NoteService implements GenericService<Export_Note>{

	@Autowired
	private GenericDAO<Export_Note> export_noteDAO;
	
	@Override
	public void save(Export_Note entity) {
		export_noteDAO.save(entity);
	}

	@Override
	public List<Export_Note> findAll() {
		return export_noteDAO.findAll();
	}

	@Override
	public Export_Note findById(String id) {
		return export_noteDAO.findById(id);
	}

	@Override
	public Export_Note findByIntegerId(Integer id) {
		return export_noteDAO.findByIntegerId(id);
	}

	@Override
	public Export_Note returnUserFindByName(String userName) {
		return export_noteDAO.findByName(userName);
	}

	@Override
	public void delete(String id) {
		export_noteDAO.delete(id);
		
	}

	@Override
	public void update(Export_Note entity) {
		export_noteDAO.update(entity);
		
	}

	@Override
	public boolean isExist(Export_Note entity) {
		return export_noteDAO.isExist(entity);
	}

	@Override
	public boolean findByName(String userName) {
		return true;
	}

	@Override
	public List<Export_Note> getListByAttribute(String t) {
		// TODO Auto-generated method stub
		return null;
	}

}
