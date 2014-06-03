package org.freycona.hackerrank.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inputSL"));
		int lengthFreeway = sc.nextInt();
		int nbCases = sc.nextInt();
		int[] width = new int[lengthFreeway];
		for (int i = 0; i < lengthFreeway; i++) {
			width[i]=sc.nextInt();
		}
		while (nbCases>0) {
			int inSL=sc.nextInt();
			int outSL=sc.nextInt();
			System.out.println(getWidestVehicles(inSL, outSL, width));
			nbCases--;
		}
		sc.close();
		
	}

	private static int getWidestVehicles(int inSL, int outSL, int[] width) {
		int widestVehicle = 3;
		for (int i=inSL ; i <= outSL ; i++) {
			if (widestVehicle == 1) return 1;
			widestVehicle = Math.min(width[i], widestVehicle);
		}
		return widestVehicle;
	}

	
}
