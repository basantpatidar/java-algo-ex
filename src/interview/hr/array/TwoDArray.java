package interview.hr.array;

public class TwoDArray {

    // Complete the hourglassSum function below.
    static void hourglassSum(int[][] arr) {
    	int[] total = new int[(arr[0].length-2)*(arr.length-2)];
    	int counter = 0;
    	for(int i = 0; i < arr[0].length-2; i++) {
    		for(int j = 0; j < arr[i].length-2; j++) {
    			total[counter++] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    		}
    	}
    	int result = total[0];
    	for(int z = 1; z < total.length; z++) {
    		if(total[z] > result) result = total[z];
    	}
    	
    	System.out.println(result);
    }
    
    public static void main(String[] args){

        int[][] arr = {{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},{-9,-9,-9,1,2,3},{0,0,8,6,6,0},{0,0,0,-2,0,0},{0,0,1,2,4,0}};
        		hourglassSum(arr);

    }
}
