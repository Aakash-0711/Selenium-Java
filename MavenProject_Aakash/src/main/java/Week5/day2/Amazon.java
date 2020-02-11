package Week5.day2;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testleaf.leaftaps.bse.Amazonspecific;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class Amazon extends Amazonspecific {
	
	@DataProvider(name="amaz")
	
	public String[][] amazdata() throws IOException
	{
		Amazonexcel excel=new Amazonexcel();
		String[][] amazon = excel.Amazon("Amazon");
		return amazon;
	}
	
	
	
	@Test(dataProvider = "amaz")

	public  void runamazon(String Search) throws InterruptedException {
		
		driver.findElementByXPath("//div[@class='nav-search-field ']//input[1]").sendKeys(Search,Keys.ENTER);
		List<WebElement> list = driver.findElementsByXPath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']");
		int size = list.size();
		System.out.println("total count: " + size);
		
		List<WebElement> li = driver.findElementsByXPath("//span[@class='a-price-whole']");
		int size2 = li.size();
		
		
		int count=0;
		for (WebElement price : li) {
			
			String text = price.getText().replaceAll("\\D", "");
			if(count < Integer.parseInt(text))
			{
				count=Integer.parseInt(text);
			}
		}
		//System.out.println(count);
		String max = NumberFormat.getNumberInstance(Locale.US).format(count);
		System.out.println("Max price: " + max);
		
		List<WebElement> li2 = driver.findElementsByXPath("(//span[@class='a-price a-text-price'])/following::span[2]");
		int size3 = li2.size();
		
		for (WebElement minprice : li2) {
			String text2 = minprice.getText().replaceAll("\\D", "");
			//if(text2.
			System.out.println(text2);
		}
		
		
		
		

	}

}
