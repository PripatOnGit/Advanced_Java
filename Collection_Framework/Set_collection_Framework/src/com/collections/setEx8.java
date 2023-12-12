package com.collections;

import java.util.TreeSet;

public class setEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t1 = new TreeSet<>();
		t1.add(4);
		t1.add(1);
		t1.add(6);
		t1.add(2);
		t1.add(5);
		t1.add(3);
		System.out.println(t1); 

		System.out.println(t1.headSet(4)); 
		System.out.println(t1.tailSet(4));  
	}

}
