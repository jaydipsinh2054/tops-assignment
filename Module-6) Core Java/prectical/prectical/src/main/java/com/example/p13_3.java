package com.example;

//13.3) Use inter-thread communication methods like wait(), notify(), and notifyAll().

class Shared {
	boolean flag = false;

	synchronized void produce() {
		System.out.println("Producer started...");
		flag = true;
		System.out.println("Producer waiting...");
		try {
			wait();
		} catch (InterruptedException e) {
		}
		System.out.println("Producer resumed...");
	}

	synchronized void consume() {
		System.out.println("Consumer started...");
		if (!flag) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		notify();
		System.out.println("Consumer notified producer.");
	}
}

public class p13_3 {
	public static void main(String[] args) {
		Shared s = new Shared();
		Thread producer = new Thread(() -> s.produce());
		Thread consumer = new Thread(() -> s.consume());
		producer.start();
		consumer.start();
	}

}
