package com.test.single.mode;

/*第一种
 * 懒汉式 (1)线程不安全，无法在多线程中使用*/
public class SingleTone {
	private static SingleTone sigTone = null;

	SingleTone() {
	}

	public static SingleTone getInstance() {
		if (sigTone == null) {
			sigTone = new SingleTone();
		}
		return sigTone;
	}
}

// 懒汉，线程安全
class SingleTone2 {

	private static SingleTone2 sigTone = null;

	private SingleTone2() {
	}

	public static synchronized SingleTone2 getInstance() {
		if (sigTone == null) {
			sigTone = new SingleTone2();
		}
		return sigTone;
	}

}
//饿汉式
class SingleTone3 {
	private SingleTone3() {
	}

	private static SingleTone3 instance = new SingleTone3();

	private static SingleTone3 getInstance() {
		return instance;
	}
}
