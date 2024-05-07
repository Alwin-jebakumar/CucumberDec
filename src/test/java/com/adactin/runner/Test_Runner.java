package com.adactin.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.feature", 
				glue = "com.adactin.stepdefinition", 
				monochrome = false, 
				dryRun = false, 
				strict = true, 
				tags = "@Jersily", 
				plugin = {"html:HtmlReport", 
							"pretty", 
							"json:JsonReport/Adactin.json", 
							"com.cucumber.listener.ExtentCucumberFormatter:Extentreport/Adactin.html"})


public class Test_Runner extends BaseClass{
	
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
