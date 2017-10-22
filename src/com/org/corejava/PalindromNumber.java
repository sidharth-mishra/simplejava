package com.org.corejava;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrom(121));
	}

	
	

	private static boolean isPalindrom(int number){
		boolean flag=false;
		int temp=0;
		int value;
		int palnum=number;
		
		while(number>0){
			value=number%10;
			temp=(temp*10)+value;
			number=number/10;
		}
		
		if(temp==palnum){
			flag=true;
		}
		
		return flag;
		
		
		
		
	}
}
