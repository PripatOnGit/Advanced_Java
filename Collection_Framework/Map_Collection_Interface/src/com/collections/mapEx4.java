package com.collections;

import java.util.TreeMap;

public class mapEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap mEx5 = new TreeMap();
		mEx5.put(33, "occ");  
		mEx5.put(11, "occ");
		mEx5.put(44, "occ");
		mEx5.put(55, "tee");
		mEx5.put(22, "wbb");
		
		//null values and keys not allowed in TreeMap
		//mEx5.put(null, "ee"); 
		System.out.println(mEx5); 
		
		
		TreeMap mEx6 = new TreeMap();
		mEx6.put(33, "cc");  
		mEx6.put(11, "aa");
		mEx6.put(44, "dd");
		mEx6.put("aa", "ee");
		mEx6.put("bb", "bb"); 
		
		System.out.println(mEx6); 
	}

}
