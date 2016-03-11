package com.test.factory;

import Sender;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.print("send method in the SmsSender class");
	}


}
