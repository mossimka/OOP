package week1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        System.out.printf("%.0f %.0f %.2f", a*4, a*a, Math.sqrt(2)*a);
        input.close();
    }
}
