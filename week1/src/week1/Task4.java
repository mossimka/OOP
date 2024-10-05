package week1;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double b = scan.nextInt();
		int c = scan.nextInt();
		double D = Math.pow(b, 2) - 4*a*c;
		if (D>0) {
			System.out.print((-b + Math.sqrt(D))/(2*a) + " ");
			System.out.print((-b - Math.sqrt(D))/(2*a));
		} else if (D == 0) {
			System.out.print(-b/(2*a));
		} else {
			System.out.print("ERROR");
		}
		scan.close();
	}
}
