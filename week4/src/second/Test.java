package second;

import java.util.Scanner;
import java.util.Vector;
public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Person> HashSet = new Vector<>();
		int size = scan.nextInt();
		String name, adress;
		for(int i = 0; i < size; ++i) {
			System.out.printf("Who you want to add?(Psn - person, Std - student, Stf - staff)");
			String com = scan.next();
			Person prsn = null;
			if(com.equals("Psn")) {
				name = scan.next();
				adress = scan.next();
				prsn = new Person(name, adress);
			}
			if(com.equals("Std")) {
				name = scan.next();
				adress = scan.next();
				String program = scan.next();
				int year = scan.nextInt();
				int fee = scan.nextInt();
				prsn = new Student(name, adress, program, year, fee);
			}
			if(com.equals("Stf")) {
				name = scan.next();
				adress = scan.next();
				String school = scan.next();
				int pay = scan.nextInt();
				prsn = new Staff(name, adress, school, pay);
			}
			HashSet.add(prsn);
		}
		for(Person man:HashSet) {
			System.out.println(man.toString());
		}
		scan.close();
	}
}
