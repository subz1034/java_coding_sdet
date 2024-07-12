package com.coreJavaPrgms;

public class PrintNumSeries {

	public static void main(String[] args) {
		// to print from 1 to 15 without using loops
		PrintNumSeries(1);
		
	}
	
	public static void PrintNumSeries(int n) {
		
		if(n<=15) {
			System.out.println(n);
			n++;
			PrintNumSeries(n);
		}
		
	}

}
