package com.sunbin.project.common;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTestCase {

	@Test
	public void testiIsEmptyString(){
		Assert.assertTrue(StringUtil.isEmptyString(""));
		Assert.assertTrue(StringUtil.isEmptyString(null));
		Assert.assertFalse(StringUtil.isEmptyString("hi"));
	}
}
