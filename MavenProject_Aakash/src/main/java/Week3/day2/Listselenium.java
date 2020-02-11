package Week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/sorttable.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> li = driver.findElementsByXPath("//table[@id='table_id']//tr/td[3]");
        int size = li.size();
        System.out.println(size);
       
       for (WebElement ele : li) {
	 
	 String text = ele.getText();
	 System.out.println(text);
	 
	
}
 List<String> list = new ArrayList<String>(); 
 
 

        

	}

}
