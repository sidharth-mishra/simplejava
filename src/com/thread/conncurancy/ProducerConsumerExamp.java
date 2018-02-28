package com.thread.conncurancy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
	        Producer producer = new Producer(queue);
	        Consumer consumer = new Consumer(queue);
	        //starting producer to produce messages in queue
	        new Thread(producer).start();
	        //starting consumer to consume messages from queue
	        new Thread(consumer).start();
	        System.out.println("Producer and Consumer has been started");

	}

	
	
}



class Producer implements Runnable{
	
private BlockingQueue<Message> queue;
		
	public Producer(BlockingQueue<Message> queue) {
	super();
	this.queue = queue;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			Message msg=new Message(""+i);
			try {
				queue.put(msg);
				System.out.println("Produced "+msg.getMsg());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 Message msg = new Message("exit");
	        try {
	            queue.put(msg);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
	
}



class Consumer implements Runnable{
	
	private BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> queue) {
	super();
	this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		try{
            Message msg;
            //consuming messages until exit message is received
            while((msg = queue.take()).getMsg() !="exit"){
            Thread.sleep(10);
            System.out.println("Consumed "+msg.getMsg());
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
		
	}

	
	
}





class Message{
	private String msg;

	public Message(String str) {
		super();
		this.msg = str;
	}
	public String getMsg() {
        return msg;
    }
	
}