package com.adactin.loginstep;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Login_Runner;

import com.baseclass.BaseClass;

import com.pageobjectmanager.Page_Object_Manager;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

public class Login_Step extends BaseClass{
	
	static WebDriver driver = Login_Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launch The Url$")
	public void user_Launch_The_Url() throws Throwable {
	    
		url_Launch("https://adactinhotelapp.com/");
		
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	    
		input_Value_On_Element(pom.getInstanceLP().getUser(), username);
		
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	    
		input_Value_On_Element(pom.getInstanceLP().getPass(), password);
		
	}

	@Then("^user Click On The Login Button And Validate The \"([^\"]*)\"$")
	public void user_Click_On_The_Login_Button_And_Validate_The(String url) throws Throwable {
	    
		click_On_Element(pom.getInstanceLP().getLoginButton());

		assertEquals(url, driver.getCurrentUrl());
		
	}

}
