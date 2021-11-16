package eCommerceLogger.business.abstracts;

import eCommerceLogger.entities.concretes.User;

public interface CheckService {
	
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkPassword(User user);
	boolean checkEmail(User user);
	boolean uniqueEmail(User user);
	boolean isValid(User user);

}
