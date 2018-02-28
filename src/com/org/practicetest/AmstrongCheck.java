package com.org.practicetest;

import java.util.Scanner;

public class AmstrongCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int value=getInputData();
	   boolean data=isAmstrong(value);
	   if(data==true){
		   System.out.println("is an Amstrong");
		   
	   }
	   else{
	   System.out.println("not an Amstrong");
	   }
	}

	private static boolean isAmstrong(int num) {
		int temp=num;
		int value=0;
		boolean isAmstrong=false;
		if (num == 0) {
			System.out.print("Please ");
			int updateValue= getInputData();
			isAmstrong(updateValue);
		}
		else{
			while(num>0){
				int rem=num%10;
                value =value+rem*rem*rem;
                num=num/10;

			}
			
		
		}
		
		if(temp==value){
			isAmstrong=true;
			return isAmstrong ;
		}
		
		

		return isAmstrong;

	}

	private static int getInputData() {
		System.out.print("Enter The Number: ");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
