package Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;

public class Duplicatelead extends Launchbrowser{
	
	//public static ChromeDriver driver;
	
	@Then("click on email")
	public void clickOnEmail() {
		driver.findElementByXPath("//span[text()='Email']").click();
	}

	@Then("enter email as (.*)")
	public void enteremail(String email) {
		
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(email);
	   
	}

	@Then("capture name of the firstlead")
	public void captureNameOfTheFirstlead() {
		WebElement ele = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]");
		  String text = ele.getText();
		  System.out.println(text);
	}

	@Then("click duplicate lead")
	public void clickDuplicateLead() {
		driver.findElementByLinkText("Duplicate Lead").click();
	}

	@Then("verify the title as duplicate lead")
	public void verifyTheTitleAsDuplicateLead() {
		 String title = driver.getTitle();
		  System.out.println("tit= " +title);
	}

	@Then("click create lead")
	public void clickCreateLead() {
		  driver.findElementByXPath("//input[@name='submitButton']").click();
		  driver.close();
	}

	

}
