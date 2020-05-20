package interview.hr.start;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class UniqColor {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Set<Integer> s = new HashSet<>();
        int pairs = 0;
        for(int i : ar) {
        	if(!s.contains(i)) {
        		s.add(i);
        	}else{
        		s.remove(i);
        		pairs++;
        	}
        }
        return pairs;

    }

    public static void main(String[] args) throws IOException {

        int[] ar = {1,2,1,2,1,3,4,8};
        System.out.println(UniqColor.sockMerchant(6, ar));
        
    }
}
