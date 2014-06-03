package org.freycona.hackerrank.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeadsOrnament {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inputBO"));
//		Scanner sc = new Scanner(System.in);
		
		int nbCases = sc.nextInt();
		while (nbCases>0) {
			int nbColors = sc.nextInt();
			int[] colors = new int[nbColors];
			for (int i=0; i < nbColors ; i++) {
				colors[i]=sc.nextInt();
			}
			System.out.println(computeDistinctOrnaments(colors));
			nbCases--;
		}
		
		sc.close();
		
	}

	private static int computeDistinctOrnaments(int[] colors) {
		double distinctOrnaments = 1;
		double[] coloredTreeNb = new double[colors.length];
		
		for (int i=0 ; i<colors.length; i++) {
			coloredTreeNb[i]=Math.pow(colors[i], colors[i]-1);
			distinctOrnaments=distinctOrnaments*coloredTreeNb[i];
		}
		
		int sumColors=0;
		for (int i=0; i<colors.length; i++) {
			sumColors=sumColors+colors[i];
		}
		
		distinctOrnaments=distinctOrnaments*Math.pow(sumColors, colors.length-2);
		
		return (int) (distinctOrnaments%1000000007);
		
		
	}
}
