package com.coreJavaPrgms;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="malayalam";
		boolean	flag=false;
		
		
		for(int i=0;i<=str.length()/2;i++) {
		
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				flag=true;
			}
		}
		
		if(flag==false) {
			System.out.println(str+" is a palindrome");
		}
	}

}
