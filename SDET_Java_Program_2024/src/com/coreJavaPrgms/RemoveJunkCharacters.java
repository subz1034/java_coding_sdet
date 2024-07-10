package com.coreJavaPrgms;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeJunkCharactersUsingRegex(" 大象 大象automation$%%^ 大象testing#$$by$%^^subin 大象 大象");
		removeJunkCharactersUsingRegex(" 猴子 熊猫welcome熊猫to$^^$automation");

	}

	public static void removeJunkCharactersUsingRegex(String str) {
		
		//using regex we can remove. 
		// here we are focusing on getting alphanumeric so we are writing not of this pattern [a-zA-Z0-9]>> [^a-zA-Z0-9]
		
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Removed String: "+str);
		
	}
}
