package com.thread.conncurancy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExamp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		
		ExecutorService exec=Executors.newFixedThreadPool(5);
		
		 List<Future<ArrayList<String>>> list = new ArrayList<Future<ArrayList<String>>>();
	        for (int i = 0; i < 20000; i++) {
	            Callable<ArrayList<String>> worker = new MyCallable();
	            Future<ArrayList<String>> submit = exec.submit(worker);
	            list.add(submit);
	        }		
		
		ArrayList<String> as=new ArrayList<String>();
		for (Future<ArrayList<String>> future : list) {
			as=future.get();
		}
		for (String string : as) {
			System.out.println(string);
		}
		
	}

}



class MyCallable implements Callable<ArrayList<String>>{

	@Override
	public ArrayList<String> call() throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<String>  al=new ArrayList<String>();
		for(int i=0;i<5;i++){
			
			al.add(i+"");
		}
		return al;
	}
	
}