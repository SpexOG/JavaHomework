package OOP_Abstraction.Ex6;

// We have to calculate the area of a rectangle, a square and a circle.
// Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
// The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius.
// Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
// Create an object of class 'Area' and call all the three methods.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Area area = new Area();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        area.RectangleArea(length, breadth);

        System.out.print("Side of square: ");
        double side = scanner.nextDouble();

        area.SquareArea(side);

        System.out.print("Radius of circle: ");
        double radius = scanner.nextDouble();

        area.CircleArea(radius);

        scanner.close();

    }
}
