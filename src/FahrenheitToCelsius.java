import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius;
        
        // TODO: Add the line to convert Fahrenheit to Celsius
        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.1f°F is equal to %.1f°C\n", fahrenheit, celsius);
        scanner.close();
    }
}
