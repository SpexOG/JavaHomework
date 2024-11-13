package com.example.SoftQualityAndUnitTesting;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numerele: ");

        double nr1 = scanner.nextDouble();
        double nr2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Alegeti operatia: ");
        System.out.println("1 - add");
        System.out.println("2 - substract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - power");

        String alegere = scanner.nextLine();
        switch (alegere) {
            case "1" -> {
                double rez = add(nr1, nr2);
                System.out.println(rez);
            }
            case "2" -> {
                double rez = subtract(nr1, nr2);
                System.out.println(rez);
            }
            case "3" -> {
                double rez = multiply(nr1, nr2);
                System.out.println(rez);
            }
            case "4" -> {
                double rez = divide(nr1, nr2);
                System.out.println(rez);
            }
            case "5" -> {
                double rez = power(nr1, nr2);
                System.out.println(rez);
            }
            default -> System.out.println("Optiune gresita");
        }

        scanner.close();

    }

    public static double add(double a, double b) {

        double rez = a + b;
        return rez;

    }

    public static double subtract(double a, double b) {

        double rez = a - b;
        return rez;

    }

    public static double multiply(double a, double b) {

        double rez = a * b;
        return rez;

    }

    public static double divide(double a, double b) {

        double rez = a / b;
        return rez;

    }

    public static double power(double a, double b) {

        double rez = Math.pow(a, b);
        return rez;

    }

}
