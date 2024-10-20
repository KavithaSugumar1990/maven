package com.property;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {
	
	private static Properties property;
	private static FileInputStream fileInputStream;

	private static void setupProperty() throws IOException {
		if(property==null) {
			File file=new File("C:\\Users\\91988\\Downloads\\eclipse-jee-2024-06-R-win32-x86_64\\eclipse\\kavithaFrame\\MavenProject\\src\\main\\java\\com\\property\\TestData.properties");
			try {
				fileInputStream=new FileInputStream(file);
				property =new Properties();
				property.load(fileInputStream);
			
			
			}catch(FileNotFoundException e) {
				Assert.fail("ERROR:File Not Found Exception Occur During File Loading");
			}catch(Exception e) {
				Assert.fail("ERROR:File Not Found Exception Occur During File Loading");
			}
		}
	}
	public static String getDataProperty(String dataValue) throws IOException {
		setupProperty();
		
		String browsername=property.getProperty(dataValue);
		
		
		return browsername;
		
	}
}
