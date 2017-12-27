package com.sunbin.project.common;

public class StringUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringUtil.isEmptyString(""));
		System.out.println(StringUtil.isEmptyString(null));
		System.out.println(StringUtil.isEmptyString("hi"));
	}

	public static boolean isEmptyString(String string) {
		return string == null ? true : string.length() == 0;
	}

}
