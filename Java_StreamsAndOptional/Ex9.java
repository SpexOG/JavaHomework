package Java_StreamsAndOptional;

// Given a list of sentences, use flatMap to create a list of all words in all the sentences, and then find the most frequently occurring word.
// (Input: List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");)

import java.util.*;
import java.util.stream.Collectors;

public class Ex9 {

    public static void main(String[] args) {

        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");

        List<String> allWords = sentences.stream()
                .flatMap(sentence->Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

        System.out.println(allWords);

        Map<String, Long> frecventaCuvinte = allWords.stream()
                .collect(Collectors.groupingBy(word->word, Collectors.counting()));

        System.out.println(frecventaCuvinte);

        long frecventaMaxima = Collections.max(frecventaCuvinte.values());

        System.out.println(frecventaMaxima);

        List<String> celeMaiFrecvente = frecventaCuvinte.entrySet().stream()
                .filter(entry->entry.getValue() == frecventaMaxima)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(celeMaiFrecvente);

    }

}
