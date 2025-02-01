package com.packages.chapters.weatherforecast;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WeatherParser {
    public static WeatherData parse(String jsonResponse) {
        JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
        String city = jsonObject.get("name").getAsString();
        JsonObject main = jsonObject.getAsJsonObject("main");
        double temp = main.get("temp").getAsDouble();
        double feelsLike = main.get("feels_like").getAsDouble();
        int humidity = main.get("humidity").getAsInt();
        String weather = jsonObject.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").getAsString();

        return new WeatherData(city, temp, feelsLike, humidity, weather);
    }
}


