package DSA.Java.SortAlorithms;

public class BubbleSort extends ArrayBase {
	public static void main(String[] args) {
		printBeforeSort();
		
		System.out.println("\nAfter BubbleSort");

		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}

			}

		}
		printAfterSort();
	}

	

}
