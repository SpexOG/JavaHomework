package Java_StreamsAndOptional;

// Given a list of books with attributes: title, author, and year of publication;
// use streams to find all the books published before the year 2000 and group them by author in a map where the key is the author and the value is a list of titles of their books.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex15 {

    public static void main(String[] args) {

        List<Books> books = Arrays.asList(
                new Books("Piticii", "Grigore Alecsandri", 1948),
                new Books("Baietelul", "Grigore Alecsandri", 1967),
                new Books("Marcellino", "Grigore Alecsandri", 1988),
                new Books("Soarecele si pisica", "Ion Andrei", 2004),
                new Books("Cainele", "Ion Andrei", 1966),
                new Books("Viezurele", "Apetrei Stefan", 2000),
                new Books("Puiul", "Apetrei Ion", 2003)
                );

        Map<String, List<String>> bookMap = books.stream()
                .filter(book -> book.getYear() < 2000)
                .collect(Collectors.groupingBy(Books::getAuthor, Collectors.mapping(Books::getTitle, Collectors.toList())));

        bookMap.forEach((author, titles)->{
            System.out.println(author + " : " + titles);
        });

    }

}

class Books{

    String title;
    String author;
    int year;

    public Books (String title, String author, int year){

        this.title=title;
        this.author=author;
        this.year=year;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

}