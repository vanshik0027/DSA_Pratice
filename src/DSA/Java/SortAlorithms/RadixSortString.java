package DSA.Java.SortAlorithms;

public class RadixSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] radiArr = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

		for (int i = 0; i < radiArr.length; i++) {
			System.out.print("	"+radiArr[i]);

		}
		rdaixsort(radiArr, 30, 4);
		System.out.println("\nAfter Radix Sort ");

		for (int i = 0; i < radiArr.length; i++) {
			System.out.print("	"+radiArr[i]);
		}
	}

	public static void rdaixsort(String[] input, int radix, int width) {
		for (int i = width-1; i >=0; i--) {
			radixSingleSort(input, i, radix);
		}
	}

	public static void radixSingleSort(String[] input, int position, int radix) {
		int numItems = input.length;
		int[] countArray = new int[radix];
		for (String value : input) {
			countArray[getIndex(position, value)]++;
		}
		for(int j=1;j<radix;j++) {
			countArray[j] +=countArray[j-1];
		}
		String[] temp =new String[numItems];
		for(int tempIndex =numItems-1;tempIndex>=0;tempIndex--) {
			temp[--countArray[getIndex(position, input[tempIndex])]]= input[tempIndex];
			}
		for(int tempIndex=0;tempIndex<numItems;tempIndex++) {
			input[tempIndex]=temp[tempIndex];
		}
		

	}

	public static int getIndex(int position, String value) {
		
		return value.charAt(position)-'a';
	}
}
