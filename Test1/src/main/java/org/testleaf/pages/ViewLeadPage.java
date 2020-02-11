package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	FindLeadPage flp = new FindLeadPage();
	public ViewLeadPage verifyFirstName() {
		String FN = driver.findElementById("viewLead_firstName_sp").getText();
        System.out.println("FirstName is:" +FN);
        if(FN.equals("KC")) {
        	System.out.println("Leads Added Successfully");
        }
		return new ViewLeadPage();
	}
	
		public ViewLeadPage verifyFirstNamedpl() {
			String FN = driver.findElementById("viewLead_firstName_sp").getText();
	        System.out.println("FirstName is:" +FN);
	        if(FN.equals(flp.name)) {
	        	System.out.println("Duplicates Leads Added Successfully");
	        }
			return new ViewLeadPage();
	}
	public ViewLeadPage verifyCompanyName(String UpdatedCompanyName) {
		String CN = driver.findElementById("viewLead_companyName_sp").getText();
        System.out.println("Cpmpany Name is:" +CN);
        if(CN.startsWith(UpdatedCompanyName)) {
        	System.out.println("Leads Updated Successfully");
        }
        else {
        	System.out.println("Leads not Updated Successfully");
        }
		return new ViewLeadPage();
	}
	public EditLeadPage clickEdit() {
		driver.findElementByLinkText("Edit").click();
		return new EditLeadPage();
	}
	public MyLeadPage clickDelete() {
		driver.findElementByLinkText("Delete").click();
		return new MyLeadPage();
	}
	public DuplicateLeadPage clickDuplicate() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLeadPage();
	}
	
}
