package envelop;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class SoapRequestService {

	public static String getCurrencyValue(String input1, String input2)
			throws Exception {
		final String SOAP_REQUEST = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.webserviceX.NET/\">"
				+ "<soapenv:Header/>"
				+ "<soapenv:Body>"
				+ "<web:ConversionRate>"
				+ "<web:FromCurrency>"
				+ input1
				+ "</web:FromCurrency>"
				+ "<web:ToCurrency>"
				+ input2
				+ "</web:ToCurrency>"
				+ "</web:ConversionRate>"
				+ "</soapenv:Body>" + "</soapenv:Envelope>";
		String responseString = "";
		String outputString = "";
		String wsURL = "http://www.webservicex.com/CurrencyConvertor.asmx?wsdl";
		URL url = new URL(wsURL);
		URLConnection connection = url.openConnection();
		HttpURLConnection httpConn = (HttpURLConnection) connection;
		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		byte[] buffer = new byte[SOAP_REQUEST.length()];
		buffer = SOAP_REQUEST.getBytes();
		bout.write(buffer);
		byte[] b = bout.toByteArray();
		httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
		httpConn.setDoOutput(true);
		OutputStream out = httpConn.getOutputStream();
		out.write(b);
		out.close();

		InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
		BufferedReader in = new BufferedReader(isr);
		while ((responseString = in.readLine()) != null) {
			outputString = outputString + responseString;
		}
		System.out.println("output \n" + outputString);
		Document document = parseXmlFile(outputString);
		NodeList nodeLst = document
				.getElementsByTagName("ConversionRateResult");
		String conversionRateResult = nodeLst.item(0).getTextContent();

		return conversionRateResult;

	}

	private static Document parseXmlFile(String outputString) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(outputString));
		return db.parse(is);
	}

}
