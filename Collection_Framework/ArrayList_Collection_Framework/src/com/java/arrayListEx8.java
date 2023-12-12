package com.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class arrayListEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("vvv");
		al2.add("aaa");
		al2.add("hhh");
		al2.add("bbb");
		al2.add("ddd");
		
		ListIterator<String> itr2 = al2.listIterator();
		
		while(itr2.hasNext()) {
//			System.out.println(itr2.next()); 
			
			String str1 = itr2.next();
			System.out.println(str1); 
		}
		
		while(itr2.hasPrevious()) {
			//System.out.println(itr2.previous());
			String str2 = itr2.previous();
			System.out.println(str2);
		}

	}

}
