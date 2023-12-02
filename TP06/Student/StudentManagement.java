package Student;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int studentID;
    private String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Student Name: " + studentName;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add new student");
            System.out.println("2. List students");
            System.out.println("3. Remove student by name");
            System.out.println("4. Update student information by id");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int newStudentID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student name: ");
                    String newStudentName = scanner.nextLine();

                    Student newStudent = new Student(newStudentID, newStudentName);
                    studentList.add(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("List of students:");
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to remove: ");
                    String removeStudentName = scanner.nextLine();
                    studentList.removeIf(student -> student.getStudentName().equals(removeStudentName));
                    System.out.println("Student removed successfully!");
                    break;

                case 4:
                    System.out.print("Enter student ID to update: ");
                    int updateStudentID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Find the student by ID
                    for (Student student : studentList) {
                        if (student.getStudentID() == updateStudentID) {
                            System.out.print("Enter new student name: ");
                            String updatedStudentName = scanner.nextLine();
                            student.setStudentName(updatedStudentName);
                            System.out.println("Student information updated successfully!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}