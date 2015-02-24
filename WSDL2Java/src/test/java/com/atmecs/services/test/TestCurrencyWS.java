package com.atmecs.services.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.services.ConversionRate;
import com.atmecs.services.ConversionRateResponse;
import com.atmecs.services.Currency;

import static org.testng.Assert.*;
public class TestCurrencyWS {
	ApplicationContext context;
	WebServiceTemplate wsTemp;
	ConversionRate request;
	public static final String APPLICATION_CONTEXT="src\\main\\resources\\applicationContext.xml";

	@BeforeClass
	public void setUp(){
		context = new FileSystemXmlApplicationContext(APPLICATION_CONTEXT);
		 wsTemp = (WebServiceTemplate) context.getBean("currencyTemplate");
	}
	
	@BeforeMethod
	public void open(){
		request = new ConversionRate();
	}
	
	@Test
	public void testCurrencyRate(){
		
		request.setFromCurrency(Currency.USD);
		request.setToCurrency(Currency.INR);
		
		ConversionRateResponse response = (ConversionRateResponse) wsTemp.marshalSendAndReceive(request);
		assertEquals(response.getConversionRateResult(),62.215);
		
	}
	@AfterMethod
	public void close(){
		
		request=null;
	}
	

}
