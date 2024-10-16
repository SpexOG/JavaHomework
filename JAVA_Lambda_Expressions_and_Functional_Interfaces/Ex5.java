package JAVA_Lambda_Expressions_and_Functional_Interfaces;

//Create a functional interface that takes a list of integers and returns the maximum value from the list. Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case.

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface maximumValueFromList{

    int maximumValue (List<Integer> list);

}

public class Ex5 {

    public static void main(String[] args) {

        maximumValueFromList maximumValueFromList = (list) -> list.isEmpty() ? Integer.MIN_VALUE : list.stream().max(Integer::compareTo).get();

        List<Integer> numberList = new ArrayList<>();
        numberList.add(45);
        numberList.add(450);
        numberList.add(99);
        numberList.add(657);
        numberList.add(4534534);
        numberList.add(45345);
        numberList.add(345);
        numberList.add(1);
        numberList.add(443);
        numberList.add(0);

        List<Integer>listaGoala = new ArrayList<>();

        int max = maximumValueFromList.maximumValue(numberList);

        System.out.println("Numarul maxim din lista: " + max);

        if (listaGoala.isEmpty()) {

            System.out.println("Lista este goala");

        }else {

            int max1 = maximumValueFromList.maximumValue(listaGoala);


        }

    }

}
