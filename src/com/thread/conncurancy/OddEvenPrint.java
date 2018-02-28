package com.thread.conncurancy;

import java.util.StringTokenizer;

public class OddEvenPrint {

	public static void main(String[] args) {

		String s = "Sid@gmail#com*java";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
				System.out.print(c);
			else
				System.out.println();
		}
	}

}
