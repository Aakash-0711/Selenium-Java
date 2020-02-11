package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
        WebElement ele = driver.findElementByXPath("//li[text()='Item 1']");
        WebElement ele2 = driver.findElementByXPath("//li[text()='Item 4']");
        int y = ele2.getLocation().getY();
        Actions br=new Actions(driver);
        br.dragAndDropBy(ele, 0, y).perform();
	}

}
