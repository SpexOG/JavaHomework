package TemaAdvancedFlowControl_ForWhileSwitch;

import java.util.Scanner;

public class TemaAdvancedFlowControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        oddChecker(scanner);

        monthNameFinder(scanner);

        countingNegativeNumbers(scanner);

        stringReverser(scanner);

        fibonacciSeriesGenerator(scanner);

        whileLoop(scanner);

        doWhileLoop(scanner);

        forLoop();

        forEachLoop(scanner);

        jumpStatements(scanner);

        breakStatement(scanner);

        continueStatement(scanner);

        scanner.close();

    }

    // 1. Even or Odd Checker.
    // Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".
    private static void oddChecker(Scanner scanner) {

        System.out.println("EX1___________________________________________________________________________________________");
        System.out.println();

        int numar;

        System.out.println("Introduceti numarul: ");

        numar = scanner.nextInt();

        if (numar % 2 == 0) {
            System.out.println("Numarul este par!");
        } else {
            System.out.println("Numarul este impar!");
        }

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();

    }

    // 2. Month Name Finder.
    // Write a program that asks the user to enter a number between 1 and 12.
    // Print the name of the corresponding month or "Invalid Month" if out of range.

    private static void monthNameFinder(Scanner scanner) {

        System.out.println("EX2___________________________________________________________________________________________");
        System.out.println();

        int numar;

        System.out.println("Introduceti numarul: ");

        numar = scanner.nextInt();

        switch (numar) {
            case 1 -> System.out.println("Ianuarie");
            case 2 -> System.out.println("Februarie");
            case 3 -> System.out.println("Martie");
            case 4 -> System.out.println("Aprilie");
            case 5 -> System.out.println("Mai");
            case 6 -> System.out.println("Iunie");
            case 7 -> System.out.println("Iulie");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("Septembrie");
            case 10 -> System.out.println("Octombrie");
            case 11 -> System.out.println("Noiembrie");
            case 12 -> System.out.println("Decembrie");
            default -> System.out.println("Luna invalida!");
        }

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();

    }

    // 3. Counting Negative Numbers
    // Given an array of integers, write a program to count and print the number of negative integers in the array.

    private static void countingNegativeNumbers(Scanner scanner) {

        System.out.println("EX3___________________________________________________________________________________________");
        System.out.println();

        int counter = 0;
        int lungimeVector;

        System.out.println("Introduceti lungimea vectorului: ");

        lungimeVector = scanner.nextInt();

        int[] array = new int[lungimeVector];

        for (int i = 0; i < array.length; i++) {
            System.out.print("v[" + i + "]=");
            array[i] = scanner.nextInt();
            System.out.println();
        }

        System.out.println("Vectorul este: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("In vector se afla " + counter + " numere negative.");

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();

    }

    // 4. String Reverser
    // Ask the user to enter a string.
    // Print the reversed version of this string.
    private static void stringReverser(Scanner scanner) {

        System.out.println("EX4___________________________________________________________________________________________");
        System.out.println();

        System.out.print("Introduceti String-ul: ");

        String string = scanner.nextLine();

        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }

        System.out.println("String-ul inversaat este: " + reversedString);

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();

    }

    // 5. Fibonacci Series Generator
    // Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.
    private static void fibonacciSeriesGenerator(Scanner scanner) {

        System.out.println("EX5___________________________________________________________________________________________");
        System.out.println();

        int n, a = 0, b = 1, c;

        System.out.print("Introduceti cate numere din sirul lui Finonacci sa fie afisate: ");

        n = scanner.nextInt();

        System.out.println();

        System.out.print("Sirul lui Fibonacci pana la " + n + " : " + a + " " + b + " ");

        for (int i = 1; i <= n - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();

    }

    // 6. While Loop
    // Write a program that asks the user to enter numbers.
    // The program should continue prompting the user until they enter -1.
    // After they enter -1, print the sum of all numbers entered (excluding -1).
    private static void whileLoop(Scanner scanner) {

        System.out.println("EX6___________________________________________________________________________________________");
        System.out.println();

        System.out.println("Introduceti un numar: ");

        int n = scanner.nextInt();
        int sum = 0;

        if (n == -1) {
            System.out.println("Suma numerelor introduse este: " + sum);
        }

        while (n != -1) {
            sum += n;
            System.out.println("Introduceti un numar: ");
            n = scanner.nextInt();
            if (n == -1)
                System.out.println("Suma numerelor introduse este: " + sum);
        }

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();

    }

    // 7. Do-While Loop
    // Create a program where the user is prompted to guess a predefined number.
    // After each guess, the program should inform the user if the guess is too high or too low.
    // The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.

    private static void doWhileLoop(Scanner scanner) {

        System.out.println("EX7___________________________________________________________________________________________");
        System.out.println();

        int nrGhicit;
        int nrPredefinit;

        System.out.print("Introduceti numarul predefinit pentru ghicit: ");

        nrPredefinit = scanner.nextInt();

        do {
            System.out.print("Ghiciti numarul: ");
            nrGhicit = scanner.nextInt();
            if (nrGhicit > nrPredefinit) {
                System.out.println("Numarul introdus este prea mare!");
            } else if (nrGhicit < nrPredefinit) {
                System.out.println("Numarul introdus este prea mic!");
            } else {
                System.out.println("Ati ghicit numarul, FELICITARI!");
            }
        } while (nrGhicit != nrPredefinit);

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();
    }

    // 8. For Loop
    // Write a program that prints the first 10 numbers in the Fibonacci series.
    // Use a for loop to accomplish this.
    private static void forLoop() {

        System.out.println("EX8___________________________________________________________________________________________");
        System.out.println();

        int n = 10, a = 0, b = 1, c;

        System.out.print("Introduceti cate numere din sirul lui Finonacci sa fie afisate: ");

        System.out.println();

        System.out.print("Sirul lui Fibonacci pana la " + n + " : " + a + " " + b + " ");

        for (int i = 1; i <= n - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println();

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();

    }

    // 9. For-Each Loop
    // Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the number is odd.
    // Utilize a for-each loop for this task.
    private static void forEachLoop(Scanner scanner) {

        System.out.println("EX9___________________________________________________________________________________________");
        System.out.println();

        int n;

        System.out.println("Introduceti dimensiunea vectorului: ");

        n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("v[" + i + "]=");
            array[i] = scanner.nextInt();
            System.out.println();
        }

        for (int numar : array) {
            if (numar % 2 == 0) {
                System.out.println("Numarul " + numar + " din vector este par!");
            } else {
                System.out.println("Numarul " + numar + " din vector este impar!");
            }
        }

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();
    }

    // 10. Jump Statements
    // Create a menu-driven program where the user is presented with options:
    // Print "Hello World"
    // Print the user's name.
    // Exit.
    // Based on the user's input, perform the necessary action.
    // Once an action is completed, show the menu again, unless the user chooses the Exit option. Use jump statements to control the flow of the program.
    private static void jumpStatements(Scanner scanner) {

        System.out.println("EX10__________________________________________________________________________________________");
        System.out.println();

        int n;

        char a = '"';

        while (true) {
            System.out.println("Meniu:");
            System.out.println("1. Print " + a + "Hello World!" + a);
            System.out.println("2. Print the user's name.");
            System.out.println("3. Exit");
            System.out.print("Alegeti o opriune: ");

            n = scanner.nextInt();

            switch (n) {
                case 1 -> System.out.println("Hello World!");
                case 2 -> System.out.println("Sebastian Mutulescu");
                case 3 -> {
                    System.out.println("You are exiting the program right now...");
                    System.out.println();
                    System.out.println("TERMINAT!!!___________________________________________________________________________________");
                    System.out.println();
                    return;
                }
                default -> System.out.println("Invalid option!!!");
            }

            System.out.println();

        }
    }

    // 11. Break Statement
    // Write a program that prompts the user to enter numbers.
    // Calculate the average of these numbers.
    // If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.
    private static void breakStatement(Scanner scanner) {

        System.out.println("EX11__________________________________________________________________________________________");
        System.out.println();

        double sum = 0, contor = 0;
        double average, averageModulo;
        System.out.print("Introduceti numerele pentru calcularea mediei acestora: ");
        double n = scanner.nextInt();

        while (n != 0) {
            sum += n;
            contor++;
            n = scanner.nextInt();
            if (n == 0) {
                average = sum / contor;
                System.out.println("Media numerelor introduse este: " + average);
            }
        }

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();

    }


    // 12. Continue Statement
    // Create a program that asks the user for 10 numbers.
    // Print the sum of all numbers that are greater than 5.
    // If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.
    private static void continueStatement(Scanner scanner) {

        System.out.println("EX12__________________________________________________________________________________________");
        System.out.println();

        System.out.println("Introduce numerele: ");

        int contorNumere = 0;
        int sum = 0;
        int n;

        while (contorNumere < 10) {
            n = scanner.nextInt();
            contorNumere++;
            if (n <= 5) {
                continue;
            }
            sum += n;
        }
        System.out.println("Suma numerelor mai mari decat 5 este: " + sum);

        System.out.println();
        System.out.println("TERMINAT!!!___________________________________________________________________________________");
        System.out.println();

    }

    // 13. Pathfinding in a Maze
    // Consider a simple maze represented by a 2D grid.
    // The maze consists of open cells, walls, a start, and an end.
    // You have to find a path from the start to the end, moving only up, down, left, or right.
    // You can't move diagonally. If a path exists, print it; otherwise, inform the user that there's no solution.
    //
    // The maze will be represented by a 2D array where:
    // 0 represents an open cell.
    // 1 represents a wall.
    // S represents the start.
    // E represents the end.
    //
    // Example:
    // S 1 0 1
    // 0 1 0 1
    // 0 1 0 1
    // 1 0 0 E
    //
    // Problem Tasks:
    // Read the maze layout from a file or hard-code it into your program.
    // Implement a pathfinding algorithm to navigate from the start to the end.
    // If a path is found, print the maze with the path. You can represent the path with a *.
    // If no path exists, print "No solution found."
    // Hints:
    // Consider using a Depth-First Search (DFS) or Breadth-First Search (BFS) algorithm for pathfinding.
    // You might want to represent the maze using a class with methods to detect neighbors, check for walls, etc.
}
