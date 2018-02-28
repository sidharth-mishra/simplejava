package com.fintilex.interview;

public class Fizz {
int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
final Fizz f1=new Fizz();
Fizz f2=new Fizz();
Fizz f3=fizzSwitch(f1,f2);
System.out.println((f1==f3)+" "+(f1.x==f3.x));
	}
	
	static Fizz fizzSwitch(Fizz x,Fizz y){
		final Fizz z=x;
		z.x=6;
		return z;
	}

}
