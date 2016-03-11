package com.test.factory;

public class TestMain {
	public static void main(String[] args) {
       Providers pro=new SmsFactory();
       Sender send=pro.produce();
       send.send();
	}
}
