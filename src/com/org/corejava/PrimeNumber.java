package com.org.corejava;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkprime(13));
	}

	
	
	public static boolean checkprime(int number){
		boolean flag=true;
		
		for(int i=2;i<=number/2;i++){
			
			if(number%i==0){
				flag=false;
				break;
			}
			
		}	
		return flag;
		
	}
}
