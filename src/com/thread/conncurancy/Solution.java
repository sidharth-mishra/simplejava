package com.thread.conncurancy;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String one="A586QK";
//String two="JJ653K";
		String one="124567";
		String two="342165";
		solution(one,two);
	}

public static String solution(String A,String B)	{
	
	
char[] a=	A.toCharArray();
char[] b=	B.toCharArray();


int countone=0;
int counttwo=0;
int i=0;
	if(a.length!=b.length){
		return null;
	}
	
		for(int j=0;j<b.length;j++){
			
			if(a[i]>b[j]){
				countone=	countone+1;
				
			}
			
			else if(a[i]==b[j]){
				System.out.println("dont do");
				
			}
			else{
				counttwo=counttwo+1;
			}
			i++;
		}
		
	
	if(countone>counttwo){
		System.out.println("one winner");
	}
	else{
		System.out.println("two  winner");
	}
	System.out.println(countone+" "+counttwo);
	return null;
	
	
}
	
	
	
}
