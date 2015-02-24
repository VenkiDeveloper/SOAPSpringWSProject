package com.forecast.soap.services;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfForecast", propOrder = {
"forecast" })

public class ArrayOfForecast {

	@XmlElement(name = "Forecast", nillable = true)
	protected List<Forecast> forecast;

	public List<Forecast> getForecast() {
        if (forecast == null) {
            forecast = new ArrayList<Forecast>();
        }
        return this.forecast;
	}

	public void setForecast(List<Forecast> forecast) {
		this.forecast = forecast;
	}

}
