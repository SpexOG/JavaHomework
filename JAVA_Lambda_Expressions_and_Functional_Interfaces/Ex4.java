package JAVA_Lambda_Expressions_and_Functional_Interfaces;

//You are given a List<String> representing a list of words. Create a lambda expression to sort the list in alphabetical order. Next, modify your lambda expression to sort the list in reverse alphabetical order.

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Mere");
        words.add("Pere");
        words.add("Miere");
        words.add("Visine");
        words.add("Zmeura");
        words.add("Prune");
        words.add("Ananas");
        words.add("Struguri");
        words.add("Mure");
        words.add("Caise");

        words.sort((s1, s2)->s1.compareTo(s2));

        System.out.println("lista sortata alfabetic: " + words);

        words.sort((s1, s2)->s2.compareTo(s1)); // sau words.sort((s1, s2)->s1.compareTo(s2) * (-1));

        System.out.println("lista sortata invers-alfabetic: " + words);


    }

}
