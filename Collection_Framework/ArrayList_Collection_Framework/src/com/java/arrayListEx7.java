package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListEx7 {
	
	public static void main(String[] args)
	{
	
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(12);
		al1.add(11);
		al1.add(15);
		al1.add(13);
		al1.add(14);
	
		ArrayList al2 = new ArrayList();
		al2.add(12);
		al2.add("My");
		al2.add(15);
		al2.add("Name");
		al2.add(14);	
		al2.add("is");
		al2.add("Priyanka");
	
		Iterator<Integer> itr1 = al1.iterator();
		Iterator it2 = al2.iterator();
	
		while(itr1.hasNext()) {
			System.out.println(itr1.next());  
		}
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
