package com.weather.soap.services;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
	}

	public GetCityWeatherByZIPResponse createGetCityWeatherByZIPResponse() {
		return new GetCityWeatherByZIPResponse();
	}


	public WeatherReturn createWeatherReturn() {
		return new WeatherReturn();
	}

	public GetCityWeatherByZIP createGetCityWeatherByZIP() {
		return new GetCityWeatherByZIP();
	}



}
