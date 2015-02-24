package com.forecast.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "", propOrder = { "zip" })
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetCityForecastByZIP")
public class GetCityForecastByZIP {

	@XmlElement(name = "ZIP")
	protected String zip;

	public String getZip() {
		return zip;
	}

	public void setZIP(String zip) {
		this.zip = zip;
	}

}
