package week2;

import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int triangleWidth = scan.nextInt();
		StarTriangle triangle = new StarTriangle(triangleWidth);
		System.out.print(triangle.toString());
		scan.close();
	}
}
