package Java_StreamsAndOptional;

// Using a stream of strings representing numbers (e.g., "1", "2", "3"), convert them to integers and find the product of all numbers using reduce.
// (Input: List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");)

import java.util.Arrays;
import java.util.List;

public class Ex13 {

    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        Integer suma = numbers.stream()
                .map(Integer::parseInt)
                .reduce(1, (a, b) -> a * b);

        System.out.println(suma);

    }

}
