package com.collections;

import java.util.TreeSet;

public class setEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t1 = new TreeSet<>();
		t1.add(4);
		t1.add(10);
		t1.add(6);
		t1.add(20);
		t1.add(5);
		t1.add(30);
		System.out.println(t1); 

		
		TreeSet t2 = new TreeSet<>();
		t2.add(40);
		t2.add(1);
		t2.add(60);
		t2.add(2);
		t2.add(50);
		t2.add(3);
		System.out.println(t2); 
		
		t1.addAll(t2);
		
		System.out.println(t1); 


	}

}
