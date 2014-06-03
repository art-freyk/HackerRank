package org.freycona.hackerrank.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class IsFibo {
//	public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inputIF"));
//		Scanner sc = new Scanner(System.in);
		
		int nbCases = sc.nextInt();
		ArrayList<Double> fiboList = getFiboList();
		while (nbCases>0) {
			double nbToTest =sc.nextDouble();
			System.out.println(isFibo(nbToTest,fiboList));
			nbCases--;
		}
		
		sc.close();
		
	}
	
	public static ArrayList<Double> getFiboList() {
		int n = 60;
		ArrayList<Double> fibo = new ArrayList<>(n);
		fibo.add((double) 0);
		fibo.add((double) 1);
		
		int i=0;
		while (i<=n) {
			fibo.add(fibo.get(i)+fibo.get(i+1));
			i++;
		}
		return fibo;
		
	}

	private static String isFibo(double nbToTest, ArrayList<Double> fiboList) {
		
		if (fiboList.contains(nbToTest)) {
			return "IsFibo";
		}
		else {
			return "IsNotFibo";
		}
	}


}
