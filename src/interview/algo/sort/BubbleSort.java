package interview.algo.sort;

public class BubbleSort {

	    // Complete the countSwaps function below.
	    static void countSwaps(int[] a) {

	    	for (int i = 0; i < n; i++) {
	    	    
	    	    for (int j = 0; j < n - 1; j++) {
	    	        // Swap adjacent elements if they are in decreasing order
	    	        if (a[j] > a[j + 1]) {
	    	            swap(a[j], a[j + 1], a);
	    	        }
	    	    }
	    	}
	    }
	    public static int[] swap(int a, int a2, int[] b) {
	    	
	    	return b;
	    }

	    public static void main(String[] args) {
	    	
	    	int[] a = {1,4,2,5,3,6};
	    	
	    	BubbleSort.countSwaps(a);
	    }
	}
