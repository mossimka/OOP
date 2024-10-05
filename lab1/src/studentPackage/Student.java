package studentPackage;

public class Student {
    private String name;
    private int grade;
    private static int counterId = 0;
    private int id;

    public Student(String name, int grade) {
        id = counterId++;
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return "id: " + id + " Student: " + name + " Grade: " + grade;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }
}