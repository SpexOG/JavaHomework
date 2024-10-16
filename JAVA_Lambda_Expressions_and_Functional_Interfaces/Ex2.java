package JAVA_Lambda_Expressions_and_Functional_Interfaces;

//Write a program that uses lambda expressions to sort a list of strings in alphabetical order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {

        List<String>list = new ArrayList<>();
        list.add("Mere");
        list.add("Ananas");
        list.add("Pere");
        list.add("Bere");
        list.add("Caise");
        list.add("Prune");
        list.add("Miere");
        list.add("Zmeura");
        list.add("Cirese");
        list.add("Mure");
        list.add("Visine");

        list.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Lista sortata: " + list);

    }

}
