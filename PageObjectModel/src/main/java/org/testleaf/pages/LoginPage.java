package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUserName(String username) {
		driver.findElementByName("USERNAME").sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
//		HomePage obj = new HomePage();
//		return obj;
		return new HomePage();
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
