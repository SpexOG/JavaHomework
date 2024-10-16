package JAVA_Lambda_Expressions_and_Functional_Interfaces;

// Create a functional interface that takes a List<Integer> and a function that takes an integer as input and returns an integer.
// Implement this interface using a lambda expression to apply the function to each element in the list, returning a new list with the mapped values.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@FunctionalInterface
interface mappedValues{

    List<Integer> applyFunction(List<Integer> list, Function<Integer, Integer> function);

}

public class Ex8 {

    public static void main(String[] args) {

        mappedValues mappedValues = ((list, function) -> {
            List<Integer>resultList = new ArrayList<>();
            for (Integer element : list){
                resultList.add(function.apply(element));
            }
            return resultList;
        });

        List<Integer> originalList = List.of(23,32,3,1,1,3,1);

        Function<Integer, Integer>inmultireCu2 = x -> x * 2;

        List<Integer> listaMapata = mappedValues.applyFunction(originalList, inmultireCu2);

        System.out.println(originalList);
        System.out.println(listaMapata);
    }

}
