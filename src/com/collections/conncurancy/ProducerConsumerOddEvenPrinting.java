package com.collections.conncurancy;

import java.util.ArrayList;

public class ProducerConsumerOddEvenPrinting {
	static Object obj = new Object();
	static int counter = 1;

	public static void main(String[] args) {
		 Thread tEven = new Thread(new EvenProducer(), "Even thread");
		  Thread tOdd = new Thread(new OddProducer(), "Odd thread");
		  tEven.start();
		  tOdd.start();

	}

	static class EvenProducer implements Runnable {

		@Override
		public void run() {
			synchronized (obj) {
               while(true){
            	   if(counter%2==0 & counter<=20){
            		   
            		   System.out.println(Thread.currentThread().getName()+" : "+counter);
            		   try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            		   counter++;
                       obj.notify();
            	   }
            	   else{
            		   try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            	   }
            	   

               }
			}

		}

	}
	
	static class OddProducer implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (obj) {
	               while(true){
	            	   if(counter%2!=0 && counter<=20){
	            		   System.out.println(Thread.currentThread().getName()+" : " +counter);
	            		   try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	            		   counter++;
	                       obj.notify();
	            	   }
	            	   else{
	            		   try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	            	   }
	            	   

	               }
				}

			
		}
		
	}
}
