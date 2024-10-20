package com.base;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public abstract class Base_Class {
	public static WebDriver driver;
	protected static WebDriver launchBrowser(String browserName) {
	try {
			if(browserName.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver(); 
		}
			else if(browserName.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver(); 
		}
	}catch(Exception e) {
		
	}
	driver.manage().window().maximize();	
	return driver;
		
	}
	protected static WebDriver launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("ERROR:OCCUR DURING BROWSER LAUNCH");
			
		}
	
		return driver;
		
	}
	protected static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			
		}
	}
	protected static void terminateBrowser(){
		try {
			driver.quit();
		} catch (Exception e) {
			
			
		}
	}
	protected static void passInput(WebElement element,String input) {
		try {
			element.sendKeys(input);
			
		} catch (Exception e) {
			
		}
	}
	protected static void elementClick(WebElement element) {
		try {
			element.click();
			
		} catch (Exception e) {
			
		}
	}
	protected static void navigatePage(String url){
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	protected static void validation(String actual,String expected) {
		try {
			Assert.assertEquals(actual, expected);
			
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING VALIDATION ");
			
		}
	}

}
 