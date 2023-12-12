package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setEx {
	public static void main(String[] args) {
		Set s= new HashSet();
		s.add(1);
		s.add(3);
		s.add(3);
		s.add("My");
		s.add(2);
		s.add("Priyanka");
		System.out.println(s);
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(""+it.next());
		}
		
		
	}
}
