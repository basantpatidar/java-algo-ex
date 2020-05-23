package interview.algo.sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSortAlgo {
	
	public void quickSort(int[] A) {
		quickSort(A, 0, A.length-1);
	}
	
	private void quickSort(int[] A, int low, int high) {
		if (low < high+1) {
			int p = partition(A, low, high);
			quickSort(A, low, p-1);
			quickSort(A, p+1, high);
		}
	}

	private void swap(int[] A, int index1, int index2) {
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;		
	}
	
	// returns random pivot index between low and high inclusive.
	private int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}

	// moves all n < pivot to left of pivot and all n > pivot 
	// to right of pivot, then returns pivot index.
	private int partition(int[] A, int low, int high) {
		swap(A, low, getPivot(low, high));
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if (A[i] < A[low]) {
				swap(A, i, border++);
			}
		}
		swap(A, low, border-1);
		return border-1;
	}
	
	public static void main(String[] args) {
		QuickSortAlgo qs = new QuickSortAlgo();
		int[] A = {30, 25, 15, 7, 16, 9};
		System.out.println(Arrays.toString(A));
		qs.quickSort(A);
		System.out.println(Arrays.toString(A));
	}
}
