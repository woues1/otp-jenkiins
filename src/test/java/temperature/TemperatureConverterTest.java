package temperature;

import org.junit.jupiter.api.Test;
import temperature.TemperatureConverter;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter temperatureConverter = new TemperatureConverter();
    @Test
    void celsiusToFahrenheit() {
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
        assertEquals(98.6, TemperatureConverter.celsiusToFahrenheit(37));
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100));
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
        assertEquals(37, TemperatureConverter.fahrenheitToCelsius(98.6));
        assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212));
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(51));
        assertTrue(TemperatureConverter.isExtremeTemperature(-51));
        assertFalse(TemperatureConverter.isExtremeTemperature(50));
        assertFalse(TemperatureConverter.isExtremeTemperature(-40));
    }
}