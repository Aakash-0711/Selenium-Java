package Week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginSel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();//obj for chrome
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");//username
		driver.findElementById("password").sendKeys("crmsfa");//pwd
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Test");
		driver.findElementById("createLeadForm_firstName").sendKeys("Aakash");
		driver.findElementById("createLeadForm_lastName").sendKeys("Aagu");
		/*
		 * driver.findElementByName("submitButton").click(); String text =
		 * driver.findElementById("viewLead_firstName_sp").getText();
		 * System.out.println(text);
		 */
          WebElement drop1 = driver.findElementById("createLeadForm_industryEnumId");
		Select drop=new Select(drop1);
		drop.selectByValue("IND_RETAIL");
		WebElement drop2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dro=new Select(drop2);
		List<WebElement> li = dro.getOptions();
		int size = li.size();
		dro.selectByIndex(size-1);
		WebElement drop3=driver.findElementById("createLeadForm_ownershipEnumId");
		Select dro1=new Select(drop3);
		dro1.deselectByValue("OWN_CCORP");
		
		
		//driver.close();
	}

}
