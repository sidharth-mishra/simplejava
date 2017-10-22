package com.thread.conncurancy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExecutorService ex=Executors.newFixedThreadPool(10);
		for (int i = 0; i < 500; i++) {
            Runnable worker = new MyRunnable(10000000L + i);
            ex.execute(worker);
        }
        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
		ex.shutdown();
        // Wait until all threads are finish
        System.out.println("Finished all threads");

	}

}

class MyRunnable implements Runnable {
    private final long countUntil;

    MyRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < countUntil; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
