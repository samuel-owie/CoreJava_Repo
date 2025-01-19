package com.packages.chapters.weatherforecast;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeatherAppGUI extends JFrame {
    private JTextField cityInputField;
    private JTextArea resultArea;

    public WeatherAppGUI(){
        setTitle("Weather Forecast App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create UI components
        cityInputField = new JTextField(20);
        JButton getWeatherButton = new JButton("Get Weather");
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        // Layout
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter City:"));
        panel.add(cityInputField);
        panel.add(getWeatherButton);
        add(panel, "North");
        add(new JScrollPane(resultArea), "Center");

        //Button action
        getWeatherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String city = cityInputField.getText();
                if (!city.isEmpty()){
                    WeatherAPI weatherAPI = new WeatherAPI();
                    try {
                        String jsonResponse = weatherAPI.fetchWeather(city);
                        WeatherData weatherData = WeatherParser.parse(jsonResponse);
                        resultArea.setText(weatherData.toString());
                    } catch (Exception ex){
                        resultArea.setText("Error: " + ex.getMessage());
                    }
                } else {
                    resultArea.setText("Please enter a city name.");
                }
            }
        });
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            WeatherAppGUI app = new WeatherAppGUI();
            app.setVisible(true);
        });
    }
}
