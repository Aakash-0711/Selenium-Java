package Week4.day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.leaftaps.bse.Projectspecificmethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Week5.day2.Exceldata;

public class Mergetestleaf extends Projectspecificmethods {
	
	@DataProvider(name="Mergedata")
	public String[][] data1() throws IOException
	{
		Exceldata data = new Exceldata();
		String[][] merge = data.Merge("createlead");
		return merge;
	}
@Test(dataProvider = "Mergedata")
	public void runmerge(String Fromlead, String Tolead) throws InterruptedException {
		
		  driver.findElementByXPath("//a[text()='Leads']").click();
		  driver.findElementByXPath("//a[text()='Merge Leads']").click();
		  driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		  Set<String> windowHandles = driver.getWindowHandles();
		  List<String> al = new ArrayList<String>(windowHandles);
		  String str = al.get(1);
		  driver.switchTo().window(str);
		  //driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		  driver.findElementByXPath("//input[@name='id']").sendKeys(Fromlead);
		 driver.findElementByXPath("//button[text()='Find Leads']").click();
		 WebElement ele1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]");
		 String text2 = ele1.getText();
		 System.out.println(text2);
		  Thread.sleep(3000);
		  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		  driver.switchTo().window(al.get(0));
		  Thread.sleep(3000);
		  driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		  Set<String> windowHandles2 = driver.getWindowHandles();
		  List<String> al1 = new ArrayList<String>(windowHandles2);
		  String str1 = al1.get(1);
		  driver.switchTo().window(str1);
		  
		  driver.findElementByXPath("//input[@name='id']").sendKeys(Tolead);
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  
		  Thread.sleep(3000);
		  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		 
		
		  driver.switchTo().window(al1.get(0));
		  driver.findElementByXPath("//a[text()='Merge']").click();
		  driver.switchTo().alert().accept();
		  driver.findElementByXPath("//a[text()='Find Leads']").click();
		  driver.findElementByXPath("//input[@name='id']").sendKeys(text2);
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  WebElement ele = driver.findElementByXPath("//div[text()='No records to display']");
		  String text = ele.getText();
		  {
			  if(text.contains("No records to display"))
			  {
				  System.out.println("Verified");
			  }
			  else
			  {
				  System.out.println("Not verified");
			  }
		  }
		  
		  //Thread.sleep(3000);
		  driver.quit();
		  //driver.close();

	}

}
