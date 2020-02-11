package org.testleaf.leaftaps.bse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Amazonspecific {
	
	public ChromeDriver driver;

	@BeforeMethod
		public void login() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(20000);
			
		}
	
	@AfterMethod
	
	public void close()
	{
		driver.close();
	}

	

}
