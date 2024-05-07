package com.demo;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertNull;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin_Demo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.id("username"));
		
		user.sendKeys("jeyarajalwin");
		
		String value = user.getAttribute("value");
		
		System.out.println(value);
		
		assertNotNull(value);
		
		WebElement pass = driver.findElement(By.id("password"));
		
		pass.sendKeys("3VN6C5");
		
		WebElement loginButton = driver.findElement(By.id("login"));
		
		assertTrue(loginButton.isDisplayed());
		
		loginButton.click();
		
		String expectedUrl = "https://adactinhotelapp.com/SearchHotel.php";
		
		String actualUrl = driver.getCurrentUrl();
		
		assertEquals(expectedUrl, actualUrl);
		
		
	}

}
