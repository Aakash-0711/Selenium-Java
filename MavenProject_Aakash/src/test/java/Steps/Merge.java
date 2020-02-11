package Steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Then;

public class Merge extends Launchbrowser {
	
	//public static ChromeDriver driver;
	
	

	@Then("click on Merge leads")
	public void clickOnMergeLeads() {
		
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
	}

	@Then("Click on Icon near From Lead")
	public void clickOnIconNearFromLead() {
		 driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
	   
	}

	@Then("Move to new window")
	public void moveToNewWindow() {
		  Set<String> windowHandles = driver.getWindowHandles();
		 List<String> al = new ArrayList<String>(windowHandles);
		  String str = al.get(1);
		  driver.switchTo().window(str);
	}

	@Then("Enter From Lead ID as (.*)")
	public void enterLeadID(String From) {
		driver.findElementByXPath("//input[@name='id']").sendKeys(From);
	   
	}

	@Then("Click Find Leads button")
	public void clickFindLeadsButton() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	   
	}

	@Then("Click First Resulting lead")
	public void clickFirstResultingLead() throws InterruptedException {
		Thread.sleep(3000);
		  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
	   
	}

	@Then("Switch back to primary window")
	public void switchBackToPrimaryWindow() {
		  Set<String> windowHandles = driver.getWindowHandles();
			 List<String> al = new ArrayList<String>(windowHandles);
			  
		driver.switchTo().window(al.get(0));
	   
	}

	@Then("Click on Icon near To Lead")
	public void clickOnIconNearToLead() throws InterruptedException {
		 Thread.sleep(3000);
		  driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		  Set<String> windowHandles2 = driver.getWindowHandles();
		  List<String> al1 = new ArrayList<String>(windowHandles2);
		  String str1 = al1.get(1);
		  driver.switchTo().window(str1);
	}
	
	@Then("Enter To Lead ID as (.*)")
	public void entertoLeadID(String To) {
		driver.findElementByXPath("//input[@name='id']").sendKeys(To);
	}

	@Then("Click Merge")
	public void clickMerge() {
	    
		driver.findElementByXPath("//a[text()='Merge']").click();
	}

	@Then("Accept Alert")
	public void acceptAlert() {
	    
		driver.switchTo().alert().accept();
	}

	@Then("Click Find Leads")
	public void clickFindLeads() {
		driver.findElementByXPath("//a[text()='Find Leads']").click(); 
		WebElement ele1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]");
		 String text2 = ele1.getText();
		 System.out.println(text2);
		 driver.findElementByXPath("//input[@name='id']").sendKeys(text2);
	
	}

	/*
	 * @Then("Enter From Lead ID as (.*)") public void enterFromLeadID(String From)
	 * {
	 * 
	 * driver.findElementByXPath("//input[@name='id']").sendKeys(From); }
	 */

	@Then("Verify the first lead does not exist anymore \\(No records found)")
	public void verifyTheFirstLeadDoesNotExistAnymoreNoRecordsFound() {
		
		 WebElement ele = driver.findElementByXPath("//div[text()='No records to display']");
		  String text = ele.getText();
		  {
			  if(text.contains("No records to display"))
			  {
				  System.out.println("Verified");
			  }
			  else
			  {
				  System.out.println("Not verified");
			  }
		  }
		  
		  //Thread.sleep(3000);
		  //driver.quit(); 
	   
	}

}
