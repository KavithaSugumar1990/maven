package com.testNG;

import org.testng.annotations.Test;

import com.base.Base_Class;

public class InvocationCount_Test extends Base_Class {
	@Test(invocationCount = 2)
	private void firefox() {

		launchBrowser("firefox");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID : " + Thread.currentThread().getId());
		terminateBrowser();
		System.out.println("Firefox");

	}

	@Test(invocationCount = 3)
	private void edge() {

		launchBrowser("edge");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID : " + Thread.currentThread().getId());
		terminateBrowser();
		System.out.println("Edge");

	}

}
