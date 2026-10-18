
import java.lang.*;

class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {
    double length = 5;
    double width = 10;

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

class Triangle extends Shape {
    double height = 5;
    double base = 10;

    @Override
    void area() {
        double result = base * height * 0.5;
        System.out.println("Area of Triangle = " + result);
    }
}

public class pratical_5 {
    public static void main(String args[]) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();

        s = new Triangle();
        s.area();
    }
}
