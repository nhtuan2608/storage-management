package spring.repository;

import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Address;

/**
* CRUD
* 
* 
*
* @author  Tuan Nguyen
* @version 1.0
* @since   2019-06-27 
*/
@Repository()
public class AddressDAO implements GenericDAO<Address> {

	@Autowired
	private SessionFactory sessionFactory;
	Logger logger = Logger.getLogger(this.getClass().getName());
		
	@Override
	public void save(Address address) {
		Session session = sessionFactory.getCurrentSession();
		String msg = "Saved Address: " + address;
		logger.info(msg);
		session.saveOrUpdate(address);
	}

	@Override
	public List<Address> findAll() {
//		@SuppressWarnings("unchecked")
//		TypedQuery<Address> query = sessionFactory.getCurrentSession().createQuery("from Address");
//		return query.getResultList();
//		
		Session session = sessionFactory.getCurrentSession();
		List<Address> addresss = session.createQuery("FROM Address", Address.class).getResultList();
		if(addresss.size() > 0)
		{
			String msg = "Found "+ addresss.size();
			logger.info(msg);
		}
		else if(addresss.size() == 0)
		{
			String msg = "Found 0 Address.";
			logger.info(msg);
		}
	    return addresss;
	}

	@Override
	public Address findByIntegerId(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Address address = session.get(Address.class, id);
		String msg = "Found: " + address;
		logger.info(msg);
	    return address;
	}

	@Override
	public void delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		Address address = findById(id);
	    session.remove(address);
	    String msg = "Deleted: " + address;
		logger.info(msg);
	}

	@Override
	public void update(Address address) {
		Session session = sessionFactory.getCurrentSession();
		String msg = "Updated Address: " + address;
		logger.info(msg);
	    session.update(address);
	}

	@Override
	public boolean isExist(Address entity) {
		return findByIntegerId(entity.getAddress_id()) != null;

	}

	@Override
	public boolean isExist(String addressName) {
		Session session = sessionFactory.getCurrentSession();
		Address address = session.get(Address.class, addressName);
		if(address != null) {
			return true;
		}
		return false;
	}

	@Override
	public Address findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> getListById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
