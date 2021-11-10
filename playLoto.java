package intro;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class playLoto {

	public static void main(String[] args) {
		
		int column = 0;
		ArrayList<Integer> numbers;
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Kolon sayısını giriniz: ");
		column = scan.nextInt();
		
		while(column == 0) {
			System.out.println("0'dan büyük sayı giriniz.");
			break;
		}
		
		for(int col = 1; col <= column; col++) {
			numbers = new ArrayList<Integer>();
			while(numbers.size()<6) {
				int rnd = random.nextInt(48) + 1;
				if(!numbers.contains(rnd)) {
					numbers.add(rnd);
					System.out.println(rnd + " ");
				}
			}
			System.out.println("\n");
		}

	}

}
