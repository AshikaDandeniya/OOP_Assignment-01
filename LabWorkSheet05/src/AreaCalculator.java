public class AreaCalculator {
    static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }

    public static void main(String[] args) {
        double rectangleLength = 5;
        double rectangleWidth = 8;
        double squareSideLength = 4;

        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of Rectangle: " + rectangleArea);

        double squareArea = calculateSquareArea(squareSideLength);
        System.out.println("Area of Square: " + squareArea);
    }
}

