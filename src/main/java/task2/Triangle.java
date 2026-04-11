package task2;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    Triangle(double sideA, double sideB, double sideC, double height, String filColor, String borderColor) {
        super(filColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        perimeter = getTrianglePerimeter(sideA, sideB, sideC);
        square = getTriangleSquare(sideC, height);
    }
}
