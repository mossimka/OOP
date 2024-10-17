package guitars;

import java.util.Scanner;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Guitar> guitars = new HashSet<Guitar>();
		int size = scan.nextInt();
		for(int i = 0; i < size; ++i) {
			String manufacturer = scan.next();
			String color = scan.next();
			int strings = scan.nextInt();
			int numOfPickups = scan.nextInt();
			Guitar g = new ElectricGuitar(manufacturer, color, strings, numOfPickups);
			guitars.add(g);
		}
		size = guitars.size();
		for(Guitar g:guitars) {
			System.out.println(g.toString());
		}
		scan.close();
	}
}
	