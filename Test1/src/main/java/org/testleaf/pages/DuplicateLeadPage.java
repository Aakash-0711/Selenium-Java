package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{
	
	public DuplicateLeadPage verifyDuplicateLead() {
		String Title = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
        System.out.println("Title is:" +Title);
        if(Title.equals("Duplicate Lead")) {
        	System.out.println("Duplicate Lead Added Successfully");
        }
		return this;
	}
	
	public ViewLeadPage clickCreateLead() {
		driver.findElementByLinkText("//input[@value='Create Lead']").click();
		return new ViewLeadPage();
	}
	
}
