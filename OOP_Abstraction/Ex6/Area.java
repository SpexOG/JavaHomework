package OOP_Abstraction.Ex6;

public class Area extends Shape{

    @Override
    public void RectangleArea(double length, double breadth){

        double rectangleArea = length * breadth;

        if (length >= breadth){

            System.out.println("Area of rectangle is: " + rectangleArea + " square units!");

        }else if (breadth > length){

            System.out.println("Breadth cannot be greater than length so the values will be changed!");

            double breadth1 = length;
            double length1 = breadth;

            double rectangleArea2 = length * breadth;

            System.out.println("The new length is " + length1);
            System.out.println("The new breadth is " + breadth1);

            System.out.println("Area of rectangle is: " + rectangleArea2 + " square units!");

        }

    }

    @Override
    public void SquareArea(double side){

        double squareArea = side * side;

        System.out.println("Area of square is: " + squareArea + " square units!");

    }

    @Override
    public void CircleArea(double radius){

        double circleArea = radius * radius * Math.PI;

        System.out.println("Area of circle is: " + circleArea + " square units!");

    }

}
