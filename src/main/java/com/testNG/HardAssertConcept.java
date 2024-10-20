package com.testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertConcept {
	@Test
	private void demo() {
		String actual="Raja";
		String expected="Raja";
		Assert.assertEquals(actual, expected);
		System.out.println("Validation");
	}

}
