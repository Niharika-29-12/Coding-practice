package com.practice.basics;

import java.util.Scanner;

/**
 * @author Nihariika Khurana
 */
public class PrintPrimes {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();
		//one loop for running low to high,to print all numbers
		for(int i=low;i<=high;i++) {
			int count=0;
			//second loop for dividing by n,to find divisors
			for(int div=2;div*div<=i;div++) {
				if(i%div==0) {
					count++;
					break;
				}
			}
			if(count==0) {
			System.out.println(i);
			}
		}

	}

}
