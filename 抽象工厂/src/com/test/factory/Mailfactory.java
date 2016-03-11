package com.test.factory;

public class Mailfactory implements Providers {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
