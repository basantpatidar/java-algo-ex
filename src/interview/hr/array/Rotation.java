package interview.hr.array;

public class Rotation {


    // Complete the rotLeft function below.
    static void rotLeft(int[] a, int d) {
    	int[] newArr = new int[a.length];
    	int counter = 0;
    	for(int i = d; i < a.length; i++) {
    		newArr[counter++] = a[i];
    	}
    	for(int j = 0; j < d; j++) {
    		newArr[counter++] = a[j];
    	}
    	}

    public static void main(String[] args)  {
        
    	int[] a = {1,2,3,4,5};
    	int d = 4;
//        int[] result = 
        		rotLeft(a, d);

    }
}