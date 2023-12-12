package com.collections;

import java.util.HashMap;

public class mapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm1 = new HashMap();
		hm1.put(1, "ccc");
		hm1.put(11, "abc");
		hm1.put(12, "aaa"); 
		hm1.put(13, "aaa");
		hm1.put(1, "ddd");
		hm1.put(1, "eee"); 
		hm1.put("aaa", "ccc"); 
		
		System.out.println(hm1); 

	}

}
