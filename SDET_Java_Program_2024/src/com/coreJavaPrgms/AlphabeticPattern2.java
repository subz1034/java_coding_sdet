package com.coreJavaPrgms;

public class AlphabeticPattern2 {

	public static void main(String[] args) {
		// to print pattern like 
		/*	A
		 *  B B
		 *  C C C
		 *  D D D D
		 * 
		 */

		int alpha=65;
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha) +" ");
			}
			System.out.println();
			alpha++;
		}
		
	}

}
