package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s3 = new HashSet<Integer>();
		s3.add(20);
		s3.add(10);
		s3.add(30);
		s3.add(50);
		s3.add(40);
		s3.add(10);
		s3.add(10);
		s3.add(10);
		
		Iterator itr = s3.iterator();
		
		while(itr.hasNext()) {
		
		
		System.out.print(itr.next()); 
		}
		System.out.println();
		for(Integer val : s3 ) {
			System.out.print(" "+val);
		}

	}

}
