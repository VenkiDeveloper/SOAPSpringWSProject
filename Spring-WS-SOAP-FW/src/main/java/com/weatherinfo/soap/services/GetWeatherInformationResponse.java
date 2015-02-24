package com.weatherinfo.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="",propOrder={"getWeatherInformationResult"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="GetWeatherInformationResponse")
public class GetWeatherInformationResponse {

	@XmlElement(name="GetWeatherInformationResult")
	protected ArrayOfWeatherDescription getWeatherInformationResult;

	public ArrayOfWeatherDescription getGetWeatherInformationResult() {
		return getWeatherInformationResult;
	}

	public void setGetWeatherInformationResult(
			ArrayOfWeatherDescription getWeatherInformationResult) {
		this.getWeatherInformationResult = getWeatherInformationResult;
	}
	
}
