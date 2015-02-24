package com.atmecs.service;

import static org.testng.Assert.assertEquals;

import java.io.StringReader;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWS {

	public static void main(String[] args) {

		String applicationContext = "src\\main\\java\\com\\atmecs\\service\\applicationContext.xml";

		ApplicationContext context = new FileSystemXmlApplicationContext(
				applicationContext);
		WebServiceTemplate wsTemp = (WebServiceTemplate) context
				.getBean("currencyTemplate");

		String MESSAGE = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.webserviceX.NET/\"><soapenv:Header/><soapenv:Body><web:ConversionRate><web:FromCurrency>USD</web:FromCurrency><web:ToCurrency>INR</web:ToCurrency></web:ConversionRate></soapenv:Body></soapenv:Envelope>";
		StreamSource source = new StreamSource(new StringReader(MESSAGE));
		StreamResult result = new StreamResult(System.out);
		wsTemp.sendSourceAndReceiveToResult("http://www.webservicex.com/CurrencyConvertor.asmx",source, new WebServiceMessageCallback() {

	        public void doWithMessage(WebServiceMessage message) {
	            ((SoapMessage)message).setSoapAction("http://www.webserviceX.NET/ConversionRate");
	        }
	    }, result);
	}
}
