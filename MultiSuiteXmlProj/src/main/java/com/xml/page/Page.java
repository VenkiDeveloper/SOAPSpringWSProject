package com.xml.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

	static WebDriver driver;
	
	public Page(WebDriver driver){
		
		this.driver = driver;
	}
	
	
	public static String getLogo(){
	
		//return driver.findElement(By.cssSelector("#hplogo")).getAttribute("title");
		return driver.getTitle();
	}
}
