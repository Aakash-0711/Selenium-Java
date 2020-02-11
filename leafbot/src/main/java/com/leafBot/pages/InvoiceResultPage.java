package com.leafBot.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.leafBot.selenium.api.base.SeleniumBase;

public class InvoiceResultPage extends SeleniumBase{
	
	
	public HomePage invoicenumber()
	{
		 List<WebElement> tablerows = driver.findElementsByXPath("//table[@class='table']//tr");
	      int size = tablerows.size();
	      
	      for (int i = 2; i < size; i++) {
	    	  String text = driver.findElementByXPath("//table[@class='table']//tr["+i+"]/td[3]").getText();  
	    	  if(text.equals("IT Support"))
	    			  {
	    		  String ele2 = driver.findElementByXPath("//table[@class='table']//tr["+i+"]/td[1]").getText();
	    		  System.out.println(ele2);
	    	  }
	     return new HomePage();
	}
		return null;

	}
}
