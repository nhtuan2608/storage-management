package spring.repository;

import java.util.List;

import spring.model.User;

public interface UserDAO {
	void save(User user);
	List<User> findAll();
	User findById(String id);
	void delete(String id);
	void update(User user);
	boolean existUser(String id);
}
