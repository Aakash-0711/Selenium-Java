package Week2.day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testleaf.leaftaps.bse.Projectspecificmethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Week5.day2.Exceldata;


public class CreateLead extends Projectspecificmethods {
	
	@DataProvider(name="Fetchdata")
	public String[][] senddata() throws IOException
	{
		/*
		 * String[][] data = new String[2][3]; data[0][0]="Testleaf";
		 * data[0][1]="Manohar"; data[0][2]="aagu"; data[1][0]="Tcs";
		 * data[1][1]="Ironman"; data[1][2]="Alan"; return data;
		 */
		Exceldata data=new Exceldata();
		String[][] readexceldata = data.readexceldata("createlead");
		return readexceldata;
		
	}
	
	@Test(dataProvider ="Fetchdata")

	public  void runcreate(String companyname,String firstname, String lastname ) {
		 //login();
		 driver.findElementByXPath("//a[text()='Create Lead']").click();
		  driver.findElementById("createLeadForm_companyName").sendKeys(companyname);
		 driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
		 driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
		  driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Alan");
		  driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Walker");
		 driver.findElementById("createLeadForm_personalTitle").sendKeys("Hello Dear"); 
		 WebElement drop1 = driver.findElementById("createLeadForm_dataSourceId");
		  Select dd=new Select(drop1); 
		  dd.selectByVisibleText("Employee");;
		  driver.findElementById("createLeadForm_generalProfTitle").sendKeys("lead");
		  driver.findElementById("createLeadForm_annualRevenue").sendKeys("100000");
		 WebElement drop2 = driver.findElementById("createLeadForm_industryEnumId");
		  Select dd1=new Select(drop2); 
		  dd1.selectByVisibleText("Computer Software");
		 WebElement drop3 = driver.findElementById("createLeadForm_ownershipEnumId");
		  Select dd2=new Select(drop3); 
		  dd2.selectByVisibleText("Corporation");
		  driver.findElementById("createLeadForm_sicCode").sendKeys("1234");
		  driver.findElementById("createLeadForm_description").sendKeys("abaaba");
		  driver.findElementById("createLeadForm_importantNote").sendKeys("qwerty");
		  driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("12");
		  driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("22");
		  driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("222" ); 
		  driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		  WebElement drop4 = driver.findElementById("createLeadForm_currencyUomId");
		  Select dd3=new Select(drop4); 
		  dd3.selectByVisibleText("INR - Indian Rupee");
		  driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");
		  driver.findElementById("createLeadForm_tickerSymbol").sendKeys("aaa");
		  driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("google");
		  driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.testleaf.com");
		  driver.findElementById("createLeadForm_generalToName").sendKeys("aags");
		  driver.findElementById("createLeadForm_generalAddress1").sendKeys("perambur"); 
		  driver.findElementById("createLeadForm_generalAddress2").sendKeys("gkm");
		 driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
		 WebElement drop5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId"); 
		 Select dd4=new Select(drop5); 
		 dd4.selectByVisibleText("California"); 
		 WebElement drop6 = driver.findElementById("createLeadForm_generalCountryGeoId"); 
		 Select dd5=new Select(drop6); 
		 dd5.selectByVisibleText("United States");
		  driver.findElementById("createLeadForm_generalPostalCode").sendKeys("1258");
		  driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("444"); 
		  WebElement drop7 =driver.findElementById("createLeadForm_marketingCampaignId"); 
		  Select dd6=new Select(drop7); 
		  dd6.selectByVisibleText("Demo Marketing Campaign");
		  driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("555555"); 
		  driver.findElementById("createLeadForm_primaryEmail").sendKeys("aag@gmail.com"); 
		  driver.findElementByName("submitButton").click();
		  WebElement locator = driver.findElement(By.id("viewLead_firstName_sp"));
		  String text = locator.getText(); 
		  System.out.println("first name: " +text);
		  if(text.contains("Manohar")) 
		  { System.out.println("Verified"); 
		  }
		  else 
		  {
		  System.out.println("not verified"); 
		  }
		  
		  
		 //closebrowser();
	}

}
