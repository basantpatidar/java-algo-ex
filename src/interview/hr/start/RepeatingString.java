package interview.hr.start;

import java.io.*;

public class RepeatingString {

    // Complete the repeatedString function below.
    static void repeatedString(String s, long n) {
    	long stringSize = s.length();
    	long reminder = (n % stringSize);
    	long multiplier = n/stringSize;
    	long countA = 0;
    	
    	for(long i = 0; i < stringSize; i++) {
    		if(s.charAt((int) i) == 'a') countA++;
    	}
    	countA *= multiplier;
    	for(long j = 0; j < reminder; j++) {
    		if(s.charAt((int) j) == 'a') countA++;
    	}
    	
    	
    	System.out.println("A => "+ countA);

    }

    public static void main(String[] args) throws IOException {

//        long result = 
    	long range = 1000000000000L;
        		repeatedString("a", range);

    }
}