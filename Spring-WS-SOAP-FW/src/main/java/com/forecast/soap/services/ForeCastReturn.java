package com.forecast.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name="ForeCastReturn",propOrder={
		
		 "success",
		    "responseText",
		    "state",
		    "city",
		    "weatherStationCity",
		    "forecastResult"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class ForeCastReturn {

	@XmlElement(name = "Success")
	protected boolean success;
	@XmlElement(name = "ResponseText")
	protected String responseText;
	@XmlElement(name = "State")
	protected String state;
	@XmlElement(name = "City")
	protected String city;
	@XmlElement(name = "WeatherStationCity")
	protected String weatherStationCity;
	@XmlElement(name = "ForecastResult")
	protected ArrayOfForecast forecastResult;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWeatherStationCity() {
		return weatherStationCity;
	}

	public void setWeatherStationCity(String weatherStationCity) {
		this.weatherStationCity = weatherStationCity;
	}

	public ArrayOfForecast getForecastResult() {
		return forecastResult;
	}

	public void setForecastResult(ArrayOfForecast forecastResult) {
		this.forecastResult = forecastResult;
	}

}
