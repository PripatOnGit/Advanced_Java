package com.collections;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class mapEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof Serializable);
		
		LinkedList ll = new LinkedList();
		System.out.println(ll instanceof Cloneable);
		System.out.println(ll instanceof Serializable);
		
		HashSet hs = new HashSet();
		System.out.println(hs instanceof Cloneable);
		System.out.println(hs instanceof Serializable); 
				
		TreeSet tm = new TreeSet();
		System.out.println(tm instanceof Cloneable);
		System.out.println(tm instanceof Serializable);
		
		HashMap hm = new HashMap();
		System.out.println(hm instanceof Cloneable);
		System.out.println(hm instanceof Serializable);
		
		TreeMap tmm = new TreeMap();
		System.out.println(tmm instanceof Cloneable);
		System.out.println(tmm instanceof Serializable);


	}

}
