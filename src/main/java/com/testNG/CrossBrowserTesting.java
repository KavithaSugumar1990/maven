package com.testNG;

import org.testng.annotations.Test;

import com.base.Base_Class;

public class CrossBrowserTesting extends Base_Class {
	@Test(priority = 0)
	private void chrome() {

		launchBrowser("chrome");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID : " + Thread.currentThread().getId());
		terminateBrowser();

	}

	@Test(priority = 1)
	private void firefox() {

		launchBrowser("firefox");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID : " + Thread.currentThread().getId());
		terminateBrowser();

	}

	@Test(priority = 2)
	private void edge() {

		launchBrowser("edge");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID : " + Thread.currentThread().getId());
		terminateBrowser();

	}

}
