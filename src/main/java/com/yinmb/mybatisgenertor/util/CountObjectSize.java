package com.yinmb.mybatisgenertor.util;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author ：yinmb@ruyi.ai
 * @date ：Created in 2020/10/30 6:58 下午
 */
public class CountObjectSize {
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		CountObjectSize object = new CountObjectSize();

		System.out.println(ClassLayout.parseInstance(object).toPrintable());

		// 8+4+0 +4*2 +0
	}
}
