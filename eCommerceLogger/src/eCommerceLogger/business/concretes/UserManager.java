package eCommerceLogger.business.concretes;

import eCommerceLogger.business.abstracts.CheckService;
import eCommerceLogger.business.abstracts.UserService;
import eCommerceLogger.business.abstracts.VerificationService;
import eCommerceLogger.dataAccess.abstracts.UserDao;
import eCommerceLogger.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	VerificationService verificationService;
	CheckService CheckService;
	

	public UserManager(UserDao userDao, VerificationService verificationService, CheckService userCheckService) {
		this.userDao = userDao;
		this.verificationService = verificationService;
		this.CheckService = userCheckService;
	}

	@Override
	public void signUp(User user) {
		if (CheckService.isValid(user) == true ) {
			System.out.println("Kayıt oluşturuldu.");
			verificationService.sendToVerifyMail(user.geteMail());
			userDao.add(user);
		}
	}

	@Override
	public void signIn(User user) {

		verificationService.verifyMail(user.geteMail());

		if (userDao.getEmail(user.geteMail()) && userDao.getPassword(user.getPassword())
				&& verificationService.checkVerifyAccount(user.geteMail()) == true) {
			System.out.println("Başarılı giriş.");
		} else if (verificationService.checkVerifyAccount(user.geteMail()) == false) {
			System.out.println("Doğrulanmadı.");
		} 
	}

}