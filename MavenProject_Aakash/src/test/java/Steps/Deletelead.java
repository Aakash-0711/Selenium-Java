package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Deletelead extends Launchbrowser{
	
	//public static ChromeDriver driver;
	
	

	@Then("click on phone")
	public void clickOnPhone() {
		
		driver.findElementByXPath("//span[text()='Phone']").click();
	}

	@Then("enter phonenumber as (.*)")
	public void enterPhonenumberAs(String phonenum) {
		driver.findElementByName("phoneNumber").sendKeys(phonenum);
	}

	@Then("click find leads button")
	public void clickFindLeadsButton() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

	@Then("capture lead id")
	public void captureLeadId() {
		 WebElement ele = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]"); 
		  String text =ele.getText(); 
		  System.out.println(text);
	}

	@Then("click on resulting lead")
	public void clickOnResultingLead() throws InterruptedException {
		Thread.sleep(3000);
		  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
	}

	@Then("click delete")
	public void clickDelete() {
		driver.findElementByXPath("(//div[@class='frameSectionExtra']//a)[4]").click(); 
	}

	@Then("click find leads")
	public void clickFindLeads() {
		 driver.findElementByLinkText("Find Leads").click();
	}

	@Then("enter captured lead id")
	public void enterCapturedLeadId() {
		
		driver.findElementByName("id").sendKeys("1");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

	@When("verify no records")
	public void verifyNoRecords() {
		 WebElement ele1 =driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]");
		  String text2 = ele1.getText(); 
		  if(text2.contains("No records")) {
		  System.out.println("not verified"); 
		  }else 
		  { System.out.println("verified"); 
		  }
		  driver.close();
	}
	
	
}
