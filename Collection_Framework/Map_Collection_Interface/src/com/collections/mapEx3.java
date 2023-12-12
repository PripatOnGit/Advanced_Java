package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class mapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        HashMap mEx33 = new HashMap();
		
		mEx33.put(333, "ccc");
		mEx33.put(111, "aaa");
		mEx33.put(444, "ddd");
		mEx33.put(222, "bbb");
		
		HashMap mEx34 = new HashMap();		
		
		mEx34.put(777, "yyy");
		mEx34.put(555, "zzz");
		mEx34.put(888, "xxx");
		mEx34.put(666, "www");
		
		mEx33.putAll(mEx34);
		
		System.out.println("Hash Map----->"+mEx33); 
		

		LinkedHashMap mEx31 = new LinkedHashMap();
		
		mEx31.put(333, "ccc");
		mEx31.put(111, "aaa");
		mEx31.put(444, "ddd");
		mEx31.put(222, "bbb");
		
		LinkedHashMap mEx32 = new LinkedHashMap();
		mEx32.put(777, "yyy");
		mEx32.put(555, "zzz");
		mEx32.put(888, "xxx");
		mEx32.put(666, "www");
		
		mEx32.putAll(mEx31);
		System.out.println("LinkedHashMap---->"+mEx32); 
	}

}
