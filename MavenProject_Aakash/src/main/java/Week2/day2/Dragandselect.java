package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragandselect {

	public static void main(String[] args) {
         
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement element1 = driver.findElementByXPath("//li[text()='Item 4']");
          Actions br=new Actions(driver);
          br.clickAndHold(element).clickAndHold(element1).release().perform();

	}

}
