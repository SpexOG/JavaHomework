package Java_StreamsAndOptional;
// Using a list of strings, find and print the longest string using Java streams.
// (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex2 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        Optional<String> stringSize = strings.stream()
                .max(Comparator.comparingInt(String::length));

        stringSize.ifPresent(System.out::println);

    }

}
