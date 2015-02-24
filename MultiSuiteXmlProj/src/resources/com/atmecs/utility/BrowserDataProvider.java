package com.atmecs.utility;

import org.testng.annotations.DataProvider;

public class BrowserDataProvider {
	
	@DataProvider(name="getBrowserData")
	public static Object[][] getInfo() {
		return new Object[][] { { "firefox" }, { "chrome" } ,{"ie"}};
	}
	
		
}
