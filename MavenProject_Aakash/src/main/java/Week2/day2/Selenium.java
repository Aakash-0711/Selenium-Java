package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();//obj for chrome
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");//username
		driver.findElementById("password").sendKeys("crmsfa");//pwd
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();;
		driver.findElementByName("phoneNumber").sendKeys("12");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(3000);
        driver.close();
	}

}
