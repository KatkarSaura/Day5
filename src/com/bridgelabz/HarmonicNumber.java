package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Generate harmonic series");
		System.out.println("-------------------");
		System.out.println("Enter no:");
		int no = in.nextInt();
		int temp = no;
		double sum = 0;
		while(temp > 0) {
			sum = sum+((double)1/(double)temp);
			temp--;
		}
		System.out.println("harmonic no output for no'"+no+"': "+sum);
				
    	}

	}

