package intro;

public class sort {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 6, 2, 5, 7, 9, 3, 4, 9, 9, 2, 8 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int x : arr) {
			System.out.println(x);
		}
	}
}
