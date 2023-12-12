package com.collections;

import java.util.HashSet;
import java.util.Set;

public class setEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s3 = new HashSet();
		s3.add(20);
		s3.add(10);
		s3.add(30);
		s3.add(50);
		s3.add(40);
		s3.add(10);
		s3.add(10);
		s3.add(10);
		s3.add("aaa");
		
		System.out.println(s3); 
		
		Set s4 = new HashSet(s3);
//		Set s4 = new HashSet();
		s4.add(200);
		s4.add(100);
		s4.add(300);
		s4.add(500);
		s4.add(400);
		s4.add(100);
		s4.add(100);
		s4.add(100);
		s4.add("bbb"); 
		
		
//		s3.addAll(s4); // s3 = s3+s4  //20,10,30,50,40,200,300,500,400,100
		
//		System.out.println(s3); 
		
		System.out.println(s4); 

	}

}
