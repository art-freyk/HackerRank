package org.freycona.hackerrank.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximizeXor {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
    	int max = 0 ;
    	for (int a=l; a <= r ; a++) {
    		for (int b=l; b <= r ; b++) {
    			max=Math.max(max, a^b);
    		}
    	}
    	
		return max;

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("inputMX"));
        int res;
        int _l;
        _l = in.nextInt();
        
        int _r;
        _r = in.nextInt();
        
        in.close();
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
