package main;

import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the original unit (C/F/K): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(temperature));
                System.out.println("Kelvin: " + celsiusToKelvin(temperature));
                break;
            case 'F':
                System.out.println("Celsius: " + fahrenheitToCelsius(temperature));
                System.out.println("Kelvin: " + fahrenheitToKelvin(temperature));
                break;
            case 'K':
                System.out.println("Celsius: " + kelvinToCelsius(temperature));
                System.out.println("Fahrenheit: " + kelvinToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid unit. Please enter C for Celsius, F for Fahrenheit, or K for Kelvin.");
                break;
        }

       // scanner.close();
    }
}
