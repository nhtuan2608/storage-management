package spring.DAO;

import java.util.List;

import spring.model.User;

public interface UserDao {
	void save(User user);
	List<User> list();
}
