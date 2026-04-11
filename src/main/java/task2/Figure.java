package task2;

public abstract class Figure implements Square, Perimeter {
    protected String filColor;
    protected String borderColor;
    protected double perimeter;
    protected double square;

    Figure(String filColor, String borderColor) {
        this.filColor = filColor;
        this.borderColor = borderColor;
    }

    public void display() {
        System.out.println("Периметр:" + perimeter + " Площадь: " + square +
                " Цвет заливки: " + filColor + " Цвет границы: " + borderColor);
    }
}


