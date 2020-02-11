package Week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandFrameinselenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://tinyurl.com/SeleniumAlert");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement frame1 = driver.findElementByXPath("//iframe[@id='iframeResult']");
        driver.switchTo().frame(frame1);
        driver.findElementByXPath("//button[text()='Try it']").click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Aakash");
        Thread.sleep(3000);
        alert.accept();
        String text = driver.findElementById("demo").getText();
        System.out.println(text);
        driver.close();
	}

}
