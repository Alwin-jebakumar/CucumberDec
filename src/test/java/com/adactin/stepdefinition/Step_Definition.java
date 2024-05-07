package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Test_Runner;

import com.baseclass.BaseClass;
import com.helper.Data_Reader;
import com.helper.Data_Reader_Manager;
import com.pageobjectmanager.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass{
	
	static WebDriver driver = Test_Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Before
	public void before_Hooks(Scenario s) {

		String name = s.getName();
		
		System.out.println(name+" is Starting");
		
	}
	
	@After
	public void after_Hooks(Scenario s) {

		String name = s.getName();
		
		String status = s.getStatus();
		
		System.out.println(name+" is "+status);
		
	}
	
	@Given("^user Launch The Url$")
	public void user_Launch_The_Url() throws Throwable {
		
		String url = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropUrl();
	    
		url_Launch(url);
		
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	    
		input_Value_On_Element(pom.getInstanceLP().getUser(),
				Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropUsername());
		
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	    
		input_Value_On_Element(pom.getInstanceLP().getPass(), 
				Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropPassword());
		
	}

	@Then("^user Click On The Login Button And It Navigate To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
	    
		click_On_Element(pom.getInstanceLP().getLoginButton());
		
	}

}
