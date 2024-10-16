package JAVA_Lambda_Expressions_and_Functional_Interfaces;

// Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(52);
        list.add(59);
        list.add(5555);
        list.add(58);
        list.add(24);
        list.add(12);
        list.add(15);
        list.add(51);

        System.out.println("Lista nomala: " + list);

        List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println("Numere pare din lista: " + evenNumbers);


    }

}
