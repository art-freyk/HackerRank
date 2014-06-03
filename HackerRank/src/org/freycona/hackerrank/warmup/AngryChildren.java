package org.freycona.hackerrank.warmup;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AngryChildren {
//	public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("inputAC"));
//		Scanner sc = new Scanner(System.in);
		
		int totalPacket = sc.nextInt();
		int givenPacket = sc.nextInt();
		int nbPacket = totalPacket;
		
		ArrayList<Integer> packetList = new ArrayList<Integer>();
		while (nbPacket>0) {
			int nbSweets = sc.nextInt();
			packetList.add(nbSweets);
			nbPacket--;
		}
		
		
		Collections.sort(packetList);
		
		int unfairness = Integer.MAX_VALUE;
		for (int i=0; i<=packetList.size()-givenPacket ;i++) {
			unfairness = Math.min(packetList.get(i+givenPacket-1)-packetList.get(i),unfairness);
		}
		
		System.out.println(unfairness);
		
		sc.close();
		
	}


}
