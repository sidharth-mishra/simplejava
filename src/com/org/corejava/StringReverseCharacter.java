package com.org.corejava;

public class StringReverseCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String examp="sidharth is a good boy";
		
	char[] arrayString=	examp.toCharArray();
	int length=arrayString.length;
	
	for(int i=length-1;i>=0;i--){
		System.out.print(arrayString[i]);
	}
		
		
		
	}

}
