package codefinity.figure;

//ToDo: Override abstract methods from the `Shape` class

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculatePerimeter() {
        return  Math.PI * (radius * radius);
    }
}
