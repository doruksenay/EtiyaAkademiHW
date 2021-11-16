package eCommerceLogger.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceLogger.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {

	List<String> verificatedEmails = new ArrayList<String>();
	
	@Override
	public void sendToVerifyMail(String email) {
		verificatedEmails.add(email+" Dogrulama Islemi Basari Ile Gerceklestirildi.");
		
	}

	@Override
	public void verifyMail(String email) {
		System.out.println(email+" dogrulama maili gonderildi");
//		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

}