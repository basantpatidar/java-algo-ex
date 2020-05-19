package interview.hr.start;

import java.io.*;

public class Thunderheads {


    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

    	int steps = -1;
    	int l = c.length;
//    	for(int i = 0; i < c.length; i++) {
//    		if(c[i] == 0) {
//    		steps++;
//    		}
//    		if(i < c.length-2 && c[i+1] == 0) {
//    			System.out.println("i in Else => "+ i );
//    			i++;
//    		}
//    		System.out.println("i => "+ i +" & steps => "+ steps);
//    	}
//    	System.out.println(steps);
    	
        for (int i = 0; i < l; i++) {
            if (i<l-2 && c[i+2]==0) 
            	i++;
            	steps++;
        }
        System.out.println(steps);
    	
    	return steps;

    }


    public static void main(String[] args) throws IOException {
       int[] c = {0,0,1,0,0,1,0};

//        int result = 
        		jumpingOnClouds(c);
}
}