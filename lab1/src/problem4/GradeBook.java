package problem4;

import studentPackage.Student;

public class GradeBook {
    String discipline;
    Student[] students;

    public GradeBook(String discipline, Student[] students) {
        this.discipline = discipline;
        this.students = students;
    }

    public String displayMessage() {
        return "Welcome to the grade book for " + discipline + "!";
    }

    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public String displayGradeReport() {
        return "Class average is " + gradesAverage() + ". Lowest grade is: " + lowest() + ". Highest grade is: " + highest();
    }

    double gradesAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum / students.length;
    }

    String lowest() {
        int min = 100;
        int id = 0;
        for (Student student : students) {
            int grade = student.getGrade();
            if (grade < min) {
                min = grade;
                id = student.getId();
            }
        }
        return min + " (id: " + id + ")";
    }

    String highest() {
        Student max ;
      
        for (Student student : students) {
            int grade = student.getGrade();
            if (grade > max.getGrade()) {
                max =student;
              
            }
        }
        return max + " (id: " + id + ")";
    }

    String checkForStudents(int l, int r) {
        int counter = 0;
        for (Student student : students) {
            int grade = student.getGrade();
            if (grade >= l && grade <= r) {
                counter++;
            }
        }
        return "*".repeat(counter);
    }
}
