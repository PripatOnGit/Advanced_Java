package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapEx {
	public static void main(String[] args) {
		//put values in map
		//Map-1
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Priyanka");
		System.out.println(m);
		
		//Map-2
		Map<Integer, String> m2 = new HashMap<>();
		m2.putAll(m);
		m2.put(4, "Arjun");
		//m2.put(null, null);
		m2.putIfAbsent(3, "Abhijeet");
		
		System.out.println(m2);
		
		//Get values form map
		System.out.println(""+m2.get(4));
		
		//Replace value
		m2.replace(4, "SEAL");
		System.out.println(m2);
		
		//Remove value
		m2.remove(4);
		System.out.println(m2);
		
		//keyset- values - entryset
		System.out.println(m2.keySet());
		System.out.println(m2.values());
		System.out.println(m2.entrySet());
		
		
		
		//iterate map
		Set set = m2.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry m1 = (Entry) it.next(); 
			System.out.println(m1.getKey()+" --- "+m1.getValue());
			}
		System.out.println("---------");
		
		
		//iterate using for-each
		for(Map.Entry<Integer,String> num : m2.entrySet()) {
			System.out.println(num.getKey()+ " --- "+num.getValue());
			}
		System.out.println("---------");
		//iterate map
		ArrayList<Integer> keys = new ArrayList<Integer>(m2.keySet());  
		ArrayList<String> values = new ArrayList<String>(m2.values());
		for(int i=0;i<m2.size();i++) {
			System.out.println(keys.get(i)+"----"+values.get(i));
		}
		System.out.println(keys+" ");
		System.out.println(values+" ");
		
		}
}
