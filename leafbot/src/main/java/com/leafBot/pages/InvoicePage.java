package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class InvoicePage extends SeleniumBase {
	
	public InvoicePage entervendorID(String taxid)
	{
		 //driver.findElementByXPath("//input[@id='vendorTaxID']").sendKeys(taxid);
		 clearAndType(locateElement("xpath", "//input[@id='vendorTaxID']"), taxid);
		 return this;
	}
	
	public InvoiceResultPage clicksearchbtn() {
		
		//driver.findElementByXPath("//button[@id='buttonSearch']").click();
		click(locateElement("xpath","//button[@id='buttonSearch']"));
		
		return new InvoiceResultPage();
	}

}
