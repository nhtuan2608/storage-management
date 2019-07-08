package spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.model.Address;
import spring.repository.GenericDAO;

/**
* AddressServiceImpl
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-27 
*/
@Service
@Transactional
public class AddressService implements GenericService<Address>{

	   @Autowired
	   private GenericDAO<Address> addressDAO;
	   
	   @Override
	   public void save(Address Address) {
		   addressDAO.save(Address);
	   }
	 
	   @Override
	   public List<Address> findAll() {
	      return addressDAO.findAll();
	   }

	@Override   
	public void update(Address Address) {
		addressDAO.update(Address);
	}

	@Override
	public Address findByIntegerId(Integer id) {
		return addressDAO.findByIntegerId(id);
	}

	@Override
	public void delete(String id) {
		addressDAO.delete(id);	
	}

	@Override
	public boolean isExist(Address entity) {
		return addressDAO.isExist(entity);
	}

	@Override
	public boolean findByName(String addressName) {
		return addressDAO.isExist(addressName);
	}

	@Override
	public Address findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address returnUserFindByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> getListByAttribute(String t) {
		// TODO Auto-generated method stub
		return null;
	}
}
