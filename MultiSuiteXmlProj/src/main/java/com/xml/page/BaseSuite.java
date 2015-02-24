package com.xml.page;

import java.util.Arrays;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.xml.tests.TestPage;

public class BaseSuite {

	public static void runTestNGXml(String xmlFile,String browserName) {
		TestNG testNG = new TestNG();
		testNG.setPreserveOrder(true);
		XmlSuite suite = new XmlSuite();
		suite.setName("BrowserSuite");
		suite.setSuiteFiles(Arrays.asList(xmlFile));
		testNG.setXmlSuites(Arrays.asList(suite));
		testNG.run();
		
	}

}
