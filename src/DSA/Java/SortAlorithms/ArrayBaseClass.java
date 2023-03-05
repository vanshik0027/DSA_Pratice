package DSA.Java.SortAlorithms;

public class ArrayBaseClass {
	static int[] arr = { 23, 45, 1, -5, 78, 14, 90, 7,9 };

	

	public static void printBeforeSort() {
		System.out.println("Before Sort");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);

		}
	}
	public static void printAfterSort() {
		System.out.println("\nAfter Sort");
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
