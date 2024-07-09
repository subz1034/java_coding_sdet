package com.coreJavaPrgms;

import java.util.HashMap;


public class OccurenceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Mississippi";
		
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		
		for(Character c: str.toCharArray()) {
			
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
			}
		
		System.out.println("Occurence of Character"+hm);
		
		
	}

}
