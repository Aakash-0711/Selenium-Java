package org.testleaf.testcases;

import java.io.IOException;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.FindLeadPage;
import org.testleaf.pages.LoginPage;
import org.testleaf.utils.ReadExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC003_EditLead extends ProjectSpecificMethods {
	@DataProvider(name="fetchdata")
	 public String[][] sendData() throws IOException{
		ReadExcel data = new ReadExcel();
		String[][] exdata = data.readExcelData("TestLeaf", "EL");
		//String[][] data = new String[2][3];
		
		return exdata;
						
		
	}

	@Test(dataProvider="fetchdata")
	public void createLead(String username, String password, String companyName,String firstName, String lastName, String UpdatedCompanyName) throws InterruptedException {
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRM()
		.clickLead()
	    .clickFindLead()	    
	   // .enterFirstName(firstName)
	    //.enterLastName(lastName)
	    .enterCompanyName(companyName)
	    .clickFindLeads()
	    //.enterFirstName(firstName)
	    .clickLeadID()
	    .clickEdit()
	    .clearCompanyName()
	    .enterCompanyName(UpdatedCompanyName)
	    .clickUpdate()
	    .verifyCompanyName(UpdatedCompanyName);
			
		
	}

	
	
}
