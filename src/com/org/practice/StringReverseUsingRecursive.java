package com.org.practice;

import java.util.Scanner;

public class StringReverseUsingRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
		String st=sc.nextLine();
		//System.out.println(st.substring(1)+ st.charAt(0));
		//parrot
	String getRevString=	reverseString(st);
	System.out.println(getRevString);
	}

	private static String reverseString(String str){
		
		if((str==null)||str.length()<=1){
			System.out.println(".......");
			return str;
		}
		 return reverseString(str.substring(1)+str.charAt(0)) ;
		
		
		
	}



}
