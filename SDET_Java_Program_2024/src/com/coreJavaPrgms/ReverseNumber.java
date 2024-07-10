package com.coreJavaPrgms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reversing an integer using maths concept
		ReverseNumber(1244);
		ReverseNumber(120012);

	}
	
	public static void ReverseNumber(int num) {
		
		System.out.println("Number received: "+num);
		int temp=0;
		
		while(num>0) {
			
			temp=temp*10+num%10;
			num=num/10;
		}
		System.out.println("Reversed number: "+temp);
	}
	

}
