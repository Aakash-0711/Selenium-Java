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

public class EditLead extends Projectspecificmethods {
	
	@DataProvider(name="Fetchdata1")
	public String[][] senddata1() throws IOException
	{
	
	Exceldata data1=new Exceldata();
	String[][] readexceldata1 = data1.readexceldata1("createlead");
	return readexceldata1;
	
	}
@Test(dataProvider = "Fetchdata1")
	public void runedit(String firstname, String newname) throws InterruptedException {
		  //login();
		  driver.findElementByXPath("//a[text()='Leads']").click();
		  driver.findElementByLinkText("Find Leads").click();
		  driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(firstname);
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  Thread.sleep(3000);
		  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
		  driver.findElementByXPath("//a[text()='Edit']").click();
		  String title = driver.getTitle();
		  System.out.println("First title: "+ title);
		  driver.findElementById("updateLeadForm_companyName").clear();
		  driver.findElementById("updateLeadForm_companyName").sendKeys(newname);
		  driver.findElementByXPath("//input[@value='Update']").click();
		  WebElement element = driver.findElement(By.id("viewLead_companyName_sp"));
		  String text = element.getText();
		  System.out.println("Company Name: " +text);
		  if(text.contains(newname))
		  {
			  System.out.println("name changed");
		  }else
		  {
			  System.out.println("name not changed");
		  }
		  String title2 = driver.getTitle();
		  System.out.println("Second title: "+ title2 );
		  
			  
		// closebrowser();
	}

}
