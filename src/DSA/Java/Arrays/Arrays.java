package DSA.Java.Arrays;

public class Arrays {

	public static void main(String[] args) {
		//1.Desclaration of Array by Object
		int[] intArr = new int[6];
	//	datatyoe of Array, ArrayName = NEW- to initizaton Memory, declare size;
		
		intArr[0] = 32;
	//ArrayName[index] = value;	
		intArr[1] = 34;
		intArr[2] = -23;
		intArr[3] = 4;
		intArr[4] = -56;
		intArr[5] = 12;
		
		for(int i=0;i<intArr.length;i++)
		{
			System.out.println("index = "+ i +" Value = "+intArr[i]);
		}
		
		

		
	}

}
