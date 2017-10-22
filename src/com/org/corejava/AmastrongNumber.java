package com.org.corejava;

public class AmastrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(isAmstrong(153));
	}
	
	
	private static boolean isAmstrong(int number){
		boolean flag=false;
		int temp=0;
		int value;
		int amstrong=number;
		
		while(number>0){
			value=number%10;
			temp=temp+value*value*value;
			number=number/10;
		}
		
		if(temp==amstrong){
			flag=true;
		}
		
		return flag;
		
		
		
		
	}

}
