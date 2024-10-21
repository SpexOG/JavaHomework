package Java_StreamsAndOptional;

// Given a list of strings, use streams to create a single string which is a concatenation of all strings separated by a comma.
// (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three", "four");

        String word = strings.stream()
                        .collect(Collectors.joining(","));

        System.out.println(strings);
        System.out.println(word);
    }

}
