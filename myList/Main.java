package homework2;

import java.util.Scanner;

public class Main {                                         //integer girilmemesi gerekiyor, sadece string için tanımlı.

	public static void main(String[] args) {

		myList list = new myList();

		list.Add("İstanbul");
		list.Add("İzmir");
		list.Add("Ankara");
		list.Add("Bolu");
		System.out.println("Eklemeli liste: ");

		list.list();

		list.Remove("Bolu");
		System.out.println("Çıkartılmış liste: ");
		list.list();

		boolean result = list.Contains("Ankara");
		if (result == false) {
			System.out.println("Malesef listede yok.");
		} else {
			System.out.println("Listede mevcut.");
		}

	}

}