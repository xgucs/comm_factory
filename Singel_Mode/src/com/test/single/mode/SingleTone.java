package com.test.single.mode;

/*懒汉式
 线程不安全，无法在多线程中使用*/
public class SingleTone {
	private static SingleTone sigTone = null;

	private SingleTone() {
	}

	public static SingleTone getInstance() {
		if (sigTone == null) {
			sigTone = new SingleTone();
		}
		return sigTone;
	}
}
