package com.test.factory;

public class ProductFactory {
    public Sender maiSender(){
    	return new MailSender();
    }
    public Sender smsSender(){
    	return new SmsSender();
    }
}
