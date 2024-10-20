package com.testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.Base_Class;

public class Xpath_Scenario extends Base_Class {
	
	@Test
	public void xPath() {
		
	
	launchBrowser("chrome");
	launchUrl("https://www.amazon.in/gp/help/customer/display.html/ref=ap_register_notification_condition_of_use?ie=UTF8&nodeId=200545940");
	driver.findElement(By.xpath("//p[text()[normalize-space()='Account Settings']]")).click();	
	}
}
