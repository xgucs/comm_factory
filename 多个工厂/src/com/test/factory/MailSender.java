package com.test.factory;

import Sender;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("send method in the MailSender class");
	}
   
}
