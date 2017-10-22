package com.org.corejava;

public class StringReverseWords {
//At Remote change data
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String examp=null;
		System.out.println(examp.length());
		checkWordReverse(examp);
		

		
	}
	
	
	private static void checkWordReverse(String input){
		
String[] splitedString=	input.split(" ");
int length=splitedString.length;	

if(input!=null && !input.isEmpty()){
	for(int i=length-1;i>=0;i--){
		System.out.print(splitedString[i]+" ");
	}
}
		
		
		
		
		
	}

}
