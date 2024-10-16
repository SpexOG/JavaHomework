package JAVA_Lambda_Expressions_and_Functional_Interfaces;
// Create a functional interface that is generic and takes a list of generic items and a single generic item, returning a boolean indicating whether the item is in the list.
// Implement this interface using a lambda expression.

import java.util.Arrays;
import java.util.List;

@java.lang.FunctionalInterface
interface IsInTheList<T>{

    boolean IsHere(List<T> list, T item);

}

public class Ex11 {

    public static void main(String[] args) {

        IsInTheList isInTheList = (list, item) -> list.contains(item);

        List<Integer> numbers = Arrays.asList(12,3,2,32,4,34,3);

        int n = 2;
        boolean existaInLista = isInTheList.IsHere(numbers, n);
        System.out.println(existaInLista);

    }

}
