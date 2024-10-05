package week1;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String name = scan.next();
      int len = name.length();
      System.out.print("+");
      for (int i=0; i<len; i++){
          System.out.print("-");
      }
      System.out.print("+");
      System.out.printf("\n|%s|\n", name);
      System.out.print("+");
      for (int i=0; i<len; i++){
          System.out.print("-");
      }
      System.out.print("+");
      scan.close();
  }
}
