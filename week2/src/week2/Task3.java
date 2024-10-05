package week2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;
        int size = scan.nextInt();
        Time[] times = new Time[size];
        for (int i = 0; i < size; ++i) {
            hours = scan.nextInt();
            minutes = scan.nextInt();
            seconds = scan.nextInt();
            if (hours >= 24 || minutes >= 60 || seconds >= 60) {
                System.out.println("Invalid time input, skipping entry...");
                continue;
            }
            times[i] = new Time(hours, minutes, seconds);
        }
        System.out.println("How do you want to print times? (Universal - u, Standard - s)");
        String command = scan.next();

        if (command.equals("u")) {
            for (int i = 0; i < size; ++i) {
                if (times[i] != null) {
                    System.out.println(times[i].toUniversal());
                }
            }
        } else if (command.equals("s")) { 
            for (int i = 0; i < size; ++i) {
                if (times[i] != null) {
                    System.out.println(times[i].toStandart());
                }
            }
        } else {
            System.out.println("Invalid type");
        }

        scan.close();
    }
}
