package org.testleaf.testcases;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods {
	
	

	@BeforeTest
	public void setData() {
		excelFileName ="createlead";
		//excelFileName="Editdata";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogout(String username, String password , String Companyname, String Firstname, String Lastname) {
		
		/*LoginPage obj = new LoginPage();
		obj.enterUserName();
		obj.enterPassword();
		obj.clickLogin();*/
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickcrmsfa()
		.clickleadspage().clickcreatelead().entercompanyname(Companyname).enterfirstname(Firstname).enterlastname(Lastname).clickcreateleadbutton().viewpage();
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}
	
	
}
