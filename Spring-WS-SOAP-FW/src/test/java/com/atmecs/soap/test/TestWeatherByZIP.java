package com.atmecs.soap.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.weather.soap.services.GetCityWeatherByZIP;
import com.weather.soap.services.GetCityWeatherByZIPResponse;
import com.weather.soap.services.WeatherReturn;

public class TestWeatherByZIP {
	public static void main(String[] args) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src\\main\\resources\\weatherByZip.xml");

		WebServiceTemplate weatherTemplate = (WebServiceTemplate) ctx
				.getBean("weatherTemplate");

		GetCityWeatherByZIP weatherRequest = new com.weather.soap.services.ObjectFactory()
				.createGetCityWeatherByZIP();
		weatherRequest.setZIP("94566");

		GetCityWeatherByZIPResponse weatherResponse = (GetCityWeatherByZIPResponse) weatherTemplate
				.marshalSendAndReceive(weatherRequest);

		WeatherReturn weatherReturn = weatherResponse
				.getGetCityWeatherByZIPResult();

		System.out.println("Success " + weatherReturn.isSuccess());
		System.out.println("ResponseText " + weatherReturn.getResponseText());
		System.out.println("State " + weatherReturn.getState());
		System.out.println("City " + weatherReturn.getCity());

	}
}
