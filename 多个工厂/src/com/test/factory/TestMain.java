package com.test.factory;

public class TestMain {
	public static void main(String[] args) {
      ProductFactory factor=new ProductFactory();
      Sender send=factor.maiSender();
      send.send();
	}
}
