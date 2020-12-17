package interview.hr.array;

import java.lang.reflect.Array;

public class BasicArrayLoopIterate {
	
	public static void main(String args[]) {
		int[] arrayOne = {1, 2, 3, 4, 5};
		System.out.println("for loop");
		for(int i = 0; i < Array.getLength(arrayOne); i++){
			System.out.println(arrayOne[i]);
		}
		System.out.println("forEach");
		for(int number : arrayOne) {
			System.out.println(number);
		}
		System.out.println("Do while");
		int j = 0;
		do{
			System.out.println(arrayOne[j]);
			j++;
		}while(j < arrayOne.length);
//		System.out.println(arrayOne.toString());
	}

}
