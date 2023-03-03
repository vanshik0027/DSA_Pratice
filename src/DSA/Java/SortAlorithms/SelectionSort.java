package DSA.Java.SortAlorithms;

public class SelectionSort extends ArrayBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  printBeforeSort();

		for (int lastUsnsortedIndex = arr.length - 1; lastUsnsortedIndex > 0; lastUsnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastUsnsortedIndex; i++) {
				if (arr[i] > arr[largest]) {
					largest = i;
				}
			}
			swap(arr, largest, lastUsnsortedIndex);
		}

		System.out.println("\nAfter SelectionSort");
		printAfterSort();

	}
}
