package com.forecast.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temp", propOrder = {
    "morningLow",
    "daytimeHigh"
})
public class Temp {

    @XmlElement(name = "MorningLow")
    protected String morningLow;
    @XmlElement(name = "DaytimeHigh")
    protected String daytimeHigh;

   
    public String getMorningLow() {
        return morningLow;
    }

   
    public void setMorningLow(String value) {
        this.morningLow = value;
    }

  
    public String getDaytimeHigh() {
        return daytimeHigh;
    }


    public void setDaytimeHigh(String value) {
        this.daytimeHigh = value;
    }

}
