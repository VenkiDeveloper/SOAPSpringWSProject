package com.xml.tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xml.page.DriverClass;

public class TestPage {

	
	String browserName;
	WebDriver driver;

	public TestPage(String browserName) {
       this.browserName = browserName;
	}

	@BeforeMethod
	public void open() {
		System.out.println("------" + TestSample.browser
				+ "--------BeforeMethod---------------------");
		driver = DriverClass.getDriver(TestSample.browser);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@Test
	public void testLogo() {
		System.out.println("--------TestPage---Opening----");
		assertTrue(driver.getTitle().equals("Google"));
		System.out.println("--------TestPage---Closing----");
	}

	@AfterMethod
	public void close() {
		System.out.println("------" + browserName
				+ "--------AfterMethod-----------------------");
		driver.close();

	}

}
