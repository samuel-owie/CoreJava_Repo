package com.packages.chapters.weatherforecast;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;

public class WeatherParser {
    public static WeatherData parse(String jsonResponse) {
        JsonReader jsonReader = Json.createReader(new StringReader(jsonResponse));
        JsonObject jsonObject = jsonReader.readObject();
        jsonReader.close();

        String city = jsonObject.getString("name");
        JsonObject main = jsonObject.getJsonObject("main");
        double temp = main.getJsonNumber("temp").doubleValue();
        double feelsLike = main.getJsonNumber("feels_like").doubleValue();
        int humidity = main.getInt("humidity");
        String weather = jsonObject.getJsonArray("weather")
                .getJsonObject(0)
                .getString("description");

        return new WeatherData(city, temp, feelsLike, humidity, weather);
    }
}

