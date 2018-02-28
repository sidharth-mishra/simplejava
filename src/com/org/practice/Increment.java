package com.org.practice;

public class Increment {
	
	
public static void main(String[] args) {
	int x=10;
	int y;
	y=x++ + ++x + x++ + ++x;
	System.out.println(y)
			;
	System.out.println(x);
}
}
 