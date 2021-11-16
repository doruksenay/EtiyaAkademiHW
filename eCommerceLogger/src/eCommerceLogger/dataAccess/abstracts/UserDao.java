package eCommerceLogger.dataAccess.abstracts;

import java.util.List;

import eCommerceLogger.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void get(int id);
	boolean getEmail(String email);
	boolean getPassword(String password);
	List<User> getAll();
	void update(User user);

}
