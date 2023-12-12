package com.java;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList<>();
	    a1.add("My");
	    a1.add(1);
	    a1.add("name");
	    a1.add(2);
	    a1.add("is");
	    a1.add("Priyanka");
	    a1.add(3);
	    //Print ArrayList
	    System.out.println(a1);
	    System.out.println("--------------");
	    //iterate using for loop
	    for(int i=0;i<a1.size();i++) {
	    	System.out.println(""+a1.get(i));
	    }
	    System.out.println("--------------");
	    int num = 0;
	    //iterate using while loop
	    while(a1.size()> num) {
	    	System.out.println(""+a1.get(num));
	    	num++;
	    }
	    System.out.println("--------------");
	    
	    //for0each loop
	    for(Object o : a1) {
	    	System.out.print(o+" ");
	    }
	    System.out.println("--------------");
	    //using iterator
	    Iterator it1 = a1.iterator();
	    while(it1.hasNext()) {
	    System.out.println(" "+it1.next());
	    	}
	    }
}
