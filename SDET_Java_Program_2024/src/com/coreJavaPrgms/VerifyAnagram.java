package com.coreJavaPrgms;

import java.util.Arrays;

public class VerifyAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="elbow";
		String str2="below";
		String str3="bowled";
		boolean flag=false;
		
		char[] charStr1=str1.toCharArray();
		char[] charStr2=str2.toCharArray();
		char[] charStr3=str3.toCharArray();
		
		if(str1.length()==str2.length()) {
			Arrays.sort(charStr1);
			Arrays.sort(charStr2);
			
			
			for(int i=0;i<charStr1.length;i++) {
				if(charStr1[i]!=charStr2[i]) {
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("Both strings"+str1+" "+str2+" are anagram");
		}
		
		flag=true;
		if(str2.length()==str3.length()) {
			Arrays.sort(charStr3);
			Arrays.sort(charStr2);
			
			
			for(int i=0;i<charStr3.length;i++) {
				if(charStr3[i]==charStr2[i]) {
					flag=false;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("Both strings"+str3+" "+str2+" are anagram");
		}
		else {
			System.out.println("Both strings"+str3+" "+str2+" are not anagram");
			
		}

	}

}
