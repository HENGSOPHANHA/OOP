package Circle;

import java.util.Scanner;

class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    private Point center;
    private Point pointOnCircle;

    public Circle(Point center, Point pointOnCircle) {
        this.center = center;
        this.pointOnCircle = pointOnCircle;
    }

    public double calculateRadius() {
        return distance(center, pointOnCircle);
    }

    public double calculateLength() {
        return 2 * Math.PI * calculateRadius();
    }

    public double calculateSurface() {
        return Math.PI * calculateRadius() * calculateRadius();
    }

    private double distance(Point point1, Point point2) {
        return Math.sqrt((point1.x - point2.x) * (point1.x - point2.x) + (point1.y - point2.y) * (point1.y - point2.y));
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x-coordinate for center: ");
        double centerX = scanner.nextDouble();

        System.out.print("Enter y-coordinate for center: ");
        double centerY = scanner.nextDouble();

        System.out.print("Enter x-coordinate for point on the circle: ");
        double pointX = scanner.nextDouble();

        System.out.print("Enter y-coordinate for point on the circle: ");
        double pointY = scanner.nextDouble();

        Point center = new Point(centerX, centerY);
        Point pointOnCircle = new Point(pointX, pointY);

        Circle circle = new Circle(center, pointOnCircle);

        System.out.println("Radius: " + circle.calculateRadius());
        System.out.println("Length: " + circle.calculateLength());
        System.out.println("Surface: " + circle.calculateSurface());

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
