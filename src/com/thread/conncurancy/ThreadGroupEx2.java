package com.thread.conncurancy;

public class ThreadGroupEx2 {
	
	public static void main(String[] args) {
		ThreadGroup g1=new ThreadGroup("FirstGroup");
		
		ThreadGroup g2=new ThreadGroup(g1,"SecondGroup");
		System.out.println(g2.getParent().getName());
	}

}
