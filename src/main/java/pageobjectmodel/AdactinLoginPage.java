package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelement.AdactinApplicationElements;
import com.property.FileReaderManager;

public class AdactinLoginPage extends Base_Class implements AdactinApplicationElements{
	//place to store web elements
	
	

	@FindBy(id=username_id)
	private WebElement username;
	
	@FindBy(id=password_id)
	private WebElement password;
	
	@FindBy(xpath=login_xpath)
	private WebElement login;
	
	
	public AdactinLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	


	
	public void validUserNameAndValidPassword() throws IOException{
		FileReaderManager data=new FileReaderManager();
		passInput(username,data.getDataProperty("loginusername"));
		passInput(password,data.getDataProperty("loginpassword"));
		elementClick(login);
		
		
		
	}
}
