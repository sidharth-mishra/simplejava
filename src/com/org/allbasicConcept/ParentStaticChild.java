package com.org.allbasicConcept;

class Parent {

	 int x = 10;
	
	public void printType() {
		System.out.println("HelloParent");
	}

	public void printX() {
		System.out.println("Parent x+ :" + x);
	}

	public static void showMagic() {
		System.out.println("getMagicInsideParent");
	}

	Parent() {
		printType();
		printX();
		showMagic();
	}

}

class Child extends Parent {
	int x = 20;
	

	public void printType() {
		System.out.println("HelloChild");
	}

	public void printX() {
		System.out.println("child x+ :" + x);
	}

	public static void showMagic() {
		System.out.println("getMagicInsideChild");
	}

	Child() {
		printType();
		printX();
		showMagic();
	}

}

public class ParentStaticChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.printType();
		int i=10;
		i = i++ + ++i + i++ + i;
		System.out.println(i);
		/*
		 * p.printType(); p.printX(); p.showMagic();
		 */
	}

}
