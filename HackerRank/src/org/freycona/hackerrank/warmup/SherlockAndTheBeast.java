package org.freycona.hackerrank.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SherlockAndTheBeast {
//	public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inputSATB"));
//		Scanner sc = new Scanner(System.in);
		int nbCases = sc.nextInt();
		while (nbCases>0) {
			int n = sc.nextInt();
			System.out.println(computeKey(n));
			nbCases--;
		}
		sc.close();
		
	}

	private static String computeKey(int n) {
		int i=0;
		int iMin = -1;
		while (i<=n) {
			if ((n-i)%3 == 0 && i%5 == 0 ) {
				iMin=i;
				break;
			}
			i++;
		}
		
		if (iMin==-1) return "-1";
		
		StringBuilder sb = new StringBuilder();
		for (int k=1; k<=n-iMin; k++) {
			sb.append("5");
		}
		for (int k=1; k<=iMin; k++) {
			sb.append("3");
		}
		
		return sb.toString();
	}

}
