package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyLeadPage clickLead() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadPage();
	}
	


	
}
