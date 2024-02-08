package Classwork;

class Area {
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    public int calculateArea(int side) {
        return side * side;
    }
    public double calculateArea(double radius) {
        return 2 * Math.PI * radius;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Area obj1 = new Area();

        double rectangleArea = obj1.calculateArea(5.0, 4.0);
        System.out.println("Area of Rectangle: " + rectangleArea);
        
        // Calculate area of a square
        int squareArea = obj1.calculateArea(5);
        System.out.println("Area of Square: " + squareArea);
        
        // Calculate area of a circle
        double circleArea = obj1.calculateArea(3.0);
        System.out.println("Area of Circle: " + circleArea);
    }
}

