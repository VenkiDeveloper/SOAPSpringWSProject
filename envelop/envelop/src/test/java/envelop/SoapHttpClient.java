package envelop;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class SoapHttpClient {
	public static void main(String[] args) throws Exception {

		String webServiceURL = "http://www.webservicex.com/CurrencyConvertor.asmx";
		HttpClient client = new HttpClient();

		// Read the SOAP request from the file
		StringBuffer requestFileContents = new StringBuffer();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				"src\\test\\java\\envelop\\env.xml"));
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			requestFileContents.append(line);
		}
		PostMethod post = new PostMethod(webServiceURL);
		RequestEntity entity = new StringRequestEntity(
				requestFileContents.toString(), "text/xml", "utf-8");
		post.setRequestEntity(entity);
		int result = client.executeMethod(post); 
		String response = post.getResponseBodyAsString(); 
		System.out.println("Response \n"+response);
		
		
		//using GETMEthod
		/*
		 * 
		 * 
		 * 
		 * HttpClient client = new HttpClient();
        HttpMethod method = new GetMethod("http://www.kodejava.org");
 
        try {
            client.executeMethod(method);
 
            if (method.getStatusCode() == HttpStatus.SC_OK) {
                String response = method.getResponseBodyAsString();
                System.out.println("Response = " + response);
		 * 
		 * String uri = "http://www.webservicex.com/CurrencyConvertor.asmx/ConversionRate?FromCurrency=USD&&ToCurrency=INR";
		HttpClient httpClient = new HttpClient();
		GetMethod method = new GetMethod(uri);
		int httpResponse = httpClient.executeMethod(method);
		
		
		System.out.print(method.getResponseBodyAsString());*/
	}
}
