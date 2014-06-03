package org.freycona.hackerrank.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input"));
		int nbCases = sc.nextInt();
		while (nbCases>0) {
			int nbCycles = sc.nextInt();
			System.out.println(computeHeight(nbCycles));
			nbCases--;
		}
		sc.close();
		
	}

	private static int computeHeight(int nbCycles) {
		int heigth = 1;
		boolean cycle1=true;
		while (nbCycles > 0) {	
			if (cycle1) {
				cycle1=false;
				heigth=heigth*2;
			}
			else {
				cycle1=true;
				heigth=heigth+1;
			}
			nbCycles--;
		}
		return heigth;
	}

}
