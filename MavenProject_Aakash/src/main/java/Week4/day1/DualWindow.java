package Week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DualWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElementById("username").sendKeys("DemoSalesManager");
		 driver.findElementById("password").sendKeys("crmsfa");
		  driver.findElementByClassName("decorativeSubmit").click();
		  driver.findElementByLinkText("CRM/SFA").click();
		  driver.findElementByLinkText("Leads").click();
		  driver.findElementByLinkText("Merge Leads").click();
		  driver.findElementByXPath("//img[@alt='Lookup'][1]").click();
		  Set<String> windowHandles = driver.getWindowHandles();
		  List<String> allhandle = new ArrayList<String>(windowHandles);
		  String str = allhandle.get(1);
		  driver.switchTo().window(str);
		  driver.findElementByName("firstName").sendKeys("a");
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  Thread.sleep(3000);
		  driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		  
		  driver.switchTo().window(allhandle.get(0));
		  
		  driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		  Set<String> windowHandles2 = driver.getWindowHandles();
		  List<String> allhandle2 = new ArrayList<String>(windowHandles2);
		  String str2 = allhandle2.get(1);
		  driver.switchTo().window(str2);
		  driver.findElementByName("lastName").sendKeys("v");
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  Thread.sleep(3000);
		  driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		  driver.switchTo().window(allhandle.get(0));
		  driver.quit();
		  
		  

	}

}
