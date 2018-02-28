
//Write a java program to find the duplicate words and their number of occurrences in a string

package com.org.practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FIndDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
findTheCountDuplicateString(st);

	}

	private static void findTheCountDuplicateString(String input) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
	     String[] splitedString = input.split(" ");
	     for (String key : splitedString) {
	    	 if(hm.containsKey(key)){
	    		 hm.put(key, hm.get(key)+1);
	    	 }
	    	 else{
		    	 hm.put(key, 1);
 
	    	 }
			
		}
	     //System.out.println(hm);
	   for(String st:hm.keySet()){
		   System.out.println(st+" "+hm.get(st));
	   }
	
	}

}
