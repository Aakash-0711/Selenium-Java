package Week2.day2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.leaftaps.bse.Projectspecificmethods;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Week5.day2.Exceldata;

public class DeleteLead extends Projectspecificmethods{
	
	@DataProvider(name="Fetchdata2")
	public String[][] senddata2() throws IOException {
		Exceldata data2=new Exceldata();
		String[][] readdeletedata = data2.readdeletedata("createlead");
		return readdeletedata;
	}
@Test(dataProvider = "Fetchdata2")
	public void rundelete(String Phonenum) throws InterruptedException {
		//login();
		  driver.findElementByXPath("//a[text()='Leads']").click();
		  driver.findElementByLinkText("Find Leads").click();
		  driver.findElementByXPath("//span[text()='Phone']").click();
		  driver.findElementByName("phoneNumber").sendKeys(Phonenum);
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  
		/*
		 * List<WebElement> li = driver.
		 * findElementsByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]"
		 * ); int s = li.size(); for (WebElement web : li) {
		 * 
		 * web.getText(); System.out.println(s);
		 * 
		 * }
		 */
		
		  WebElement ele = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]"); 
		  String text =ele.getText(); 
		  System.out.println(text);
		  Thread.sleep(3000);
		  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		 driver.findElementByXPath("(//div[@class='frameSectionExtra']//a)[4]").click(); 
		  //driver.findElementByName("subMenuButtonDangerous").click();
		  driver.findElementByLinkText("Find Leads").click();
		  driver.findElementByName("id").sendKeys(text);
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		  WebElement ele1 =driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]");
		  String text2 = ele1.getText(); 
		  if(text2.contains("No records")) {
		  System.out.println("not verified"); 
		  }else 
		  { System.out.println("verified"); 
		  }
		 
		 // closebrowser();

	}

}
