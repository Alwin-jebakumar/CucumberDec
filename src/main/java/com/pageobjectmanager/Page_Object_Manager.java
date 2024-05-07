package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.Login_Page;

public class Page_Object_Manager {
	
	/*
	 * Single ton Design Pattern
	 * 
	 * 			1. All Element should be private 
	 * 			2. create instance method for each element
	 * 
	 */
	
	WebDriver driver;
	
	Login_Page lp;
	
	public Login_Page getInstanceLP() {
		
		if(lp == null) {
		
			lp = new Login_Page(driver);
		
		}
		
		return lp;
		
	}
	
	public Page_Object_Manager(WebDriver abc) {

		driver = abc;
	
	}
	

}
