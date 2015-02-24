package com.weatherinfo.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WeatherDescription", propOrder = { "weatherID", "description",
		"pictureURL" })
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherDescription {

	@XmlElement(name = "WeatherID")
	protected short weatherID;
	@XmlElement(name = "Description")
	protected String description;
	@XmlElement(name = "PictureURL")
	protected String pictureURL;

	public short getWeatherID() {
		return weatherID;
	}

	public void setWeatherID(short weatherID) {
		this.weatherID = weatherID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

}
