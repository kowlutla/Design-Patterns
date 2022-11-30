package com.kowlutla.structural.adapter.payment;

public class PaymentApp {

	public void pay(double rupees) {

		PaymentAdapter adapter = new PaymentAdapter();
		System.out.println("Paying amount in rupees: " + rupees);
		adapter.pay(rupees);
	}

	public static void main(String[] args) {
		PaymentApp app = new PaymentApp();
		app.pay(16734);
	}

}
