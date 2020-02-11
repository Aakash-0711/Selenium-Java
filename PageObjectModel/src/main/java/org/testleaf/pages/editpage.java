package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class editpage extends ProjectSpecificMethods{
	
	public editpage verifytitle() {
		String title = driver.getTitle();
		  System.out.println("First title: "+ title);
		  return this;
	}
	
	public editpage entercompanyname(String Newname)
	{
		driver.findElementById("updateLeadForm_companyName").clear();
	  driver.findElementById("updateLeadForm_companyName").sendKeys(Newname);
	  return this;
		
	}
	
	public updatepage clickupdate()
	{
		driver.findElementByXPath("//input[@value='Update']").click();
		return new updatepage();
	}

}
