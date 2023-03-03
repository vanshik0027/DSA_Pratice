package DSA.Java.SortAlorithms;

public class InsertionSort extends ArrayBase{
	public static void main(String[] args) {
		
		printBeforeSort();
		System.out.println("\nInsertion Sort");
		
		for (int firstUnsortedIndex =1;firstUnsortedIndex<arr.length;firstUnsortedIndex++) {
			int newElements = arr[firstUnsortedIndex],i;
			
			for (i=firstUnsortedIndex; i > 0 && arr[i-1]>newElements;i--) {
				arr[i]=arr[i-1];
			}
			
			arr[i]= newElements;
					
		}
		
	printAfterSort();	
	}

}
