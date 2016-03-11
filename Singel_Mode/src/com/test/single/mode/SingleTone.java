package com.test.single.mode;

/*����ʽ
 �̲߳���ȫ���޷��ڶ��߳���ʹ��*/
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