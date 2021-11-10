package intro;

public class removeDuplicates {

	public static void main(String[] args) {

		int[] arr = new int[] { 7, 3, 6, 2, 5, 7, 9, 3, 4, 9, 9, 2, 8 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int length = arr.length;
		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[length - 1];
		for (int k = 0; k < j; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}