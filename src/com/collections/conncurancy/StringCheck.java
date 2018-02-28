package com.collections.conncurancy;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =  "Papu";
		System.out.println(s1.hashCode());

		s1=s1+"santu";
		System.out.println(s1.hashCode());
		//String  s2=s1 + "santu";
		System.out.println(  s1 == s1);

	}

}
