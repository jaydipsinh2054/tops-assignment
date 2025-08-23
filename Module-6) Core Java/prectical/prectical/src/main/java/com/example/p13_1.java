package com.example;

//13.1) Write a program to create and run multiple threads using the Thread class. 

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
}

public class p13_1 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
	}
}
