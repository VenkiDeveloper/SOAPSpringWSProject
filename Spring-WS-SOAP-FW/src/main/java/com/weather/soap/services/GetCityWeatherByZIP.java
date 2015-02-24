package com.weather.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zip"
})
@XmlRootElement(name = "GetCityWeatherByZIP")
public class GetCityWeatherByZIP {

    @XmlElement(name = "ZIP")
    protected String zip;

    public String getZIP() {
        return zip;
    }

    
    public void setZIP(String value) {
        this.zip = value;
    }

}
