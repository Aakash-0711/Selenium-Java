package org.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testleaf.baseAPI.ProjectSpecificMethods;

public class Viewleadpage extends ProjectSpecificMethods{
	
	public Viewleadpage viewpage()
	{
		WebElement locator = driver.findElement(By.id("viewLead_firstName_sp"));
		  String text = locator.getText(); 
		  System.out.println("first name: " +text);
		  if(text.contains("Manohar")) 
		  { System.out.println("Verified"); 
		  }
		  else 
		  {
		  System.out.println("not verified"); 
		  }
		  
		  return new Viewleadpage();

	}
	
	
}
