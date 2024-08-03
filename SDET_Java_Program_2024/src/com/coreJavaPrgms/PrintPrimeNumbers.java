package com.coreJavaPrgms;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=100;
		printPrimeNumbers(n);

	}

	private static void printPrimeNumbers(int n) {
		// TODO Auto-generated method stub
		
		System.out.println("Prime number starts by : " +2 );
		for(int i=3;i<n;i++){
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				
				if(i%j==0) {
					flag++;
				}
			}
			
			if (flag==0) {
				System.out.println(i);
			}
			
		}
	}

}
