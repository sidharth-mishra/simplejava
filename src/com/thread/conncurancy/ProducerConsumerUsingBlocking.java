package com.thread.conncurancy;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerUsingBlocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class ProducerBlockingI implements Runnable{

	
	private ShareResourceForWait shareResourceForWait ;
	int size;
	
	
	public ProducerBlockingI(ShareResourceForWait sharedResource,int size) {
		super();
		this.shareResourceForWait = sharedResource;
		this.size=size;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		
	}
	
	
public void printEven(){
	for (int i=1;i<100;i++){
		if(i%2==0){
			System.out.println("PRINTEVEN: "+i);
		}
	}
}
	
	
}


class ShareResourceForWait{
	
	private int maxSize;

	public ShareResourceForWait(int maxSize) {
		super();
		this.maxSize = maxSize;
	}
	
	
	
}