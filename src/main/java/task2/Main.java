package task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "Черный", "Желтый");
        Triangle triangle = new Triangle(4, 2, 9, 8, "Оранжевый", "Белый");
        Rectangle rectangle = new Rectangle(4, 5, "Зеленый", "Красный");
        System.out.println("Информация о круге");
        circle.display();
        System.out.println("Информация о треугольнике");
        triangle.display();
        System.out.println("Информация о прямоугольнике");
        rectangle.display();
    }
}
