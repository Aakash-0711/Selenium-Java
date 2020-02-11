package Week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.asm.Advice.Enter;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		/*
		 * Alert alert = driver.switchTo().alert(); alert.dismiss();
		 */
		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses",Keys.ENTER);
		List<WebElement> li = driver.findElementsByXPath("//h3[@class='product-brand']");
		int count = li.size();
		System.out.println(count);
		Set<String> set = new HashSet<String>();
		
		for (WebElement web : li) {
			
			String s = web.getText();
			System.out.println(s);
		}
		
		driver.close();
		
		}
		
		

	}


