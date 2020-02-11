package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	

	public MyHomePage clickCRM() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
	
	
	
	
	
	
	
	
	
	
}
