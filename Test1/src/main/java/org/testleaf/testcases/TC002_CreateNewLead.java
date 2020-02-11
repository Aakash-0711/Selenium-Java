package org.testleaf.testcases;

import java.io.IOException;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testleaf.utils.ReadExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC002_CreateNewLead extends ProjectSpecificMethods {
	@DataProvider(name="fetchdata")
	 public String[][] sendData() throws IOException{
		ReadExcel data = new ReadExcel();
		String[][] exdata = data.readExcelData("TestLeaf", "CL");
		//String[][] data = new String[2][3];
		
		return exdata;
						
		
	}

	@Test(dataProvider="fetchdata")
	public void createLead(String username, String password, String companyName,String firstName, String lastName) {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRM()
		.clickLead()
	    .clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadSubmit()
		.verifyFirstName();
			
		
	}
	
	
}
