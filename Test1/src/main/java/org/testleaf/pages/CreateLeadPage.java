package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage enterCompanyName(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		return this;
	}
	public CreateLeadPage enterFirstName(String firstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		return this;
	}
	public CreateLeadPage enterLastName(String lastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadSubmit() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();

	
	
	
	
	
	}
	
	
	
	
	
}
