package com.forecast.soap.services;


import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {

   
  
    public ObjectFactory() {
    }

  
    public GetCityForecastByZIP createGetCityForecastByZIP() {
        return new GetCityForecastByZIP();
    }


    public GetCityForecastByZIPResponse createGetCityForecastByZIPResponse() {
        return new GetCityForecastByZIPResponse();
    }

  
    public POP createPOP() {
        return new POP();
    }

  
    public Temp createTemp() {
        return new Temp();
    }

   
    public Forecast createForecast() {
        return new Forecast();
    }

    public ArrayOfForecast createArrayOfForecast() {
        return new ArrayOfForecast();
    }

  
}
