package DSA.Java.SortAlorithms;

import java.util.Arrays;

public class ArraySortingUsingJDK extends ArrayBaseClass{
	public static void main(String[] args) {
		
		printBeforeSort();
		
		Arrays.parallelSort(arr);
		
		printAfterSort();
		
		
	}

}
