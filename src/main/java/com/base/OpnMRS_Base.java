package com.base;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpnMRS_Base extends Base_Class{	
		@Test(priority = 1)
		private void loginMethod() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.name("username")).sendKeys("Admin");//username
		driver.findElement(By.name("password")).sendKeys("Admin123");//password
		driver.findElement(By.xpath("//li[@ id='Inpatient Ward']")).click();//inpatient ward
		driver.findElement(By.id("loginButton")).click();//login
		driver.findElement(By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")).click();
		}
		
		@Test(priority = 2)
		private void registerPatient() {
			driver.findElement(By.xpath("//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")).click();
			
			
			
		}
		
		
}
