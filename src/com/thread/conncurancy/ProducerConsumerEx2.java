package com.thread.conncurancy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerEx2 {

	public static void main(String args[]) {
		// Shared object
		BlockingQueue sharedQueue = new LinkedBlockingQueue();

		// Producer and Consumer thread
		Thread producerThread = new Thread(new Producer1(sharedQueue));
		Thread consumerThread = new Thread(new Consumer1(sharedQueue));
		
		// Starting producer thread
		producerThread.start();

		// Starting consumer thread
		consumerThread.start();
	}
}

//Create a Producer Thread Class
class Producer1 implements Runnable {

	private final BlockingQueue sharedQueue;

	public Producer1(BlockingQueue dd) {
		this.sharedQueue = dd;
	}

	@Override
	public void run() {
		for (int i = 1; i < 15; i++) {
			try {
				System.out.println("Produced by Producer: " + i);
				sharedQueue.put(i);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}

//Crate a Consumer Thread Class
class Consumer1 implements Runnable {

	private final BlockingQueue sharedQueue;

	public Consumer1(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed by Consumer: " + sharedQueue.take());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}

	

