package com.middle.aged.men.util;

public class ThreadUtil {

	public static void sleep(long time) {
		if(time <= 0) {
			return;
		}
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
