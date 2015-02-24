package com.xml.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverClass {
	static WebDriver driver;

	public static WebDriver getDriver(String browserName) {

		if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"src/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("IE is Opened");
			return driver;
		} else if (browserName.equals("chrome")) {
			;
			System.setProperty("webdriver.chrome.driver",
					"src/resources/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome is Opened");
			return driver;
		} else if (browserName.equals("firefox")) {

			driver = new FirefoxDriver();
			System.out.println("FF is Opened");
			return driver;
		}
		return null;
	}

}
