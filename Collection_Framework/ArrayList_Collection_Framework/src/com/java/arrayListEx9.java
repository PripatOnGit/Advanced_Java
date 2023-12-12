package com.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class arrayListEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al3 = new ArrayList<>();
		
		al3.add("ttt");
		al3.add("aaa");
		al3.add("ggg");
		al3.add("bbb");
		al3.add("fff");
		
		ListIterator itr5 = al3.listIterator();
		
		while(itr5.hasNext()) {
			
			String s1 =  (String) itr5.next();
			System.out.println(s1); 
		}
		
		while(itr5.hasPrevious()) {
		String s2 = (String) itr5.previous();  
		System.out.println(s2); 
		}
		
	}

}
