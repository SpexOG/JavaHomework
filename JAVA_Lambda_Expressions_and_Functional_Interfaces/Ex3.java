package JAVA_Lambda_Expressions_and_Functional_Interfaces;

//Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);
        list.add(45);

        int suma = list.stream().reduce(0, (a, b)->a+b);

        System.out.println("Suma: " + suma);

    }

}
