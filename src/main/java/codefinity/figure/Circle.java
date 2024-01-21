package codefinity.figure;

//ToDo: Override abstract methods from the `Shape` class

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double calculatePerimeter() {
        return  3.14 * (radius * radius);
    }
}
