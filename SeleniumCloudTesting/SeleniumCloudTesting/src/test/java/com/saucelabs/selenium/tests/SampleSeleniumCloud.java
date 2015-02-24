package com.saucelabs.selenium.tests;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class SampleSeleniumCloud {

	
	private WebDriver driver;
	@Parameters({"username","key","os","browser","browserVersion"})
	@BeforeMethod
	public void createDriver(@Optional("Venki243") String userName,@Optional("ec89104a-307c-4e96-8201-5ae6accafef6") String key,@Optional("Windows") String os,
			@Optional("firefox") String browser,@Optional("28.0") String browserVersion,Method method){
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(browser);
		capabilities.setCapability("version",browserVersion);
		capabilities.setCapability(CapabilityType.PLATFORM,Platform.WINDOWS);
		capabilities.setCapability("name", method.getName());
		
		try {
			this.driver = new RemoteWebDriver(new URL("http://"+userName+":"+key+"@ondemand.saucelabs.com:80/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGoogle(){
		driver.get("http://www.google.com");
		assertEquals("Google", driver.getTitle());
	}
	
	@AfterMethod
	public void closeDriver(){
		
		driver.quit();
		
	}
}
