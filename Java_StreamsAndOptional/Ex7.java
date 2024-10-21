package Java_StreamsAndOptional;

// Use streams to transform a list of strings into a list of their respective lengths.
// (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");

        List<Integer> length = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(length);

    }

}
