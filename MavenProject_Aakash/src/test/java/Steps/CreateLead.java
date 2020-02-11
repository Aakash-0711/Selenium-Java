package Steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreateLead extends Launchbrowser{

	

	/*
	 * @Given("open the chrome browser") public void openTheChromeBrowser() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "./drivers/Chromedriver/chromedriver.exe"); driver = new ChromeDriver(); }
	 * 
	 * @Given("maximise the browser") public void maximiseTheBrowser() {
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * }
	 * 
	 * @Given("set implicit timeouts") public void setImplicitTimeouts() {
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }
	 * 
	 * @Given("load the leaftaps url") public void loadTheLeaftapsUrl() {
	 * driver.get("http://leaftaps.com/opentaps/control/main"); }
	 * 
	 * @Given("enter username as Demosalesmanager") public void
	 * enterUsernameAsDemosalesmanager() {
	 * 
	 * driver.findElementById("username").sendKeys("Demosalesmanager");
	 * 
	 * }
	 * 
	 * @Given("enter password as crmsfa") public void enterPasswordAsCrmsfa() {
	 * driver.findElementById("password").sendKeys("crmsfa"); }
	 * 
	 * @When("click on login button") public void clickOnLoginButton() {
	 * driver.findElementByClassName("decorativeSubmit").click(); }
	 * 
	 * @When("click on crmsfa link") public void clickOnCrmsfaLink() throws
	 * InterruptedException { driver.findElementByLinkText("CRM/SFA").click();
	 * Thread.sleep(3000); }
	 */

	@When("click on create lead")
	public void clickOnCreateLead() {
		driver.findElementByXPath("//a[text()='Create Lead']").click();
	}

	@When("enter company name as (.*)")
	public void enterCompanyNameAsTestleaf(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}

	@When("enter firstname as (.*)")
	public void enterFirstnameAsAakash(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);

	}

	@When("enter lastname as (.*)")
	public void enterLastnameAsAagu(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@When("click on create lead button")
	public void createleadbutton() {
		driver.findElementByXPath("//input[@type='submit']").click();
		//driver.close();
	}

}
