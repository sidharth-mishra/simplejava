package com.collections.conncurancy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("Enter your name: ");
		//BufferedReader bufRead = request.getReader();
		  StringBuilder  stringBuilder = new StringBuilder();
		 // String ls = System.getProperty("line.separator");
		  String line;
		  while(( line = br.readLine()) != null ) {
		   stringBuilder.append( line );

		   //stringBuilder.append( ls );
		  }
		
		
		/* String str;

		    System.out.println("Enter lines of text.");
		    System.out.println("Enter 'stop' to quit.");
		    do {
		      str = br.readLine();
		      System.out.println(str);
		    } while (!str.equals("stop"));*/
		/*
		 * String s1 = sc.next(); String s2 = sc.nextLine();
		 * System.out.println(s1); System.out.println(s2);
		 */
	}

}
