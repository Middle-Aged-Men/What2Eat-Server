package com.middle.aged.men.common.util;

import java.util.UUID;

public class UUIDUtil {

	public static String generateUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
