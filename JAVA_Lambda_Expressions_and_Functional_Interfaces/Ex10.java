package JAVA_Lambda_Expressions_and_Functional_Interfaces;

// Create a functional interface with a method that takes a List<String> representing first names and returns a List<String> of those names formatted in uppercase.
// Implement it using a lambda expression.

import java.util.ArrayList;
import java.util.List;

@java.lang.FunctionalInterface
interface UpperCase{

    List<String> names (List<String> firstNames);

}

public class Ex10 {

    public static void main(String[] args) {

        UpperCase upperCase = firstNames -> {
            List<String> namesUpper = new ArrayList<>();
            for (int i = 0; i < firstNames.size(); i++){
                namesUpper.add(firstNames.get(i).toUpperCase());
            }
            return namesUpper;
        };

        List<String> list = List.of("Sebastian", "Casiana", "Andrei", "Marius", "Loredana");

        List<String> listOut = upperCase.names(list);

        System.out.println(listOut);

    }

}
