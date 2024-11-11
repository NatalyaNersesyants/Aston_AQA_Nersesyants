package lesson5.task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "White", "Yellow");
        Rectangle rectangle = new Rectangle(10, 20, "White", "Blue");
        Triangle triangle = new Triangle(3, 4, 5, "White", "Red");

        circle.printDetails();
        rectangle.printDetails();
        triangle.printDetails();
    }
}
