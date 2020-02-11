package org.testleaf.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testleaf.baseAPI.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{
	 static String id;
	public String name;
	 
	public FindLeadPage verifyFirstName() {
		String FN = driver.findElementById("viewLead_firstName_sp").getText();
        System.out.println("FirstName is:" +FN);
        if(FN.equals(name)) {
        	System.out.println("Leads Duplicated Successfully");
        }
		return new FindLeadPage();
	}
	
	public FindLeadPage enterFirstName(String firstName) {
		driver.findElementByXPath("(//span[text()='Advanced']/following::input)[2]").sendKeys(firstName);
		return this;
	}
	
	public FindLeadPage enterLastName(String lastName) {
		driver.findElementByXPath("((//label[text()='Last name:'])[3]/following::input)[1]").sendKeys(lastName);
		return this;
	}
	public FindLeadPage enterCompanyName(String companyName) {
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(companyName);
		return this;
	}
	
	public FindLeadPage clickPhone() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		return this;
	}
	
	public FindLeadPage enterPhoneNumber(String phoneNumber) {
	    driver.findElementByName("phoneNumber").sendKeys(phoneNumber);
		return this;
	}
	public FindLeadPage clickEmail() {
		 driver.findElementByXPath("//span[text()='Email']").click();
		return this;
	}
	public FindLeadPage enterEmail(String email) {
		 driver.findElementByName("emailAddress").sendKeys(email);
		return this;
	}
	
	public FindLeadPage clickFindLeads() throws InterruptedException {
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("(//*[text()=\"Find Leads\"])[3]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	/*	WebDriverWait wait = new WebDriverWait(driver,90);
		WebElement element = wait.until(
		                    ExpectedConditions.visibilityOf(driver.findElementByXPath("//button[text()='Find Leads']")));
		element.click();*/
		/*ProjectSpecificMethods psm = new ProjectSpecificMethods();
		By checkoutLink = (By) driver.findElementByXPath("//button[text()='Find Leads']");
		psm.retryingFindClick(checkoutLink);*/
		return this;
	}
	
	public FindLeadPage getLeadID() throws InterruptedException {
		Thread.sleep(5000);
	      id =  driver.findElementByXPath("(//td[contains(@class,'x-grid3-col x-grid3-cell')]//div)[1]").getText();
	       System.out.println(id);     
		return this;
	}
	public FindLeadPage getFirstLeadName() {				
	       name =  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").getText();
	       System.out.println("First Name is" +name);    
		return this;
	}
	public ViewLeadPage clickLeadID() throws InterruptedException {
		Thread.sleep(15000);
      driver.findElementByXPath("(//a[@class='linktext'])[4]").click();       
		return new ViewLeadPage();
	}
	public FindLeadPage enterLeadID() {
		
	    driver.findElementByName("id").sendKeys(id);
		return this;
	}
	public FindLeadPage verifyLeadID(){
	
	       String text  = driver.findElementByXPath("//div[text()='No records to display']").getText();
	       System.out.println(text);
		return this;
	}
}
