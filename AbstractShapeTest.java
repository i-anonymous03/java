abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

class Triangle extends Shape {
    double base, height, side1, side2, side3;

    Triangle(double b, double h, double s1, double s2, double s3) {
        base = b;
        height = h;
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }

    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class AbstractShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Triangle triangle = new Triangle(5, 12, 5, 12, 13);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
