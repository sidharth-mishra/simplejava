package com.org.practice;

public class StringCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abcdcdefghjiabcdghjiklabc";
String s2="abcd";
int i=0;
int last=0;
int count =0;

do{
	i=s1.indexOf(s2, last);
	if(i!=-1){
		count++;
	}
	last=i+s2.length();
	
}
while(i!=-1);

System.out.println(count);
	}

}
