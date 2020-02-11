package org.testleaf.baseAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.utils.ExcelDataProvider;
import org.testleaf.utils.ExcelDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	public  String excelFileName;
	@Parameters({"url"})
	@BeforeMethod
	public void login(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		ExcelDataProvider data = new ExcelDataProvider();
		
		String[][] readexceldata = data.readexceldata(excelFileName);
		return readexceldata;
		
	}
}