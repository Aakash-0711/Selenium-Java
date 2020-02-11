package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead extends Launchbrowser {
	
	//public static ChromeDriver driver;

	
	
	@When("click on leads")
	public void clickOnLeads() throws InterruptedException  {
		
		//Thread.sleep(3000);
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		Thread.sleep(3000);
	}

	@Then("click on find leads")
	public void clickOnFindLeads() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByLinkText("Find Leads").click();
	}

	@Then("enter first name as (.*)")
	public void enterFirstNameAsAakash(String firstname) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(firstname);
	}

	@Then("click on find leads button")
	public void clickOnFindLeadsButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		  Thread.sleep(3000);
	}

	@Then("click on first resulting lead")
	public void clickOnFirstResultingLead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
	}

	@Then("verify the title of the page")
	public void verifyTheTitleOfThePage() {
		String title = driver.getTitle();
		  System.out.println("First title: "+ title);
	}

	@Then("click edit button")
	public void clickEditButton() {
		driver.findElementByXPath("//a[text()='Edit']").click();
	}

	@Then("enter new company name as (.*)")
	public void enterNewCompanyNameAsHcl(String companyname) {
		 driver.findElementById("updateLeadForm_companyName").clear();
		  driver.findElementById("updateLeadForm_companyName").sendKeys(companyname);
	}

	@Then("click on update")
	public void clickOnUpdate() {
		driver.findElementByXPath("//input[@value='Update']").click();
	}

	@Then("confirm the changed name as (.*)")
	public void confirmTheChangedName(String companyname) {
		 WebElement element = driver.findElement(By.id("viewLead_companyName_sp"));
		  String text = element.getText();
		  System.out.println("Company Name: " +text);
		  if(text.contains(companyname))
		  {
			  System.out.println("name changed");
		  }else
		  {
			  System.out.println("name not changed");
		  }
		  String title2 = driver.getTitle();
		  System.out.println("Second title: "+ title2 );
		  //driver.close();
	}

}
