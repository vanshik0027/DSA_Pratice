package DSA.Java.SortAlorithms;

public class CountingSort {
	public static void main(String[] args) {
		int[] arr= {2,5,9,8,3,2,7,10,8,9,2,3};
		System.out.println("Before Sort");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);

		}
		countingSort(arr, 0, arr.length);
		
		System.out.println("\nAfter Counting Sort");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(" " + arr[i]);

		}
		
	}
	
	public static void countingSort(int[] input,int min,int max) {
		int[] countArray= new int[(max-min)+1];
		
		for(int i=0;i<input.length;i++) {
			countArray[input[i]-min]++;
			
		}
		int j=0;
		for(int i =min ; i<=max;i++) {
			while(countArray[i-min]>0) {
				input[j++]=i;
				countArray[i-min]--;
				
			}
		}
	}

}
