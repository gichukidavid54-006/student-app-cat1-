import java.util.Scanner;

class StudentRecord {
    String studentID;
    String name;
    String course;

    StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        StudentRecord student = new StudentRecord(id, name, course);
        student.displayInfo();

        input.close();
    }
}