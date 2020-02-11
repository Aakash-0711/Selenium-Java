package week8.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver/chromedriver.exe");

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://acme-test.uipath.com/account/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
        driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
        driver.findElementById("buttonLogin").click();
        WebElement ele = driver.findElementByXPath("//div[@class='dropdown'][6]");
         Actions act=new Actions(driver);
      act.moveToElement(ele).perform();
      driver.findElementByXPath("//a[text()='Search for Invoice']").click();
      driver.findElementByXPath("//input[@id='vendorTaxID']").sendKeys("RO094782");
      driver.findElementByXPath("//button[@id='buttonSearch']").click();
      
      List<WebElement> tablerows = driver.findElementsByXPath("//table[@class='table']//tr");
      int size = tablerows.size();
      
      for (int i = 2; i < size; i++) {
    	  String text = driver.findElementByXPath("//table[@class='table']//tr["+i+"]/td[3]").getText();  
    	  if(text.equals("IT Support"))
    			  {
    		  String ele2 = driver.findElementByXPath("//table[@class='table']//tr["+i+"]/td[1]").getText();
    		  System.out.println(ele2);
    	  }
	
	}
      
      
		/*
		 * WebElement ele1 =
		 * driver.findElementByXPath("(//td[text()='IT Support'])[1]//preceding::td[2]"
		 * ); String text = ele1.getText(); System.out.println(text);
		 */
      
      
     driver.findElementByXPath("//a[text()='Log Out']").click();
		Thread.sleep(3000);
		
      
      driver.close();

	}

}
