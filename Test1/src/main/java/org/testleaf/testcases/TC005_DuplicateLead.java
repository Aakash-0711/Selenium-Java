package org.testleaf.testcases;

import java.io.IOException;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.FindLeadPage;
import org.testleaf.pages.LoginPage;
import org.testleaf.utils.ReadExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC005_DuplicateLead extends ProjectSpecificMethods {
	@DataProvider(name="fetchdata")
	 public String[][] sendData() throws IOException{
		ReadExcel data = new ReadExcel();
		String[][] exdata = data.readExcelData("TestLeaf", "DPL");
		//String[][] data = new String[2][3];
		
		return exdata;
						
		
	}

	@Test(dataProvider="fetchdata")
	public void deleteLead(String username, String password, String email) throws InterruptedException {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRM()
		.clickLead()
	    .clickFindLead()	    
	    .clickEmail()
	    .enterEmail(email)	   
	    .clickFindLeads()
	    .getFirstLeadName()
	    .clickLeadID();
	//   .clickDuplicate()
	 //  .verifyDuplicateLead()
	//   .clickCreateLead()
	 //  .verifyFirstNamedpl();
	    
		
	}

	
	
}
