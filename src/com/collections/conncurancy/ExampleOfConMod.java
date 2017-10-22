package com.collections.conncurancy;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfConMod   extends Thread {
	
	
	static ArrayList<String> al=new ArrayList<String>();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		al.add("Harry");
		al.add("shivom");
		al.add("rk");
		ExampleOfConMod ex=new ExampleOfConMod();
		ex.start();
		
	Iterator it=	al.iterator();
	
	while(it.hasNext()){
		System.out.println(it.next());
		Thread.sleep(3000);
	}

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+" inside child thread");
		al.add("sam");
		
		
	}

}


