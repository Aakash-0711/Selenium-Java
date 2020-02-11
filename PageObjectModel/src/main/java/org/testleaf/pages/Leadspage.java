package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class Leadspage extends ProjectSpecificMethods {
	
	public createleadpage clickcreatelead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new createleadpage();
	}

}
