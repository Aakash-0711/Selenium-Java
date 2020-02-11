package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public Leadspage clickleadspage()
	{
		driver.findElementByLinkText("Leads").click();
		return new Leadspage();
	}

}
