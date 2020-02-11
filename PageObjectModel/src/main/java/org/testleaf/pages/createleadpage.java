package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class createleadpage extends ProjectSpecificMethods{

	public createleadpage entercompanyname(String Companyname)
	{
		  driver.findElementById("createLeadForm_companyName").sendKeys(Companyname);
			 
			 
			 return this;
	}
	
	public createleadpage enterfirstname(String Firstname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(Firstname);
		return this;
	}
	
	public createleadpage enterlastname(String Lastname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(Lastname);
		return this;
	}
	
	public Viewleadpage clickcreateleadbutton()
	{
		driver.findElementByName("submitButton").click();
		return new Viewleadpage();
	}
	
}
