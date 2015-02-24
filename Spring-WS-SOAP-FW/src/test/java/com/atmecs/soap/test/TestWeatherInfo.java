package com.atmecs.soap.test;

import java.time.temporal.WeekFields;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.weatherinfo.soap.services.ArrayOfWeatherDescription;
import com.weatherinfo.soap.services.GetWeatherInformation;
import com.weatherinfo.soap.services.GetWeatherInformationResponse;
import com.weatherinfo.soap.services.WeatherDescription;

public class TestWeatherInfo {
	public static void main(String[] args) {

		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src\\main\\resources\\weatherInfo.xml");
		WebServiceTemplate webServiceTemplate = (WebServiceTemplate) ctx.getBean("wInfoTemplate");
		GetWeatherInformation request = new GetWeatherInformation();
	    
		GetWeatherInformationResponse response =  (GetWeatherInformationResponse) webServiceTemplate.marshalSendAndReceive(request);
		
		ArrayOfWeatherDescription desc = response.getGetWeatherInformationResult();
		
		List<WeatherDescription> wdesc = desc.getWeatherDescription();
		
		for(WeatherDescription wd: wdesc){
			
			System.out.println("WeatherID----"+wd.getWeatherID());
			System.out.println("WeatherDesc----"+wd.getDescription());
			System.out.println("Pic Url----"+wd.getPictureURL());
		}
		
		
		
	}
}
