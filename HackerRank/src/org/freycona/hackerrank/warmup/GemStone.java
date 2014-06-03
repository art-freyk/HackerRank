package org.freycona.hackerrank.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GemStone {
//public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inputGS"));
//		Scanner sc = new Scanner(System.in);
		int rockNb = sc.nextInt();
		ArrayList<String> listGS = new ArrayList<String>();
		
		sc.nextLine();
		
		String stone1 = sc.nextLine();
		for (int i=0; i<stone1.length(); i++) {
			String gem = stone1.substring(i, i+1);
			if (listGS.contains(gem)==false) {
				listGS.add(gem);
			}
		}
		
		for (int i = 1; i < rockNb; i++) {
			String stoneI = sc.nextLine();
			@SuppressWarnings("unchecked")
			ArrayList<String> clonedList = (ArrayList<String>) listGS.clone();
			for (String gem : clonedList) {
				if (!stoneI.contains(gem)) {
					listGS.remove(gem);
				}
			}
		}
		
//		System.out.println(listGS);
		System.out.println(listGS.size());
		
		sc.close();
		
	}


	
}
