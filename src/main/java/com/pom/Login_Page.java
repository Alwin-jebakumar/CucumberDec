package com.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	private WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement user;
	
//	WebElement pass = driver.findElement(By.id("password"));
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(id = "login")
	private WebElement loginButton;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public Login_Page(WebDriver abc) {
		
		driver = abc;
		
		PageFactory.initElements(driver, this);
		
	}
	
}
