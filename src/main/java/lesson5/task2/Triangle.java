package lesson5.task2;

class Triangle implements Shape {
    private int sideA;
    private int sideB;
    private int sideC;

    private String fillColor;
    private String borderColor;

    public Triangle(int sideA, int sideB, int sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public void printDetails() {
        System.out.println("Triangle:");
        Shape.super.printDetails(fillColor, borderColor);
    }
}
