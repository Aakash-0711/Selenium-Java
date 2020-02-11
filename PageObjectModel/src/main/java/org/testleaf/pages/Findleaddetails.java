package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class Findleaddetails extends ProjectSpecificMethods {
	
	public Findleaddetails entername(String Firstname)
	{
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(Firstname);
		return this;
	}
	
	public Findleaddetails clickfindlead()
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}
	
	public resultingleadpage clickfirstresultinglead() throws InterruptedException
	{
		Thread.sleep(3000);
		  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
		  return new resultingleadpage();
	}

}
