package DSA.Java.SortAlorithms;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 23, 45, 1, -5, 78, 14, 90, 7 };

		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
				

			}

		}
		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);

		}
	}

	public static void swap(int[] intArr, int i, int j) {

		if (i == j) {
			return;
		}
		int temp = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = temp;

	}

}
