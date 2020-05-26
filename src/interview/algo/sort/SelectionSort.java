package interview.algo.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public void sortArray(int[] arr) {
		int counter = 0;
		for(int i = 0; i< arr.length; i++) {
			for(int j = 1; j< arr.length; j++) {
				if(arr[0] < arr[j]) {
					int swap;
					swap = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = swap;
					counter++;
					System.out.println("high => "+ arr[j]+ " -- low => "+ arr[j-1]);
				}
			}
			System.out.println("Outer Loop");
		}
		System.out.println(Arrays.toString(arr)+" <_> "+ counter);
	}

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] arr = {4,3,1,2};
		ss.sortArray(arr);
	}

}
