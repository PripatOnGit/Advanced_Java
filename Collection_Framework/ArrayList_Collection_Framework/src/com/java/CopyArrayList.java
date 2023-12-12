package com.java;

import java.util.ArrayList;
public class CopyArrayList {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList<>();
	    	a1.add("My");
	    	a1.add(1);
	    	a1.add("name");
		    a1.add(2);
		    a1.add("is");
		    a1.add("Priyanka");
		    a1.add(3);
		    
		    
		    //copy ArrayList
		    
		    ArrayList al2 = a1;
		    System.out.println(al2);
		    
		    ArrayList al3 = new ArrayList<>(a1);
		    System.out.println(al3);
 }
}
