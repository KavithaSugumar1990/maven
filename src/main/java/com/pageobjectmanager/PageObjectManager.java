package com.pageobjectmanager;

import com.base.Base_Class;
import com.property.FileReaderManager;

import pageobjectmodel.AdactinLoginPage;

public class PageObjectManager extends Base_Class {
	
	private AdactinLoginPage loginPage;
	
	private FileReaderManager fileReader;//RC-->source->gen getters and setters->
//we alredy setso select getters next methods will generate automatically
	public AdactinLoginPage getLoginPage() {
		if(loginPage==null) {
			loginPage=new AdactinLoginPage(driver);
		}
		
		return loginPage;
	}

	public FileReaderManager getFileReader() {
		if(fileReader==null) {
			fileReader=new FileReaderManager();
		}
		return fileReader;
	}
	
	
	
	

}
