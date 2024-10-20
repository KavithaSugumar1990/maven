package com.runner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManagerMRS;

public class OpenMRSRunner extends Base_Class {
	PageObjectManagerMRS pageObjectManager=new PageObjectManagerMRS();
	
	@BeforeMethod
	public void setUp() throws Throwable {
		launchBrowser(pageObjectManager.getFileReader().getDataProperty("browser"));
		
	}
	@Test
	public void validLogin() throws Throwable {//getLoginPage().validLogin();
		pageObjectManager.getLoginPage().validLogin();
	}
	@AfterMethod
	public void terminate() {
		terminateBrowser();
	}
	
	
	

}
