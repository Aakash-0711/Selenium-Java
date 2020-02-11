package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.leafBot.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	public LoginPage clickLogout() {
		click(locateElement("xpath","//a[text()='Log Out']"));
		return new LoginPage();
	}
	
	public InvoicePage clickinvoices()
	{
		WebElement ele = driver.findElementByXPath("//div[@class='dropdown'][6]");
        Actions act=new Actions(driver);
     act.moveToElement(ele).perform();
     driver.findElementByXPath("//a[text()='Search for Invoice']").click();
     return new InvoicePage();
	}

}
