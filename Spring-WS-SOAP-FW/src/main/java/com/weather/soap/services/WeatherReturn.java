package com.weather.soap.services;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherReturn", propOrder = {
    "success",
    "responseText",
    "state",
    "city",
    "weatherStationCity",
    "weatherID",
    "description",
    "temperature",
    "relativeHumidity",
    "wind",
    "pressure",
    "visibility",
    "windChill",
    "remarks"
})
public class WeatherReturn {

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
    @XmlElement(name = "WeatherID")
    protected short weatherID;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Temperature")
    protected String temperature;
    @XmlElement(name = "RelativeHumidity")
    protected String relativeHumidity;
    @XmlElement(name = "Wind")
    protected String wind;
    @XmlElement(name = "Pressure")
    protected String pressure;
    @XmlElement(name = "Visibility")
    protected String visibility;
    @XmlElement(name = "WindChill")
    protected String windChill;
    @XmlElement(name = "Remarks")
    protected String remarks;

  
    public boolean isSuccess() {
        return success;
    }

   
    public void setSuccess(boolean value) {
        this.success = value;
    }

   
    public String getResponseText() {
        return responseText;
    }

   
    public void setResponseText(String value) {
        this.responseText = value;
    }

   
    public String getState() {
        return state;
    }

    
    public void setState(String value) {
        this.state = value;
    }

  
    public String getCity() {
        return city;
    }

   
    public void setCity(String value) {
        this.city = value;
    }

    
    public String getWeatherStationCity() {
        return weatherStationCity;
    }

    
    public void setWeatherStationCity(String value) {
        this.weatherStationCity = value;
    }

    public short getWeatherID() {
        return weatherID;
    }

   
    public void setWeatherID(short value) {
        this.weatherID = value;
    }

   
    public String getDescription() {
        return description;
    }

   
    public void setDescription(String value) {
        this.description = value;
    }

   
    public String getTemperature() {
        return temperature;
    }

   
    public void setTemperature(String value) {
        this.temperature = value;
    }

   
    public String getRelativeHumidity() {
        return relativeHumidity;
    }

   
    public void setRelativeHumidity(String value) {
        this.relativeHumidity = value;
    }

    
    public String getWind() {
        return wind;
    }

    public void setWind(String value) {
        this.wind = value;
    }

  
    public String getPressure() {
        return pressure;
    }

  
    public void setPressure(String value) {
        this.pressure = value;
    }

   
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String value) {
        this.visibility = value;
    }

   
    public String getWindChill() {
        return windChill;
    }

  
    public void setWindChill(String value) {
        this.windChill = value;
    }

    public String getRemarks() {
        return remarks;
    }

  
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
