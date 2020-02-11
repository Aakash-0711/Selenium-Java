package org.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testleaf.baseAPI.ProjectSpecificMethods;

public class updatepage extends ProjectSpecificMethods {
	
	public editpage verifychangedname(String Newname) {
		 WebElement element = driver.findElement(By.id("viewLead_companyName_sp"));
		  String text = element.getText();
		  System.out.println("Company Name: " +text);
		  if(text.contains(Newname))
		  {
			  System.out.println("name changed");
		  }else
		  {
			  System.out.println("name not changed");
		  }
		  String title2 = driver.getTitle();
		  System.out.println("Second title: "+ title2 );
		  return new editpage();
		  
	}

}
