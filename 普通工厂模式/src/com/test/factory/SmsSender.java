package com.test.factory;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.print("send method in the SmsSender class");
	}


}
