package com.kowlutla.structural.adapter.payment;

public class PaymentAdapter {

	public void pay(double rupees) {
		PaymentProcesser processer = new PaymentProcesserImpl();
		// Convert rupees to dollar
		double dollers = 0.012 * rupees;

		processer.pay(dollers);

	}

}
