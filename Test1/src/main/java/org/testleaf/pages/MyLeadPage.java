package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	
	public FindLeadPage clickFindLead() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPage();
	}
	
	
	
	
	
	
	
	
	
	
}
