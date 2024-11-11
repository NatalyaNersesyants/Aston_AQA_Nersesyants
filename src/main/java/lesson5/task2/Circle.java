package lesson5.task2;

class Circle implements Shape {
    private double radius;

    private String fillColor;
    private String borderColor;

    public Circle(int radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void printDetails() {
        System.out.println("Circle:");
        Shape.super.printDetails(fillColor, borderColor);
    }
}