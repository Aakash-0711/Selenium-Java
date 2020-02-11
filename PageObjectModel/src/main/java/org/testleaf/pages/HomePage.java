package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public MyHomePage clickcrmsfa() {
		 driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
