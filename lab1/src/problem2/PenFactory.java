package problem2;

import java.util.Scanner;

public class PenFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String color = scan.next();
        String inkColor = scan.next();
        int sizeCoef = scan.nextInt();
        Pen first = new Pen();
        Pen second = new Pen(color, inkColor);
        Pen third = new Pen(color, inkColor, sizeCoef);
        System.out.println(first.printPen());
        System.out.println(second.printPen());
        System.out.println(third.printPen());
        scan.close();
    }
}
