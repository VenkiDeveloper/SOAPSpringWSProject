package com.atmecs.soap.services;

import java.io.IOException;

import javax.wsdl.extensions.soap12.SOAP12Operation;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

import org.apache.http.protocol.RequestContent;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

public class Sample{
	
	
	
	
	/* implements WebServiceMessageCallback {

	public void doWithMessage(WebServiceMessage message) throws IOException,
			TransformerException {
		String username="";
		String password="";
	
            try {
                SoapMessage soapMessage = (SoapMessage)message;
                SoapHeader header = soapMessage.getSoapHeader();
                StringSource headerSource = new StringSource("<credentials xmlns=\"http://example.com/auth\">\n <username>"+username+"</username>\n<password>"+password+"</password></credentials>");
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.transform(headerSource, header.getResult());
            } catch (Exception e) {}
        }
    */
	
}

