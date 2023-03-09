package Polymorphism.Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public abstract void calculatePerimeter();

    public abstract void calculateArea();
}
