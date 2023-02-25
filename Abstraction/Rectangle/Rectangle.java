package Abstraction.Rectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        boolean insideX = point.getX() >= bottomLeft.getX() && point.getX() <= topRight.getX();
        boolean insideY = point.getY() >= bottomLeft.getY() && point.getY() <= topRight.getY();

        return insideX && insideY;
    }
}
