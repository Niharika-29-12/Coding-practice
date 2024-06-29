package com.practice.basics;
/**
 * @author Nihariika Khurana
 */
public class ConditionalStatements {

	
	public static void main(String[] args) {
		int studentmarks=60;
		
		if (studentmarks>90) {
			System.out.println("excellent");
		}
		else if (studentmarks<=90 && studentmarks>80) {
			System.out.println("good");
		}
		else if (studentmarks<=80 && studentmarks>70) {
			System.out.println("fair");
		}
		else if (studentmarks<=70 && studentmarks>60) {
			System.out.println("meets expectation");
		}
		else {
			System.out.println("below par");
		}

	}

}
