package com.atmecs.soap.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.forecast.soap.services.ArrayOfForecast;
import com.forecast.soap.services.ForeCastReturn;
import com.forecast.soap.services.Forecast;
import com.forecast.soap.services.GetCityForecastByZIP;
import com.forecast.soap.services.GetCityForecastByZIPResponse;
import com.forecast.soap.services.ObjectFactory;
import com.forecast.soap.services.POP;
import com.forecast.soap.services.Temp;
import com.weather.soap.services.GetCityWeatherByZIP;
import com.weather.soap.services.GetCityWeatherByZIPResponse;
import com.weather.soap.services.WeatherReturn;

public class TestForecastByZIP {
	public static void main(String[] args) {

		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src\\main\\resources\\forecastByZip.xml");

		WebServiceTemplate forecastTemplate = (WebServiceTemplate) ctx
				.getBean("forecastTemplate");

		GetCityForecastByZIP forecastRequest = new com.forecast.soap.services.ObjectFactory()
				.createGetCityForecastByZIP();
		forecastRequest.setZIP("94566");

		GetCityForecastByZIPResponse forecastResponse = (GetCityForecastByZIPResponse) forecastTemplate
				.marshalSendAndReceive(forecastRequest);

		ForeCastReturn forecasatReturn = forecastResponse.getGetCityForecastByZIPResult();

		System.out.println("Success " + forecasatReturn.isSuccess());
		System.out.println("ResponseText " + forecasatReturn.getResponseText());
		System.out.println("State " + forecasatReturn.getState());
		System.out.println("City " + forecasatReturn.getCity());
		System.out.println("WeatherStationCity "+forecasatReturn.getWeatherStationCity());
		ArrayOfForecast forecast = forecasatReturn.getForecastResult();
		List<Forecast> list = forecast.getForecast();
		for(Forecast fc : list){
			Temp temp = fc.getTemperatures();
			POP pop = new POP();
			System.out.println(" Date"+fc.getDate());
			System.out.println(" WeatherID "+fc.getWeatherID());
			System.out.println("Desciption "+fc.getDesciption());
			System.out.println(" MorningLow "+temp.getMorningLow());
			System.out.println(" DaytimeHigh "+temp.getDaytimeHigh());
			System.out.println("Nighttime "+pop.getNighttime());
			System.out.println("Daytime "+pop.getDaytime());
		}
		
		System.out.println();

	}
}
