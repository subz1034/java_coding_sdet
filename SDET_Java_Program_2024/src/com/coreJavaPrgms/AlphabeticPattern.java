package com.coreJavaPrgms;

public class AlphabeticPattern {

	public static void main(String[] args) {
		/*
		 * to print alphabetic pattern 
		 * A
		 * A B
		 * A B C 
		 * A B C D
		 */
		
		int alpha=65;
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print((char)(alpha+j) + " ");
				
			}
			System.out.println();
		}

	}

}
