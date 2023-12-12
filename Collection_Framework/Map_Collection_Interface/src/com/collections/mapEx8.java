package com.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class mapEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap mEx10 = new TreeMap();
		mEx10.put(11, "aaa");
		mEx10.put(22, "bbb");
		mEx10.put(33, "ccc"); 
		mEx10.put(44, "ddd");
		mEx10.put(55, "eee");
		
		System.out.println(mEx10);
		System.out.println("Tail Map---> "+mEx10.tailMap(33));
		System.out.println("Head Map---> "+mEx10.headMap(33));  
		
		SortedMap sm = mEx10.tailMap(33);
		
		TreeMap tm = new TreeMap(sm);
		
		System.out.println(tm); 

	}

}
