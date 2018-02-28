package com.org.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstDuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println(	"FirstDuplicateCharacter in a string is:"+findFirstDuplicateChar("spapau"));

	}

	
	public  Character findFirstDuplicateChar(String input){
		
		
	char[] convertedArray=	input.toCharArray();
	
	Map<Character,Integer> mp=new HashMap<Character,Integer>();
	for(int i=0;i<convertedArray.length;i++){
		if(mp.containsKey(convertedArray[i])){
			mp.put(convertedArray[i],mp.get(convertedArray[i])+1);
		}
		else{
			mp.put(convertedArray[i], 1);
		}
	}
	
	Character temp = null;
	Set<Character> st=mp.keySet();
		
	for(Character ch:st){
		//System.out.println(ch+" "+mp.get(ch));
		if(mp.get(ch)>1){
			temp=ch;
			break;

		}
	}
	
	return temp;
	}
}
