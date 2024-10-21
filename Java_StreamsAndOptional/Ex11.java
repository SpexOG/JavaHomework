package Java_StreamsAndOptional;

// Create a stream from a text file and use stream operations to find and print the longest word in the file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex11 {

    public static void main(String[] args) {

        try (Stream<String> lines = Files.lines(Paths.get("D:\\Programare\\Java\\Teme Java\\Java\\ex11.txt"))) {

            String longestWord =
                    lines.flatMap(str -> Stream.of(str.split("\\s+")))
                    .filter(word -> word.length() > 0)
                    .max(Comparator.comparing(String::length))
                    .orElse("No words were find");

            System.out.println(longestWord);

        } catch (IOException ex) {

            ex.printStackTrace();

        }


    }

}
