package Week5.day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testleaf.leaftaps.bse.Redbusspecificmethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Redbus extends Redbusspecificmethods{
	
	@DataProvider(name="fetch")
		
	public String[][] redtest() throws IOException
	{
		RedbusExcel data=new RedbusExcel();
		String[][] readredbus = data.readredbus("Redbus");
		return readredbus;
	}
	
	@Test(dataProvider = "fetch")

	public void runbus(String From, String To) throws InterruptedException {
		
		driver.findElementByXPath("//input[@id='src']").sendKeys(From);
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='dest']").sendKeys(To);
		Thread.sleep(3000);
		driver.findElementByXPath("//label[text()='Onward Date']").click();
        driver.findElementByXPath("(//td[@class='current day'])[2]").click();
       driver.findElementByXPath("//label[text()='Return Date']").click();
    driver.findElementByXPath("(//td[@class='current day'])[2]").click();
		/*
		 * WebElement frame = driver.findElementByTagName("iframe");
		 * driver.switchTo().frame(frame);
		 */
    Thread.sleep(5000);   
     driver.findElementById("search_btn").click();

    driver.findElementByXPath("(//label[@for='dtAfter 6 pm'])[2]").click();
Thread.sleep(5000);
driver.findElementByXPath("(//label[@for='bt_AC'])[2]").click();

List<WebElement> li = driver.findElementsByXPath("//div[@class='travels lh-24 f-bold d-color']");

int size = li.size();

System.out.println("Total bus: " + size);

		/*
		 * Set<String> hashSet = new HashSet<String>(); for (WebElement web : li) {
		 * 
		 * 
		 * }
		 */



 

	}

}
