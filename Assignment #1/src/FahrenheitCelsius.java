
public class FahrenheitCelsius {

	public static void main(String[] args) {
		float fahrenheit = 90;
		float celsius = 32;
		float fahrenheitToCelsius = (fahrenheit -32) * 5/9;
		float celsiusToFahrenheit = celsius * 9/5 + 32;
		
		System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius);
		System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit);

	}

}
