package com.forecast.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="",propOrder={"getCityForecastByZIPResult"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GetCityForecastByZIPResponse")
public class GetCityForecastByZIPResponse {

	@XmlElement(name="GetCityForecastByZIPResult")
	protected ForeCastReturn getCityForecastByZIPResult;

	public ForeCastReturn getGetCityForecastByZIPResult() {
		return getCityForecastByZIPResult;
	}

	public void setGetCityForecastByZIPResult(
			ForeCastReturn getCityForecastByZIPResult) {
		this.getCityForecastByZIPResult = getCityForecastByZIPResult;
	}
	
	
	
}
