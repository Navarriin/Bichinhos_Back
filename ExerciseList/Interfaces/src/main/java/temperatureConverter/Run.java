package temperatureConverter;

public class Run {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new StandardTemperatureConverter();

        double celsius = 25.6;
        double fahrenheit = 95.3;

        double fahrenheitConverted = temperatureConverter.celsiusToFahrenheit(celsius);
        double celsiusConverted = temperatureConverter.fahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f°C é igual a %.2f°F%n", celsius, fahrenheitConverted);
        System.out.printf("%.2f°F é igual a %.2f°C%n", fahrenheit, celsiusConverted);
    }
}
