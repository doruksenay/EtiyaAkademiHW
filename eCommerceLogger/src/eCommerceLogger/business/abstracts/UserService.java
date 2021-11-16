package eCommerceLogger.business.abstracts;

import eCommerceLogger.entities.concretes.User;

public interface UserService {
	void signIn(User user);
	void signUp(User user);
}
