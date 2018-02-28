package com.org.practice;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1, "Hey This is Sidharth");
hm.put(4, "Hey This is Santosh");
hm.put(3, "Hey This is Sithesh");

for (Integer it : hm.keySet()) {
	System.out.println(it+":"+hm.get(it));
	
}


		
		
	}

}
