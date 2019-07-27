//package spring.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import spring.model.Role;
//import spring.repository.GenericDAO;
//
//@Service
//@Transactional
//public class RoleService implements GenericService<Role>{
//
//	@Autowired
//	private GenericDAO<Role> roleDAO;
//	@Override
//	public void save(Role entity) {
//		roleDAO.save(entity);
//	}
//
//	@Override
//	public List<Role> findAll() {
//		return roleDAO.findAll();
//	}
//
//	@Override
//	public Role findById(String id) {
//		return roleDAO.findById(id);
//	}
//
//	@Override
//	public Role findByIntegerId(Integer id) {
//		return roleDAO.findByIntegerId(id);
//	}
//
//	@Override
//	public Role returnUserFindByName(String name) {
//		return roleDAO.findByName(name);
//	}
//
//	@Override
//	public void delete(String id) {
//		roleDAO.delete(id);
//	}
//
//	@Override
//	public void update(Role entity) {
//		roleDAO.update(entity);
//	}
//
//	@Override
//	public boolean isExist(Role entity) {
//		return roleDAO.isExist(entity);
//	}
//
//	@Override
//	public boolean findByName(String userName) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public List<Role> getListByAttribute(String t) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
