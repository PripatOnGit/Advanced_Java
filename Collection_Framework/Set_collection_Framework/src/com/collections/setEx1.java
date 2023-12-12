package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Set s1 = new HashSet();
		s1.add(10);
		s1.add('a');
		s1.add("aaa");
		s1.add(10.01);
		s1.add(true);
		s1.add(10);
		s1.add('a');
		s1.add("aaa");
		s1.add(10.01);
		s1.add(true);
		s1.add(null);
		
		System.out.println(s1); 
		
		Set s2 = new LinkedHashSet<>();
		s2.add(20);
		s2.add('b');
		s2.add("bbb");
		s2.add(200.00);
		s2.add(false);
		s2.add(20);
		s2.add('b');
		s2.add("bbb");
		s2.add(200.00);
		s2.add(false);
		s2.add(null);

		System.out.println(s2); 

	}

}
