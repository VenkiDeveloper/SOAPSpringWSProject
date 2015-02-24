package com.atmecs.soap.test;

import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.TransformerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;

import com.atmecs.soap.services.ConversionRate;
import com.atmecs.soap.services.ConversionRateResponse;
import com.atmecs.soap.services.Currency;

public class TestCurrencyConverterWService {

	@Autowired
	private static WebServiceTemplate larsFeeTemplate;

	public static void main(String[] args) throws IOException {

		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"src\\main\\resources\\applicationContext.xml");

		WebServiceTemplate currencyTemplate = (WebServiceTemplate) applicationContext
				.getBean("currencyTemplate");

		ConversionRate serviceRequest = new com.atmecs.soap.services.ObjectFactory()
				.createConversionRate();
		serviceRequest.setFromCurrency(Currency.USD);
		serviceRequest.setToCurrency(Currency.INR);

		ConversionRateResponse responseObject = (ConversionRateResponse) currencyTemplate
				.marshalSendAndReceive(serviceRequest);
		/*
		 * new WebServiceMessageCallback() {
		 * 
		 * public void doWithMessage(WebServiceMessage message) throws
		 * IOException, TransformerException { ((SoapMessage) message)
		 * .setSoapAction("http://www.webserviceX.NET/ConversionRate");
		 * 
		 * } }
		 */

		/*
		 * 
		 * <soap:Header> 
		 * <credentials xmlns="http://example.com/auth">
		 * <username>username</username> 
		 * <password>password</password>
		 * </credentials> 
		 * </soap:Header>
		 * webServiceTemplate.marshalSendAndReceive(o, new
		 * WebServiceMessageCallback() {
		 * 
		 * public void doWithMessage(WebServiceMessage message) { try {
		 * SoapMessage soapMessage = (SoapMessage)message; SoapHeader header =
		 * soapMessage.getSoapHeader(); StringSource headerSource = new
		 * StringSource("<credentials xmlns=\"http://example.com/auth\">\n +
		 * <username>"+username+"</username>\n +
		 * <password>"+password"+</password>\n + </credentials>"); Transformer
		 * transformer = TransformerFactory.newInstance().newTransformer();
		 * transformer.transform(headerSource, header.getResult()); } catch
		 * (Exception e) { // exception handling } } });
		 */
		System.out.println(responseObject.getConversionRateResult());

	}

}
