public class GeometryCalculator {
    public static void main(String[] args) {
        System.out.println("Value of pi: " + MathOperations.calculateCircleArea(5));
        double circleArea = MathOperations.calculateCircleArea(5);
        System.out.println("Area of a circle with radius 5: " + circleArea);

        double squareArea = MathOperations.calculateSquareArea(4);
        System.out.println("Area of a square with side length 4: " + squareArea);
    }
}

