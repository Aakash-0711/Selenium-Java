package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

import cucumber.api.java.en.Given;

public class LoginPage extends SeleniumBase {
	
	@Given("Enter the username as (.*)")
	public LoginPage enterUsername(String username) {
		clearAndType(locateElement("xpath", "//input[@id='email']"), username);
		return this;
	}

	@Given("Enter the Password as (.*)")
	public LoginPage enterPassword(String password) {
		clearAndType(locateElement("xpath", "//input[@id='password']"), password);
		return this;
	}

	@Given("Click on the Login")
	public HomePage clickLogin() {
		click(locateElement("id","buttonLogin"));
		return new HomePage();
	}
}
