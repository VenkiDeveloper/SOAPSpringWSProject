package com.weather.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getCityWeatherByZIPResult" })
@XmlRootElement(name = "GetCityWeatherByZIPResponse")
public class GetCityWeatherByZIPResponse {

	@XmlElement(name = "GetCityWeatherByZIPResult", required = true)
	protected WeatherReturn getCityWeatherByZIPResult;

	public WeatherReturn getGetCityWeatherByZIPResult() {
		return getCityWeatherByZIPResult;
	}

	public void setGetCityWeatherByZIPResult(WeatherReturn value) {
		this.getCityWeatherByZIPResult = value;
	}

}