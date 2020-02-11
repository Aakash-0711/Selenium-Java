package Week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
	    ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElementById("RoundTrip").click();
		driver.findElementByXPath("//input[@id='FromTag']").sendKeys("Chennai",Keys.TAB);
		driver.findElementByXPath("//input[@id='ToTag']").sendKeys("New York",Keys.TAB);
		driver.findElementById("DepartDate").click();
		driver.findElementByLinkText("9").click();
		driver.findElementById("ReturnDate").click();
		driver.findElementByLinkText("23").click();
		WebElement adult = driver.findElementById("Adults");
		Select drop1=new Select(adult);
		drop1.selectByVisibleText("2");
		WebElement child = driver.findElementById("Childrens");
		Select drop2=new Select(child);
		//drop2.selectByValue("1");
		drop2.selectByIndex(1);
		WebElement infant = driver.findElementById("Infants");
		Select drop3=new Select(infant);
		drop3.selectByIndex(1);
		driver.findElementById("MoreOptionsLink").click();
		WebElement dd = driver.findElementById("Class");
		Select d1=new Select(dd);
		d1.selectByVisibleText("Premium Economy");
		driver.findElementById("AirlineAutocomplete").sendKeys("Emirates",Keys.TAB);
		driver.findElementById("SearchBtn").click();
		
		
		
		
		

	}

}
