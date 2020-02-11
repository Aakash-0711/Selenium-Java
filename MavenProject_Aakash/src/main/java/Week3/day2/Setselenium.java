package Week3.day2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setselenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/sorttable.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> li = driver.findElementsByXPath("//table[@id='table_id']//tr/td[@class='sorting_1']");
        int size2 = li.size();
        System.out.println(size2);
        Set<String> empid = new HashSet<String>();
        for (WebElement emp : li) {
        	
        	String text = emp.getText();
        	empid.add(text);
        	
        	
        }
        System.out.println(empid);
        int size = empid.size();
        
        if(size==size2)
        {
        	System.out.println("No duplicate");
        }else
        {
        	System.out.println("Duplicate");
        }
      
        
        
        
        driver.close();
        

	}

}
