package com.testNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	@BeforeSuite
	private void propertySetting() {
		System.out.println("property Setting");
		}
	@BeforeTest
	private void browserlaunch() {
		System.out.println("browserlaunch");
		
	}
	@BeforeClass
	private void urllaunch() {
		System.out.println("url launch");
	}
	@BeforeMethod
	private void login() {
	System.out.println("Login");
	}
	@Test
	private void men() {
		System.out.println("men");
	}
	
	@Test
	private void women() {
		System.out.println("women");
	}
	
	@Test(enabled=false)
	private void kid() {
		System.out.println("kids");
	}
	@AfterMethod
	private void logOut() {
		System.out.println("logout");
	}
	@AfterClass
	private void screenShot() {
		System.out.println("screenshot");
		
	}
	@AfterTest
	private void closeBrowser() {
		System.out.println("close browser");
	}
	
	
	@AfterSuite
	private void terminateBrowser() {
		System.out.println("Terminte Browser");
	}
	
	


}
