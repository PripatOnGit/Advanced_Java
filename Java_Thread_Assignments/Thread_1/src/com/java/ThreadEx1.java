//Write a program to create two threads. Print “In main thread” in main thread 
//and “In child thread” in child thread.

package com.java;

class ThreadOne extends Thread{
	int id;
	ThreadOne(int id){
		this.id = id;
	}
	
	public void run() {
		System.out.println("In Child thread"+ this.id);
	}
}

public class ThreadEx1 {
	
	public static void main(String[] args) {
		
		System.out.println("Mian thread started");
		ThreadOne t1 = new ThreadOne(1);
		t1.start();
		
		ThreadOne t2 = new ThreadOne(2);
		t2.start();
		
		System.out.println("Main thread exit");
		}
}

