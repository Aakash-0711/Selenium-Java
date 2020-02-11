package org.testleaf.testcases;

import java.io.IOException;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.FindLeadPage;
import org.testleaf.pages.LoginPage;
import org.testleaf.utils.ReadExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC004_DeleteLead extends ProjectSpecificMethods {
	@DataProvider(name="fetchdata")
	 public String[][] sendData() throws IOException{
		ReadExcel data = new ReadExcel();
		String[][] exdata = data.readExcelData("TestLeaf", "DL");
		//String[][] data = new String[2][3];
		
		return exdata;
						
		
	}

	@Test(dataProvider="fetchdata")
	public void deleteLead(String username, String password, String phoneNumber) throws InterruptedException {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRM()
		.clickLead()
	    .clickFindLead()	    
	    .clickPhone()
	    .enterPhoneNumber(phoneNumber)
	    .clickFindLeads()
	    .getLeadID()
	    .clickLeadID()
	    .clickDelete()
	    .clickFindLead()
	    .enterLeadID()
		 .clickFindLeads()
		 .verifyLeadID();
	    
		
	}

	
	
}
