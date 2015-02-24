package com.forecast.soap.services;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POP", propOrder = {
    "nighttime",
    "daytime"
})
public class POP {

    @XmlElement(name = "Nighttime")
    protected String nighttime;
    @XmlElement(name = "Daytime")
    protected String daytime;

  
    public String getNighttime() {
        return nighttime;
    }

   
    public void setNighttime(String value) {
        this.nighttime = value;
    }

   
    public String getDaytime() {
        return daytime;
    }

    
    public void setDaytime(String value) {
        this.daytime = value;
    }

}
