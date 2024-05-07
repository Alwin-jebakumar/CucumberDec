package com.demo;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

public class Demo {
	
	@BeforeClass
	public static void browser_Launch() {

		System.out.println("Browser Open");
		
	}
	
	@AfterClass
	public static void browser_Close() {
		
		System.out.println("Browser Close");

	}
	
	@Before
	public void url_Launch() {

		System.out.println("Url Launch");
		
		
	}
	
	@After
	public void logout() {

		System.out.println("Logout After");
		
	}
	
	@Test
	public void login_Test() {

		System.out.println("Login in Test");
		
	}
	
	@Test
	public void adactin_Test() {

		System.out.println("adactin Test");
		
	}
	
	@Test
	public void facebook_Test() {

		System.out.println("facebook Test");
		
	}
	
	
}
