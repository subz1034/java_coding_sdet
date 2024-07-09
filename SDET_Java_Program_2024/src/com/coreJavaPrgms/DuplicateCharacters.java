package com.coreJavaPrgms;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String str= "automationanywhere";
		checkDuplicateCharacters(str);
		
		}

	
	public static void checkDuplicateCharacters(String str) {
		
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		// length is null or 1, return n=0
		if(str.length()==1){
			System.out.println("Single string");	
			
		}
		else {
		for(int i=0;i<str.length();i++) {
			
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else {
				hm.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
		
		for(Entry<Character, Integer> c : hm.entrySet()) {
			if(c.getValue()>=2)
			System.out.println("Character with more than 2 occurences : "+c.getKey());	
		}
	}
  }
}


