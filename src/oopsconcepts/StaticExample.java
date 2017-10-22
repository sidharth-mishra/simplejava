package oopsconcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

public class StaticExample {

/////final String  Pan_Card_Num="sf";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("hhhhh");
		B b=new B();*/
		
		HashMap set=new HashMap();
		/*Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		Integer i3=new Integer(10);
*/

		
		System.out.println(set.put(101,"papu"));
		System.out.println(set.put(101,"sipu"));
		//System.out.println(set.put(i3,20));

		System.out.println(set);
	}

}


class A{

A(){
	System.out.println("inside parent");
}
	
	
}

class B extends A{
	B(){
		System.out.println("inside child");
	}
}