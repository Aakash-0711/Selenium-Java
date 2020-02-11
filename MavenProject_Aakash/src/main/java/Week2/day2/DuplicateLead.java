package Week2.day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.leaftaps.bse.Projectspecificmethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Week5.day2.Exceldata;

public class DuplicateLead extends Projectspecificmethods {
	
	@DataProvider(name="duplicate")
	
	public String[][] data3() throws IOException
	{
		Exceldata data=new Exceldata();
		String[][] duplicatedata = data.duplicatedata("createlead");
		return duplicatedata;
	}

	@Test(dataProvider = "duplicate")
	public void runduplicate(String Emailaddress) throws InterruptedException {
	      driver.findElementByLinkText("Leads").click();
		  driver.findElementByLinkText("Find Leads").click();
		  driver.findElementByXPath("//span[text()='Email']").click();
		  driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(Emailaddress);
		  driver.findElementByLinkText("Find Leads").click();
		  WebElement ele = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]");
		  String text = ele.getText();
		  System.out.println(text);
		  Thread.sleep(3000);
		  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
		  driver.findElementByLinkText("Duplicate Lead").click();
		  String title = driver.getTitle();
		  System.out.println("tit= " +title);
		  driver.findElementByXPath("//input[@name='submitButton']").click();
		  
		  
		  
		  
		  //driver.close();

	}

}
