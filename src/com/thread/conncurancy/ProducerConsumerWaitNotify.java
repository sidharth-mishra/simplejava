package com.thread.conncurancy;

import java.util.List;

public class ProducerConsumerWaitNotify {

}


class ProducerI implements Runnable{
	
	private List<Integer> sharedQueue;
	
	private int maxsize=2;
	
	
	public ProducerI(List<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {

		
		
		
	}
	
	private void  produce(int i) throws InterruptedException{
		synchronized(sharedQueue){
		while(sharedQueue.size()==maxsize){
			
			System.out.println("Queue is full, producerThread is waiting for "
                    + "consumerThread to consume, sharedQueue's size= "+maxsize);
			try {
				sharedQueue.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
		
		synchronized(sharedQueue){
			System.out.println("Produced : " + i);
	           sharedQueue.add(i);
	           Thread.sleep(1000);  
	           sharedQueue.notify();
		}
	
	}
}
//consumer


class ConsumerI implements Runnable {
    private List<Integer> sharedQueue;
    public ConsumerI(List<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
   
    @Override
    public void run() {
        while (true) {
         try {
             consume();
             Thread.sleep(100);
         } catch (InterruptedException e) {  e.printStackTrace();   }
        }
    }
 
    private void consume() throws InterruptedException {
      
       synchronized (sharedQueue) {
           //if sharedQuey is empty wait until producer produces.
           while (sharedQueue.size() == 0) {
                  System.out.println("Queue is empty, consumerThread is waiting for "
                               + "producerThread to produce, sharedQueue's size= 0");
             sharedQueue.wait();
         }
       }
       
 
       /* 2 Synchronized blocks have been used means before
        * consumer start consuming by entering below synchronized
        * block producer can produce.  
        */
      
        /*If sharedQueue not empty consumer will consume
      * (by removing from sharedQueue) and notify the producerThread.
      */
        synchronized (sharedQueue) {
           Thread.sleep((long)(Math.random() * 2000));
         System.out.println("CONSUMED : "+ sharedQueue.remove(0));
         sharedQueue.notify();
        }
    }
   
}