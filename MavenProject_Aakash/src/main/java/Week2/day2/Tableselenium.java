package Week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableselenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("Namakkal",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		//Thread.sleep(3000);
		
		//driver.findElementById("buttonFromTo").click();
		List<WebElement> li = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]");
		System.out.println(li.size());
		
		for (WebElement web : li) {
		
		String s= web.getText();
		System.out.println(s);
			
			  if(s.equals("PALAKKAD EXP")) { 
				  
				//  driver.findElementByXPath("") }
			 
		
		}
		}
	}

	}
