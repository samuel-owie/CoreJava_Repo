package com.packages.chapters.weatherforecast;

public class WeatherData {
    private String city;
    private double temperature;
    private double feelsLike;
    private int humidity;
    private String description;

    public WeatherData(String city, double temperature, double feelsLike, int humidity, String description) {
        this.city = city;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.humidity = humidity;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Weather in " + city + ":\n" +
                "Temperature: " + temperature + "°C\n" +
                "Feels Like: " + feelsLike + "°C\n" +
                "Humidity: " + humidity + "%\n" +
                "Description: " + description;
    }
}
