package Java_StreamsAndOptional;

// Using streams, find the total number of characters across a list of strings excluding whitespace characters.
// (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        long caractereFaraSpatiiAlbe = strings.stream()
                .map(str -> str.replace(" ", ""))
                .mapToInt(String::length)
                .sum();

        System.out.println(caractereFaraSpatiiAlbe);
    }

}
