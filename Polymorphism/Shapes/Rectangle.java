package Polymorphism.Shapes;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public void calculatePerimeter() {setPerimeter(2 * (width + height));
    }

    @Override
    public void calculateArea() {setPerimeter(width * height);
    }
}
