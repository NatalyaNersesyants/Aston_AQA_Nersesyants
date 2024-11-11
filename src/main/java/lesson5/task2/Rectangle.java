package lesson5.task2;

class Rectangle implements Shape {
    private double width;
    private double height;

    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public void printDetails() {
        System.out.println("Rectangle:");
        Shape.super.printDetails(fillColor, borderColor);
    }
}