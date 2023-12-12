package com.java;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<String> al = new ArrayList<String>();
		
		al.add("bbb");
		al.add("aaa");
		al.add("ddd");
		al.add("ccc");
		
		
		System.out.println("Before Sorting: "+al);
		
		Collections.sort(al);
		
		
		System.out.println("After Sorting: "+al); 
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(5);
		al1.add(7);
		al1.add(1);
		
		System.out.println("Before Sorting : " +al1);
		
		Collections.sort(al1);
		
		System.out.println("After Sorting : " +al1); 


	}

}
