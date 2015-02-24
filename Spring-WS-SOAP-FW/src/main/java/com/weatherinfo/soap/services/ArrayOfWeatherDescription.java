package com.weatherinfo.soap.services;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlType(name="ArrayOfWeatherDescription",propOrder={"weatherDescription"})
@XmlAccessorType(XmlAccessType.FIELD)
public class ArrayOfWeatherDescription {

	@XmlElement(name="WeatherDescription")
	protected List<WeatherDescription> weatherDescription;

	public List<WeatherDescription> getWeatherDescription() {
		 if (weatherDescription == null) {
			 weatherDescription = new ArrayList<WeatherDescription>();
	        }
	        return this.weatherDescription;
	}

	public void setWeatherDescription(List<WeatherDescription> weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	
	
	
}
