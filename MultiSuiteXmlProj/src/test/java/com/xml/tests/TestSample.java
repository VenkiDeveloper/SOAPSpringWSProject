package com.xml.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.xml.page.BaseSuite;

public class TestSample {
	String browserName;
	String xmlFile = "src/resources/testNG.xml";
	TestPage tp;
	static String browser;

	@Factory(dataProvider = "dataMethod")
	public TestSample(String browserName) {
		this.browserName = browserName;
	}

	@DataProvider
	public static Object[][] dataMethod() {
		return new Object[][] { { "ie" }, { "chrome" } ,{"firefox"}};
	}

	@Test
	public void runSampleTest() {
		browser =browserName;
		System.out.println("--------TestSample---Opening----"+browser);
		if (browserName.equals("ie")) {
			
			BaseSuite.runTestNGXml(xmlFile,browserName);

		} else if (browserName.equals("chrome")) {
		
			BaseSuite.runTestNGXml(xmlFile,browserName);
		} else if (browserName.equals("firefox")) {
		
			BaseSuite.runTestNGXml(xmlFile,browserName);
		}

		System.out.println("--------TestSample---Closing----");
	}

}
