package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int yearOfStudy = scan.nextInt();
        Student someGuy = new Student(name, yearOfStudy);
        System.out.print(someGuy.toString());
        scan.close();
    }
}
