package com.java;

import java.util.ArrayList;

public class arrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al1 = new ArrayList<>();
		al1.add(10);
		al1.add('a');
		al1.add("aaa");
		al1.add(10.01);
		al1.add(true);
		al1.add(10);
		al1.add(10);
		al1.add(null);
		
		System.out.println(al1);
		
		ArrayList<Integer> al12 = new ArrayList<Integer>();
		al12.add(10);
		al12.add(20);
		al12.add(30);
		al12.add(40);
		al12.add(50);
//		al12.add('a');
//		al12.add("aaa");
		System.out.println(al12); 

	}

}
