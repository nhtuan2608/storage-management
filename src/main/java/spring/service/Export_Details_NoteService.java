package spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.model.Export_Detail_Note;
import spring.model.Export_Detail_Note;
import spring.repository.GenericDAO;

@Service
@Transactional
public class Export_Details_NoteService implements GenericService<Export_Detail_Note>{
	
	@Autowired
	private GenericDAO<Export_Detail_Note> export_detail_noteDAO;

	@Override
	public List<Export_Detail_Note> findAll() {
		return export_detail_noteDAO.findAll();
	}

	@Override
	public Export_Detail_Note findById(String id) {
		return export_detail_noteDAO.findById(id);
	}
	
	public Export_Detail_Note findByForeignKey(String exportId) {
		return export_detail_noteDAO.findByName(exportId);
	}

	@Override
	public Export_Detail_Note findByIntegerId(Integer id) {
		return export_detail_noteDAO.findByIntegerId(id);
	}

	@Override
	public Export_Detail_Note returnUserFindByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		export_detail_noteDAO.delete(id);
	}

	@Override
	public void update(Export_Detail_Note entity) {
		export_detail_noteDAO.update(entity);
	}

	@Override
	public boolean isExist(Export_Detail_Note entity) {
		return export_detail_noteDAO.isExist(entity);
	}

	@Override
	public boolean findByName(String name) {
		return export_detail_noteDAO.isExist(name);
	}

	@Override
	public List<Export_Detail_Note> getListByAttribute(String id) {
		return export_detail_noteDAO.getListById(id);
		
	}

	@Override
	public void save(Export_Detail_Note entity) {
		export_detail_noteDAO.save(entity);
	}
	
}
