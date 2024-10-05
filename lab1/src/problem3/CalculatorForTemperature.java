package problem3;

import java.util.Scanner;

public class CalculatorForTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Temperature temper = new Temperature();
        
        System.out.println("Standard temperature 0 degrees of Celsius is set. What to do next?");
        System.out.println("(s - set new, f - change from Celsius to Fahrenheit,");
        System.out.println("c - change from Fahrenheit to Celsius, p - print, e - end calculations)");
        
        while (true) {
            String input = scan.nextLine();
            switch (input) {
            	case "s":
                    System.out.println("Enter the value:");
                    double newTemp = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Enter the scale (C or F):");
                    char newScale = scan.nextLine().toUpperCase().charAt(0);
                    if (newScale == 'C' || newScale == 'F') {
                        temper = new Temperature(newTemp, newScale);
                    } else {
                        System.out.println("Invalid scale. Please enter 'C' or 'F'.");
                    }
                    break;
                case "f":
                    if (temper.getScale() == 'C') {
                        System.out.println(temper.CelsiusToFahrenheit());
                    } else {
                        System.out.println("Temperature is already in Fahrenheit.");
                    }
                    break;
                case "c":
                    if (temper.getScale() == 'F') {
                        System.out.println(temper.FahrenheitToCelsius());
                    } else {
                        System.out.println("Temperature is already in Celsius.");
                    }
                    break;
                case "p":
                    System.out.println(temper.print());
                    break;
                case "e":
                    System.out.println("Bye!");
                    scan.close();
                    return;
                default:
                    System.out.println("Error. Try again.");
                    break;
            }
        }
    }
}
