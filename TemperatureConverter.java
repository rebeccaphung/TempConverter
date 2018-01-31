package junitIntroduction;

public class TemperatureConverter {

    /**
     * This function converts celcius to fahrenheit
     * @param celsius tempurature in celsius
     * @return fahrenheit
     */
    public static double celsisusToFahrenheit(double celsius) {

        double fahrenheit = (9.0/5.0)*celsius + 32;
        return fahrenheit;
    }


    /**
     * This function converts fahrenheit to celsius
     * @param fahrenheit temperature in fahrenheit
     * @return celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = (5.0/9.0)*(fahrenheit - 32);
        return celsius;

    }

}
