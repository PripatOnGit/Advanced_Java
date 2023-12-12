package com.collections; 

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm2 = new HashMap();
		hm2.put(333, "ddd");
		hm2.put(111, "ccc");
		hm2.put(444, "aaa");
		hm2.put(222, "bbb");
 
		
		System.out.println(hm2); 
		
		System.out.println(hm2.get(444));
		
//		Key return type is set

		Set s1 = hm2.keySet();
		System.out.println(s1);

//		Value return type is collection

		Collection c1 = hm2.values();
		System.out.println(c1); 
		
		Set set = hm2.entrySet(); 
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			
	    Map.Entry m = (Entry) itr.next(); 
	    System.out.println(m.getKey()+"----"+m.getValue()); 
//			System.out.println(itr.next()); 
		}

	}

}
