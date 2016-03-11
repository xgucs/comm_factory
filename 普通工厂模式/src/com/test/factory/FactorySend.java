package com.test.factory;

public class FactorySend {
	public Sender product(String name) {
		if (name.equals("mail")) {
			return new MailSender();
		} else if ("sms".equals(name)) {
			return new SmsSender();
		} else {
			System.out.println("Please input the right type.");
			return null;
		}
	}

}
