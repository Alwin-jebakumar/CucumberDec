package com.adactin.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/com/adactin/feature/Login.feature", 
				glue = "com.adactin.loginstep")

public class Login_Runner extends BaseClass{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {

		driver = browser_Launch("chrome");
		
	}
	
	@AfterClass
	public static void tear_Down() {

		close_The_Browser();
		
	}
	
	

}
