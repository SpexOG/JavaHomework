package JAVA_Lambda_Expressions_and_Functional_Interfaces;
//Create a functional interface that takes a list of integers and returns a list of integers. Use a lambda expression to implement this interface, such that it returns a list containing only the odd numbers from the original list.

import java.util.ArrayList;
import java.util.List;

@java.lang.FunctionalInterface
interface FunctionalInterface {

    List<Integer> interfaceReturn(List<Integer> list);

}

public class Ex9 {

    public static void main(String[] args) {

        FunctionalInterface functionalInterface = list -> {
            List<Integer> oddNumbers = new ArrayList<>();
            for (Integer elem : list) {
                if (elem % 2 != 0){
                    oddNumbers.add(elem);
                }
            }
            return oddNumbers;
        };

        List<Integer> list = List.of(12,3,43,243,3,2,1,1,21,1,2);

        List<Integer> listOdd = functionalInterface.interfaceReturn(list);

        System.out.println(listOdd);
    }

}
