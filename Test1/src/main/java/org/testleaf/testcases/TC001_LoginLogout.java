package org.testleaf.testcases;

import java.io.IOException;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testleaf.utils.ReadExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods {
	@DataProvider(name="fetchdata")
	 public String[][] sendData() throws IOException{
		ReadExcel data = new ReadExcel();
		String[][] exdata = data.readExcelData("TestLeaf", "Login");
		//String[][] data = new String[2][3];		
		return exdata;								
	}

	@Test(dataProvider="fetchdata")
	public void loginLogout(String username, String password) {
		
		/*LoginPage obj = new LoginPage();
		obj.enterUserName();
		obj.enterPassword();
		obj.clickLogin();*/
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}
	
	
}
