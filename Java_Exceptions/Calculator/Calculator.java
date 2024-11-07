package Java_Exceptions.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers and an operator (+, -, *, /): ");
            int nr1 = scanner.nextInt();
            int nr2 = scanner.nextInt();
            char operator = scanner.next().charAt(0);

            double result = calculate(nr1, nr2, operator);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (IllegalArgumentException exp) {
            System.out.println("Error: " + exp.getMessage());
        } catch (InputMismatchException excp) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        }
        finally {
            scanner.close();
        }
    }

    private static double calculate(double nr1, double nr2, char operator) throws ArithmeticException, IllegalArgumentException, InputMismatchException {
        switch (operator) {
            case '+':
                return nr1 + nr2;
            case '-':
                return nr1 - nr2;
            case '*':
                return nr1 * nr2;
            case '/':
                if (nr2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return nr1 / nr2;
            default:
                throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /.");
        }
    }
}
