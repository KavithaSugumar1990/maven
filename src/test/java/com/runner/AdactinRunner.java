package com.runner;

import java.io.IOException;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManager;

public class AdactinRunner extends Base_Class {
	public static void main(String[] args) throws Throwable {
		
	
	
	PageObjectManager pageObjectManage=new PageObjectManager();

	launchBrowser(pageObjectManage.getFileReader().getDataProperty("browser"));
	launchUrl(pageObjectManage.getFileReader().getDataProperty("url"));
	pageObjectManage.getLoginPage().validUserNameAndValidPassword();
	
}
	}
