package com.pageobjectmanager;

import com.base.Base_Class;
import com.property.FileReaderManager;
import com.property.FileReaderManagerMRS;

import pageobjectmodel.AdactinLoginPage;
import pageobjectmodel.OpenMrsLoginPage;

public class PageObjectManagerMRS extends Base_Class {
private OpenMrsLoginPage loginPage;
	
	private FileReaderManagerMRS fileReader;//RC-->source->gen getters and setters->
//we alredy setso select getters next methods will generate automatically
	public OpenMrsLoginPage getLoginPage() {
		if(loginPage==null) {
			loginPage=new OpenMrsLoginPage(driver);
		}
		
		return loginPage;
	}

	public FileReaderManagerMRS getFileReader() {
		if(fileReader==null) {
			fileReader=new FileReaderManagerMRS();
		}
		return fileReader;
	}
	

}
