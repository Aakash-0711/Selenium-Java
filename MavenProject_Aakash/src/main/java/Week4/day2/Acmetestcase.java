package Week4.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Acmetestcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
		driver.findElementByXPath("//button[text()='Log In']").click();
		WebElement ele = driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]");
		Actions br=new Actions(driver);
		br.moveToElement(ele).perform();
		driver.findElementByXPath("//a[text()='Search for Vendor']").click();
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
		driver.findElementByXPath("//button[text()='Search']").click();
		WebElement ele1 = driver.findElementByXPath("//table//tr//td[text()='Blue Lagoon']");
		WebElement ele2 = driver.findElementByXPath("//table//tr//td[text()='Blue Lagoon' ]/following::td[4]");
		Map<String, String> map = new HashMap<String, String>();
		String str1 = ele1.getText();
		String str2 = ele2.getText();
		map.put(str1, str2);
		System.out.println(map);
		//System.out.println("Vendor name:" + ele1.getText() +  " " + "Country:" + ele2.getText());
		driver.findElementByXPath("//a[text()='Log Out']").click();
		Thread.sleep(3000);
		driver.close();
		
	
		
        

	}

}
