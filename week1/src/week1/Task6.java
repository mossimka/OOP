package week1;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			System.out.print(Palindrome(s));
			scan.close();
	}
	public static boolean Palindrome(String s) {
		int len = s.length();
		for (int i=0; i<len/2; i++) {
			if (s.charAt(i) != s.charAt(len-i-1)) {
				return false;
			}
		}
		return true;
	}
}
