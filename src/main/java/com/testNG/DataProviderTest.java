package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Base_Class;

public class DataProviderTest extends Base_Class {
	@Test(dataProvider= "login",timeOut=2000)
	private void login(String username,String password) {

		launchBrowser("chrome");
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();	
	}
	@DataProvider(name="login")
	public Object[][] dataset(){
		return new Object[][]
				{{"Admin","admin123"},{"abc","123"},{"def","456"},{" "," "}};
	}
	}
	
		



