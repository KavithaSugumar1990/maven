package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

public class TestRunner extends Base_Class {
	public static void main(String[]args) {
		launchBrowser("edge");
		launchUrl("https://www.google.com/");
		closeBrowser();
		WebElement element=driver.findElement(By.name("q"));
		passInput(element,"rose");
		terminateBrowser();
		navigatePage("https://www.amazon.in/l/89266439031?&ref=saletcpearbcepc&tag=amzbrndsaletcdpipearbcepc1-21");
		
	}

}
