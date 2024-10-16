package JAVA_Lambda_Expressions_and_Functional_Interfaces;
// Create a functional interface named ListFilter that works with generics.
// It should have a method that takes a list of elements of type T and a predicate functional interface, applying the predicate to filter elements of the list, returning a new list with elements that satisfy the predicate condition.
// Implement the ListFilter using a lambda expression and demonstrate its usage with different types of lists and predicates.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@java.lang.FunctionalInterface
interface ListFilter<T>{

    List<T> filter (List<T>list, Predicate<T>predicate);

}

public class Ex15 {

    public static void main(String[] args) {

        ListFilter<Integer> listFilter = (list, predicate) -> {
            List<Integer> filteredList = new ArrayList<>();
            for (Integer element : list){
                if (predicate.test(element)){
                    filteredList.add(element);
                }
            }
            return filteredList;
        };

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> oddNumbers = listFilter.filter(numbers, n -> n % 2 != 0);
        System.out.println("Numere impare: " + oddNumbers);

        ListFilter<String> stringFilter = (list, predicate) -> {
            List<String> filteredList = new ArrayList<>();
            for (String elem : list) {
                if (predicate.test(elem)) {
                    filteredList.add(elem);
                }
            }
            return filteredList;
        };

        List<String> names = List.of("Ana", "John", "George", "Alex", "Zoe", "Zendaya");
        List<String> namesWithA = stringFilter.filter(names, name -> name.contains("A") || name.contains("a"));
        System.out.println("Nume care conțin litera 'A': " + namesWithA);

    }

}
