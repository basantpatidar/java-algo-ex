package interview.hr.start;

import java.io.*;

public class HillSteps {
	
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	int hill = 0;
    	int valley = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == 'U') {
    			++hill;
    			System.out.println("U => " + hill );
    		}else {
    			--hill;
    			System.out.println("D => " + hill);
    		}
    		if(hill == 0 && s.charAt(i) == 'U') {
    			valley++;
    		}
    		
    	}
    	System.out.println(valley);
    	return valley;
    }


    public static void main(String[] args) throws IOException {
      
        String s = "UDDDUDUUUUDUUDDDDDUDDUUU";

        		HillSteps.countingValleys(8, s);

        
    }
}
