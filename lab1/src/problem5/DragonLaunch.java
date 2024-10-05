package problem5;

import java.util.Vector;
import java.util.Scanner;

public class DragonLaunch {
    private Vector<Person> line;

    public DragonLaunch() {
        line = new Vector<>();
    }
    
    public void kidnap(Person person) {
    	boolean empty = line.isEmpty();
        if (!empty && line.lastElement().getGender() == Gender.BOY && person.getGender() == Gender.GIRL) {
             line.remove(line.size() - 1);
        } else {
            line.add(person);
        }
    }
    public boolean willDragonEat() {
    	boolean empty = line.isEmpty();
        return !empty;
    }

    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();
        Scanner scan = new Scanner(System.in);
        int numOfStudents = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numOfStudents; ++i) {
            System.out.println("What is the student's gender? (G - girl, B - boy, M - Mechanic");
            String genderInput = scan.nextLine();
            if (genderInput.equals("G")) {
                launch.kidnap(new Person(Gender.GIRL));
            } else if (genderInput.equals("B")) {
                launch.kidnap(new Person(Gender.BOY));
            } else {
                System.out.println("Error. Try again.");
                i--;
            }
        }
        scan.close();

        System.out.println("Remaining students: " + launch.line);
        if (!launch.willDragonEat()) {
            System.out.println("No one left for the dragon's lunch!");
        }
    }
}
