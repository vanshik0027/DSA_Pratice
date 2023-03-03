package DSA.Java.SortAlorithms;

public class ShellSort extends ArrayBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBeforeSort();
		System.out.println("\nShell Sort");
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for (int i=gap;i<arr.length;i++) {
				int newElement = arr[i];
				int j=i;
				while(j>=gap && arr[j-gap]>newElement) {
				arr[j]=arr[j-gap];
				j-=gap;
				}
				arr[j]= newElement;
			}
		}
		printAfterSort();

	}

}
