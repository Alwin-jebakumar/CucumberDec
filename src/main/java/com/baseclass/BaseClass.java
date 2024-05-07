package com.baseclass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver;
	
	public static WebDriver browser_Launch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		
		return driver;

	}

	public static void url_Launch(String url) {

		driver.get(url);

	}

	public static void input_Value_On_Element(WebElement element, String value) {

		element.sendKeys(value);

	}
	
	public static void click_On_Element(WebElement element) {

		element.click();

	}
	
	public static void close_The_Browser() {

		driver.quit();
		
	}
	
	public static String title_Of_The_Window() {

		String title = driver.getTitle();
		
		return title;
		
	}
	

}
