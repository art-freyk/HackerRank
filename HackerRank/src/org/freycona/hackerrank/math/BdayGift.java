package org.freycona.hackerrank.math;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BdayGift {
//	public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inputBG"));
//		Scanner sc = new Scanner(System.in);
		
		int nbStep = sc.nextInt();
		
		double sum=0;
		
		while ( nbStep > 0 ) {
			sum = sum + sc.nextInt();
			nbStep--;
		}
		
		sc.close();
		
		System.out.printf("%.1f",sum/2);
	}

}
