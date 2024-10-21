package Java_StreamsAndOptional;

// Create a stream of integers from an array and find the sum of all integers using the reduce method.
// (Input: Integer[] numbers = {1, 2, 3, 4, 5};)

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex6 {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};

        int suma = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);

        System.out.println(suma);
    }

}
