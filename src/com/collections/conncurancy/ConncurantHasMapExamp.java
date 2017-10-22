package com.collections.conncurancy;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConncurantHasMapExamp extends Thread{
static ConcurrentHashMap<Integer,String> m=new ConcurrentHashMap<Integer,String>();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//testing
		m.put(101, "Hari");
		m.put(102, "Sam");
		ConncurantHasMapExamp che=new ConncurantHasMapExamp();
		
		che.start();
		
		
		Set<Integer> sm=m.keySet();
		Iterator<Integer> it=sm.iterator();
		
		while(it.hasNext())
		{
		Integer i=	it.next();
			System.out.println("Inside main: "+i+" value "+m.get(i));
			Thread.sleep(1000);
		}
System.out.println(m);
	}
	
	@Override
		public void run() {
			// TODO Auto-generated method stub
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Writing inside child:" );
		
		m.put(103, "sidharth");
		
		}
	

}
