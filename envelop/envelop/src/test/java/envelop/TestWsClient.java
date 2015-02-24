package envelop;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

public class TestWsClient {
	public static void main(String[] args) {

		try {
			// Create SOAP Connection
			SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
			SOAPConnection connection = factory.createConnection();

			// Send SOAP Message to SOAP Server
			String url = "http://www.webservicex.net/CurrencyConvertor.asmx?wsdl";
			SOAPMessage message = connection.call(createSoapRequest(), url);

			// Process the SOAP Response
			printSOAPResponse(message);

			connection.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	private static SOAPMessage createSoapRequest() throws Exception {

		MessageFactory mfactory = MessageFactory.newInstance();
		SOAPMessage message = mfactory.createMessage();
		SOAPPart part = message.getSOAPPart();
		String serviceURI = "http://www.webserviceX.NET/";

		// SOAP Envelope
		SOAPEnvelope envelope = part.getEnvelope();
		envelope.addNamespaceDeclaration("web", serviceURI);

		// SOAP Body
		SOAPBody body = envelope.getBody();
		SOAPElement element1 = body
				.addChildElement("ConversionRate", "web");
		SOAPElement bodyElement = body.addChildElement("FromCurrency", "web");
		bodyElement.addTextNode("INR");
		SOAPElement bodyElement2 = body.addChildElement("ToCurrency", "web");
		bodyElement2.addTextNode("USD");

		MimeHeaders headers = message.getMimeHeaders();
		headers.addHeader("SOAPAction", serviceURI + "ConversionRate");
		message.saveChanges();

		// print the request message
		System.out.print("Request SOAP Message = ");
		message.writeTo(System.out);
		System.out.println();
		return message;
	}

	/**
	 * Method used to print the SOAP Response
	 */
	private static void printSOAPResponse(SOAPMessage message) throws Exception {

		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		Source source = message.getSOAPPart().getContent();
		System.out.print("\nResponse SOAP Message = ");
		StreamResult result = new StreamResult(System.out);
		transformer.transform(source, result);
	}
}
