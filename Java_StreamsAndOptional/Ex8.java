package Java_StreamsAndOptional;

// Given a string, use streams to count the number of vowels in it.
// (Input: String sentence = "Hello World";)

import java.util.Arrays;
import java.util.List;

public class Ex8 {

    public static void main(String[] args) {

        String sentence = "Hello World";

        List<Character> vocale = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        long nrVocale = sentence.chars()
                .mapToObj(c->(char)c)
                .filter(c->vocale.contains(c))
                .count();

        System.out.println(nrVocale);

    }

}
