package com.example;

// 10.3) Implement an interface for a real-world example, such as a payment gateway.
public class p10_3 {

	interface PaymentGateway {
		void processPayment(double amount);
	}

	class PayPal implements PaymentGateway {
		public void processPayment(double amount) {
			System.out.println("Processing $" + amount + " via PayPal.");
		}
	}

	public static void main(String[] args) {
		p10_3 outer = new p10_3();
		PaymentGateway payment = outer.new PayPal();
		payment.processPayment(150.75);
	}
}
