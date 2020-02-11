package Week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebooktestcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@name='email']").sendKeys("aakshnair21@gmail.com",Keys.TAB);
		driver.findElementByXPath("//input[@name='pass']").sendKeys("aakash123");
		driver.findElementById("u_0_b").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@role='combobox']").sendKeys("TestLeaf solutions",Keys.ENTER);
		driver.findElementByXPath("//div[@class='_6v_0 _4ik4 _4ik5']//a[text()='TestLeaf']").click();
		String s="Like";
		if(s.equalsIgnoreCase("Like"))
		{
			System.out.println("Like");
		}
		else
		{
			System.out.println("Liked");
		}
		
		driver.findElementByXPath("//button[@class='likeButton _4jy0 _4jy4 _517h _51sy _42ft']").click();
		Thread.sleep(3000);
		driver.close();

	}

}
