package Java_StreamsAndOptional;

// Given a list of integers, create a new list that contains only the even numbers.
// Use streams to achieve this.
// (Input: List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(evenNumbers);

    }

}
