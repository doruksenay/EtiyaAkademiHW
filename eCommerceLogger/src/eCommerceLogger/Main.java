

//BU ÖDEVDE ANIL ARSLAN, KÜBRA NUR BAYINDIR VE ERDİ TUNA'NIN ÖDEVLERİNDEN YARDIM ALINMIŞTIR.



package eCommerceLogger;

import eCommerceLogger.business.concretes.CheckManager;
import eCommerceLogger.business.concretes.UserManager;
import eCommerceLogger.business.concretes.VerificationManager;
import eCommerceLogger.dataAccess.concretes.UserDaoSign;
import eCommerceLogger.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new UserDaoSign(), new VerificationManager(),
				new CheckManager());

		User user1 = new User();
		
		user1.setIdNo(1);
		user1.setFirstName("Doruk");
		user1.setLastName("ŞeNaY");
		user1.seteMail("doruk.sENAy@etiya.com");
		user1.setPassword("1234567");

		userManager.signUp(user1);
		userManager.signIn(user1);
		

	}

}