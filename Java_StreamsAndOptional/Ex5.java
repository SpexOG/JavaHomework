package Java_StreamsAndOptional;

// Given a list of people with attributes: first name, last name, and age;
// use streams to find all people who are older than 18 years.
// class Person {
//    String firstName;
//    String lastName;
//    int age;
//}
//List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

        List<Person> over18 = people.stream()
                .filter(person -> person.getAge() > 18)
                .collect(Collectors.toList());

        System.out.println(over18.toString());

    }

}

class Person {

    String firstName;
    String lastName;
    int age;

    public int getAge() {
        return age;
    }

    public Person(String firstName, String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    @Override
    public String toString(){

        return "Prenume : " + firstName + "\n Nume : " + lastName + "\n Varsta : " + age;

    }



}

