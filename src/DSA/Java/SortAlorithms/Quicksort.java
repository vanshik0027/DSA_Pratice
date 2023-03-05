package DSA.Java.SortAlorithms;

public class Quicksort extends ArrayBaseClass {

	public static void main(String[] args) {
		printBeforeSort();
		System.out.println("\nAfter Quick Sort");
		quickSort(arr, 0, arr.length);

		printAfterSort();

	}

	public static void quickSort(int[] input,int start,int end) {
		
		if(end -start <2) {
			return;
		}
		int pivotIndex = partition(input,start,end);
		quickSort(input,start,pivotIndex);
		quickSort(input, pivotIndex+1,end);
		
	}

	public static int partition(int[] input,int start,int end){
		int pivot=input[start];
		int i= start;
		int j= end;
		while(i<j) {
			while(i<j&&input[--j]>=pivot);
			if(i<j) {
			input[i] =input[j];
		}
		while(i<j && input[++i]<=pivot)
			if(i<j) {
				input[j]= input[i];
				
			}
		
	}
		input[j]=pivot; 
		return j;
			
}}
