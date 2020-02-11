package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class resultingleadpage extends ProjectSpecificMethods{
	
	public editpage clickedit()
	{
		driver.findElementByXPath("//a[text()='Edit']").click();
		return new editpage();
	}

}
