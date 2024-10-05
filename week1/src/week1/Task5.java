package week1;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int initialBalance = 2525;
		double interest = scan.nextDouble();
		System.out.print(initialBalance*(interest/100 + 1));
		scan.close();
	}
}
