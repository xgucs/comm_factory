package com.test.factory;

public class TestMain {
	public static void main(String[] args) {
		FactorySend fs = new FactorySend();
		Sender send1 = fs.product("mail");
		send1.send();
		Sender send2 = fs.product("sms");
		send2.send();
	}
}
