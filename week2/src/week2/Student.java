package week2;

public class Student {
    public int id;
    public String name;
    public int yearOfStudy;
    public static int nextId = 0;

    public Student() {
        id = nextId++;
    }

    public Student(String studentName, int studentYearOfStudy) {
        this();
        this.name = studentName;
        this.yearOfStudy = studentYearOfStudy;
    }

    public String toString() {
        return id + " " + name + " " + yearOfStudy;
    }
    
    public void incrementYear() {
    	this.yearOfStudy = yearOfStudy + 1;
    }
}
