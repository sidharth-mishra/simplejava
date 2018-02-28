package com.collections.conncurancy;

class Test
{
   void display()         // protected specifier
  {
    System.out.println("Hello 1");
  }
}

class Child extends Test{
	void display(){
		
	}
}
public class Demo 
{
 /*public void display()                   // overridden with default specifier
  {
    System.out.println("Hello 2");
  }*/
  public static void main(String args[])
  {   
	  
	  Test t=new Child();
  }
}