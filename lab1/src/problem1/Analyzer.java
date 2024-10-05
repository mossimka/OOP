package problem1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Data data = new Data();

        System.out.print("Enter number (Q to quit): ");
        while (scan.hasNext()) {
            if (scan.hasNextDouble()) {
                double value = scan.nextDouble();
                data.addValue(value);
            } else {
                String input = scan.next();
                if (input.equals("Q")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number or Q to quit.");
                }
            }
            System.out.print("Enter number (Q to quit): ");
        }
        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());
        scan.close();
    }
}
