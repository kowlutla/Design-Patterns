package com.kowlutla.structural.adapter.payment;

public class PaymentProcesserImpl implements PaymentProcesser {

	@Override
	public void pay(double dollers) {
		System.out.println("Payment is done with " + dollers + " dollers");
	}

}
