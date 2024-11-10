package lesson5.task2;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();

    default void printDetails(String fillColor, String borderColor) {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Fill color: " + fillColor);
        System.out.println("Border color: " + borderColor);
        System.out.println();
    }
}
