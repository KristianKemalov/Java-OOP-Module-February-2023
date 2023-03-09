package Polymorphism.Shapes;


public class Circle extends Shape {


    private  Double radius;

    public final Double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * radius * radius);
    }
}
