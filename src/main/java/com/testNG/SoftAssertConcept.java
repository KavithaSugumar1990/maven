package com.testNG;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;


public class SoftAssertConcept {
	@Test
	private void demo() {
		String actual="Raja";
		String expected="raja";
		SoftAssertConcept sac=new SoftAssertConcept();
		sac.assertEquals(actual, expected);
		
		System.out.println("Verification");
	}


}
