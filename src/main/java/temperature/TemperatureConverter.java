package temperature;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static boolean isExtremeTemperature(double temperature) {
        return temperature > 50 || temperature < -40;
    }
}