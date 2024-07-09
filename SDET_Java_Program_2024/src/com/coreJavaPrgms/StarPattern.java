package com.coreJavaPrgms;

public class StarPattern {

	public static void main(String[] args) {

		
		/*		1			2		3				
		 *		*		  *** 		*
		 * 		**		   **      **
		 *		***         *     ***
		 */

		int size=5; // number of rows
		//to print pattern 1 
		
		for(int i=1;i<=size;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//to print pattern 2
		
		for(int i=1;i<=size;i++) {
					
			for(int j=size;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//to print pattern 3
		
		for(int i=1;i<=size;i++) {
			
			for(int j=0;j<size-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
	}

}
