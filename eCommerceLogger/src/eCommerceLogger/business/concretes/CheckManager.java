package eCommerceLogger.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eCommerceLogger.business.abstracts.CheckService;
import eCommerceLogger.entities.concretes.User;

public class CheckManager implements CheckService {

	List<String> emailList = new ArrayList<String>();

	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().length() > 1) {
			return true;
		} else if (user.getLastName().length() == 0) {
			System.out.println("İsim alanı boş geçilemez.");
			return false;
		} else {
			System.out.println("İsim, iki harften fazla olmalıdır.");
			return false;
		}

	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().length() > 1) {
			return true;
		} else if (user.getLastName().length() == 0) {
			System.out.println("Soyad alanı boş geçilemez.");
			return false;
		} else {
			System.out.println("Soyad, iki harften fazla olmalıdır.");
			return false;
		}

	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length()>5) {
			return true;
		} else if (user.getPassword().length() == 0) {
			System.out.println("Parola alanı boş geçilemez.");
			return false;
		} else {
			System.out.println("Lütfen 6 veya daha uzun bir parola giriniz.");
			return false;
		}
	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		if (user.geteMail().isEmpty()) {
			System.out.println("Lütfen bir email adresi girin.");
			return false;
		}
		else if(pattern.matcher(user.geteMail()).find()==false){
			System.out.println("abc@mail.com olarak giriniz.");
			return false;
		}
		
		return true;
	}

	@Override
	public boolean uniqueEmail(User user) {
		boolean verify=true;
		if (emailList.contains(user.geteMail())) {
			System.out.println("BLütfen kullanılmamış bir mail adresi giriniz.");
			verify=false;
		}else {
			verify=true;
			emailList.add(user.geteMail());
		}
		return verify;
	}

	@Override
	public boolean isValid(User user) {
		if (checkFirstName(user) && checkLastName(user) && checkPassword(user) && uniqueEmail(user)) {
			return true;
		}
		return false;
	}

}