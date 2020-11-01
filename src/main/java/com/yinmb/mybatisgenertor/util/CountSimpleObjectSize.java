package com.yinmb.mybatisgenertor.util;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author ：yinmb@ruyi.ai
 * @date ：Created in 2020/10/31 10:08 上午
 */
public class CountSimpleObjectSize {

	static int[] arr = {0, 1, 2};

	public static void main(String[] args) {
		CountSimpleObjectSize test1 = new CountSimpleObjectSize();

		System.out.printf(ClassLayout.parseInstance(arr).toPrintable());

		// 8+4+4  + 3*4 +4（对其填充）
	}
}
