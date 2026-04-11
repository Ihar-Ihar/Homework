package task2;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB, String filColor, String borderColor) {
        super(filColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        perimeter = getRectanglePermeter(sideA, sideB);
        square = getRectangleSquare(sideA, sideB);
    }
}
