package com.java8;

public class PumpkinDemo {
	 public static void main(String[] args) {
	        Shape s = new Circle();
	        s.draw();
	    }
	}
	 
	class Shape{
	     void draw()
	    {
	        System.out.println("Shape");
	    }
	}
	 
	class Circle extends Shape{
	    protected void draw()
	    {
	        System.out.println("Circle");
	    }

}
