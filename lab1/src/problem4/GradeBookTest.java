package problem4;

import java.util.Scanner;
import studentPackage.Student;

public class GradeBookTest {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.print("Discipline name? ");
        String discipline = scan.next(); // OOP
        System.out.print("How many students to append? ");
        int size = scan.nextInt();
        Student[] students = new Student[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter student name and grade: ");
            String name = scan.next();
            int grade = scan.nextInt();
            students[i] = new Student(name, grade);
        }

        GradeBook gradeBook = new GradeBook(discipline, students);
        System.out.println(gradeBook.displayMessage());
        System.out.println("What to do next?");
        System.out.println("(p - print all students data, g - show grade report, ");
        System.out.println("d - show grades distribution, e - end)");
        scan.nextLine();//clear newline
        while (true) {
            String input = scan.nextLine();
            switch (input) {
                case "p":
                    gradeBook.print();
                    break;
                case "g":
                    System.out.println(gradeBook.displayGradeReport());
                    break;
                case "d":
                	System.out.println("00-09:" + gradeBook.checkForStudents(0, 9));
                	System.out.println("10-19:" + gradeBook.checkForStudents(10, 19));
                	System.out.println("20-29:" + gradeBook.checkForStudents(20, 29));
                	System.out.println("30-39:" + gradeBook.checkForStudents(30, 39));
                	System.out.println("40-49:" + gradeBook.checkForStudents(40, 49));
                	System.out.println("50-59:" + gradeBook.checkForStudents(50, 59));
                	System.out.println("60-69:" + gradeBook.checkForStudents(60, 69));
                	System.out.println("70-79:" + gradeBook.checkForStudents(70, 79));
                	System.out.println("80-89:" + gradeBook.checkForStudents(80, 89));
                	System.out.println("90-99:" + gradeBook.checkForStudents(90, 99));	
                	System.out.println("100:" + gradeBook.checkForStudents(100, 100));
                    break;
                case "e":
                    System.out.println("Bye!");
                    scan.close();
                    return;
                default:
                    System.out.println("Error. Try again.");
                    break;
            }
        }
    }
}
