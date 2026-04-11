package task2;

public class Circle extends Figure {
    private double radius;

    Circle(double radius, String filColor, String borderColor) {
        super(filColor, borderColor);
        this.radius = radius;
        perimeter = getCirclePerimeter(radius);
        square = getCircleSquare(radius);
    }
}