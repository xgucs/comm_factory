package com.test.factory;

public class SmsFactory implements Providers {

	@Override
	public Sender produce() {

		return new SmsSender();
	}

}
