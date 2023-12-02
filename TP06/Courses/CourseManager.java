package Courses;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseManager {
    public static void main(String[] args) {
        ArrayList<Course> allCourses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. List all courses");
            System.out.println("2. Find courses by name");
            System.out.println("3. Add new course");
            System.out.println("4. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listAllCourses(allCourses);
                    break;
                case 2:
                    findCoursesByName(allCourses, scanner);
                    break;
                case 3:
                    addNewCourse(allCourses, scanner);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void listAllCourses(ArrayList<Course> courses) {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("List of all courses:");
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }

    private static void findCoursesByName(ArrayList<Course> courses, Scanner scanner) {
        System.out.print("Enter the name of the course to find: ");
        String courseName = scanner.next();

        boolean found = false;
        for (Course course : courses) {
            if (course.getName().equalsIgnoreCase(courseName)) {
                System.out.println("Course found: " + course);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Course not found with the given name.");
        }
    }

    private static void addNewCourse(ArrayList<Course> courses, Scanner scanner) {
        System.out.print("Enter the name of the new course: ");
        String courseName = scanner.next();

        Course newCourse = new Course(courseName);
        courses.add(newCourse);

        System.out.println("New course added: " + newCourse);
    }
}

class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Course: " + name;
    }
}
