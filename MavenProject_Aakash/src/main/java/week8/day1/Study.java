package week8.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Study {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "./Drivers/Geckodriver/geckodriver_64 bit.exe"); FirefoxDriver driver=new
		 * FirefoxDriver(); System.setProperty("webdriver.ie.driver",
		 * "./Drivers/Geckodriver/geckodriver_64 bit.exe"); InternetExplorerDriver
		 * driver=new InternetExplorerDriver();
		 * System.setProperty("webdriver.edge.driver",
		 * "./Drivers/Geckodriver/geckodriver_64 bit.exe"); EdgeDriver driver = new
		 * EdgeDriver(); System.setProperty("webdriver.safari.driver",
		 * "./Drivers/Geckodriver/geckodriver_64 bit.exe");
		 * 
		 * SafariDriver driver=new SafariDriver();
		 */
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*
		 * WebElement ele = driver.findElementById("dropdown1"); Select s=new
		 * Select(ele); s.selectByValue("3"); //s.selectByVisibleText("Appium"); boolean
		 * multiple = s.isMultiple(); System.out.println(multiple) ;
		 * //driver.findElementByXPath("(//option[text()='Appium'])[1]").click();
		 * 
		 * WebElement ele = driver.findElementByXPath("(//option[text()='Appium'])[1]");
		 * Actions act=new Actions(driver); act.moveToElement(ele).click();
		 * Thread.sleep(5000);
		 */
		 //driver.findElementByLinkText("Open Multiple Windows").click();
		 driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		 Set<String> windowHandles = driver.getWindowHandles();
		 //List<String> li =new ArrayList<String>(windowHandles);
		 //String str = li.get(1);
		//int size = li.size(); 
		 //driver.switchTo().window(str);
		 //driver.findElementByXPath("//img[@alt='Buttons']").click();
//System.out.println(size);
         int i=0;
         for (String eachwindow : windowHandles) {
			if(i==2) {
				break;
			}
			i++;
			driver.switchTo().window(eachwindow);
		}
        String text = driver.findElementByXPath("//a[text()='Verify am I broken?']").getText();
        System.out.println(text);
         //driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		driver.quit();

	}

}
