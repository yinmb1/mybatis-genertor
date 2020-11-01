package com.yinmb.mybatisgenertor.util;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author ：yinmb@ruyi.ai
 * @date ：Created in 2020/10/30 6:39 下午
 */
public class CountEmptyObjectSize {
	public CountEmptyObjectSize() {
	}

	public static void main(String[] args) {

		CountEmptyObjectSize obj = new CountEmptyObjectSize();

		System.out.println(ClassLayout.parseInstance(obj).toPrintable());

	}
}
