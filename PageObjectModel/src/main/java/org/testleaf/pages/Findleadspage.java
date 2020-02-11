package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class Findleadspage extends ProjectSpecificMethods {
	
	public Findleaddetails clickfindleadspage()
	{
		 driver.findElementByLinkText("Find Leads").click();
		 return new Findleaddetails();
				 
	}

}
