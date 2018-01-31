package junitIntroduction;

import static org.junit.Assert.*;
import org.junit.Test;

public class TempConvTest {

    @Test
    public void testCelsisusToFahrenheit(){
        double result = TemperatureConverter.celsisusToFahrenheit(0.0);
        assertEquals(32.0, result, 0);
    }

    @Test
    public void testfahrenheitToCelsius(){
        double result = TemperatureConverter.fahrenheitToCelsius(32.0);
        assertEquals(0.0, result, 0);
    }
}
