package DSA.Java.SortAlorithms;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number For factorial");
		Scanner intNumber = new Scanner(System.in);
		int num = intNumber.nextInt();
		intNumber.close();
		
		System.out.println("factorial of "+num +" is "+factorial(num));
	}
		
	 public static int factorial(int num) {
		
		if(num==0) {
			return 1;
			}
		return num*factorial(num-1);
	}

	
}
