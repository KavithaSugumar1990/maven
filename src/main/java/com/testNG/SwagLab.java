package com.testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base_Class;

public class SwagLab extends Base_Class {
	@Test(groups="Product")
	private void browserLaunch() {
		launchBrowser("chrome");
	}
	@Test(dependsOnMethods="browserLaunch",groups="Product")
	private void urlLaunch() {
		launchUrl("https://www.saucedemo.com/v1/index.html");
		
		
	}
	@Test(dependsOnMethods="urlLaunch",groups="Product")
	private void login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/v1/inventory.html");
		}
	@Test(dependsOnMethods="login",groups="Product")
	private void searchProduct() {
		driver.findElement(By.xpath("//div[@class='inventory_item_name']")).click();
	}
	
	@Test(dependsOnMethods="searchProduct",groups="Product")
	private void addToCart() {
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//*[ @fill='currentColor']")).click();
	}
	@Test(dependsOnMethods="addToCart",groups="Product")
	private void checkOut() {
		driver.findElement(By.xpath("//*[text()='CHECKOUT']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Kavitha");
		driver.findElement(By.id("last-name")).sendKeys("Sugumar");
		driver.findElement(By.id("postal-code")).sendKeys("600054");
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
		driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
		
	}
	
	@Test(dependsOnMethods="checkOut")
	private void logout() {
		terminateBrowser();
	}
	

}
