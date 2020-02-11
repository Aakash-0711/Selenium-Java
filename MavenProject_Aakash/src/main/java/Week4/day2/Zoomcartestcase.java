package Week4.day2;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Zoomcartestcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();
		driver.findElementByXPath("//div[text()='Popular Pick-up points'] /following-sibling::div").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("dd");
		String today = df.format(date);
		int tomorrow = Integer.parseInt(today) + 1;
		System.out.println(tomorrow);

		driver.findElementByXPath("//div[contains(text(),'" + tomorrow + "')]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		WebElement ele = driver.findElementByXPath("//div[contains(text(),'" + tomorrow + "')]");
		System.out.println(ele.getText());
		driver.findElementByXPath("//button[text()='Done']").click();
		List<WebElement> li = driver.findElementsByXPath("//div[@class='price']");
		System.out.println(li.size());
		int count = 0;
		for (WebElement price : li) {
			String string = price.getText().replaceAll("\\D", "");
			if (count < Integer.parseInt(string)) {
				count = Integer.parseInt(string);
			}
		}
		System.out.println(count);
		
		String max = NumberFormat.getNumberInstance(Locale.US).format(count);
		System.out.println(max);
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//div[contains(text(),'"+ max + "')]/following-sibling::button").click();

		driver.close();

	}

}
