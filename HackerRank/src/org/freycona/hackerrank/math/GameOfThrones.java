package org.freycona.hackerrank.math;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class GameOfThrones {
//	public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inputGOT"));
//		Scanner sc = new Scanner(System.in);
		
		String wordToTest = sc.nextLine();
		
		sc.close();
		
		HashMap<Character, Integer> OccurenceNb = new HashMap<Character, Integer>();
		for (int i = 0 ; i < wordToTest.length() ;i++) {
			char car = wordToTest.charAt(i);
			Integer value=OccurenceNb.get(car);
			if (value==null) {
				OccurenceNb.put(car, 1);
			}
			else {
				OccurenceNb.put(car, value+1);
			}
		}
		
		int countOddOccurences=0;
		for (int v : OccurenceNb.values()) {
			if (v%2==1) {
				countOddOccurences++;
				if (countOddOccurences>1) break;
			}
		}
		
		System.out.println(countOddOccurences>1?"NO":"YES");
	}

}
