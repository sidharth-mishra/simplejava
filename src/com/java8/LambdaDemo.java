package com.java8;



interface A{
	void show(int i);
}

/*class B implements A{

	@Override
	public void show() {
System.out.println("Hello");		
	}
	
}*/

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;
		
		obj= i -> System.out.println("Hello"+i);
				
				/*new A(){
			public void show(){
				
			}
		};*/
		//obj=new B();
		obj.show(5);
	}

}
