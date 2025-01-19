package com.packages.chapters.weatherforecast;

public class WeatherApp {
    public static void main(String[] args) {
        String city = "London"; // Replace with user input or GUI input
        WeatherAPI weatherAPI = new WeatherAPI();
        try {
            String jsonResponse = weatherAPI.fetchWeather(city);
            WeatherData weatherData = WeatherParser.parse(jsonResponse);
            System.out.println(weatherData); // Print weather details
        } catch (Exception e) {
            System.err.println("Error fetching weather: " + e.getMessage());
        }
    }
}
