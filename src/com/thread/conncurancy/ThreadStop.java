package com.thread.conncurancy;

public class ThreadStop extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadStop th1=new ThreadStop();
		th1.start();
		th1.interrupt();

	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("uuuuuu");
		while(!Thread.currentThread().isInterrupted()){
		    try{        
		        Thread.sleep(10);
		    	System.out.println(Thread.currentThread().getName());

		    }
		    catch(InterruptedException e){
		        Thread.currentThread().interrupt();
		        break; //optional, since the while loop conditional should detect the interrupted state
		    }
		    catch(Exception e){
		        e.printStackTrace();
		    }
	}
		
		

	}
}
