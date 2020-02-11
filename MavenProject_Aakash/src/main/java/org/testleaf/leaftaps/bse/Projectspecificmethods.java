package org.testleaf.leaftaps.bse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Projectspecificmethods {
	
	public ChromeDriver driver;
	@Parameters({"URL","Username","Password"})
	@BeforeMethod
	
	public void login(String URL, String Username, String Password)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
         driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("username").sendKeys(Username);
		 driver.findElementById("password").sendKeys(Password);
		  driver.findElementByClassName("decorativeSubmit").click();
		  driver.findElementByLinkText("CRM/SFA").click();
		
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	

}
