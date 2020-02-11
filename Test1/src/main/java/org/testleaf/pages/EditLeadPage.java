package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
	public EditLeadPage clearCompanyName() {
		driver.findElementById("updateLeadForm_companyName").clear();
		return this;
	}
	public EditLeadPage enterCompanyName(String UpdatedCompanyName) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(UpdatedCompanyName);
		return this;
	}
	
	public ViewLeadPage clickUpdate() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
}
