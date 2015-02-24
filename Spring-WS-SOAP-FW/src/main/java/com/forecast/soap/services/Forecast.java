package com.forecast.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlType(name = "Forecast", propOrder = {
	    "date",
	    "weatherID",
	    "desciption",
	    "temperatures",
	    "probabilityOfPrecipiation"
	})
@XmlAccessorType(XmlAccessType.FIELD)
public class Forecast {

	@XmlElement(name = "Date", required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar date;
	@XmlElement(name = "WeatherID")
	protected short weatherID;
	@XmlElement(name = "Desciption")
	protected String desciption;
	@XmlElement(name = "Temperatures", required = true)
	protected Temp temperatures;
	@XmlElement(name = "ProbabilityOfPrecipiation", required = true)
	protected POP probabilityOfPrecipiation;
	public XMLGregorianCalendar getDate() {
		return date;
	}
	public void setDate(XMLGregorianCalendar date) {
		this.date = date;
	}
	public short getWeatherID() {
		return weatherID;
	}
	public void setWeatherID(short weatherID) {
		this.weatherID = weatherID;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public Temp getTemperatures() {
		return temperatures;
	}
	public void setTemperatures(Temp temperatures) {
		this.temperatures = temperatures;
	}
	public POP getProbabilityOfPrecipiation() {
		return probabilityOfPrecipiation;
	}
	public void setProbabilityOfPrecipiation(POP probabilityOfPrecipiation) {
		this.probabilityOfPrecipiation = probabilityOfPrecipiation;
	}
	
	
	
	

}
