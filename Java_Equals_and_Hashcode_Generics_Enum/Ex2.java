package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.Objects;

public class Ex2 {

    public static void main(String[] args) {

        Person person = new Person("Sebi", 23, "sebastian.mutulescu9@gmail.com");
        Person person1 = new Person("Sebi", 23, "sebastian.mutulescu9@gmail.com");

        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());

    }

}

class Person {

    private String name;
    private int age;
    private String email;

    public Person (String name, int age, String email){

        this.name = name;
        this.age = age;
        this.email = email;

    }

    public boolean equals(Object o){

        if (o == null){

            return false;

        }

        if (o == this){

            return true;

        }

        if (!(o instanceof Person)){

            return false;

        }

        Person person = (Person) o;
        return this.age == person.age && Objects.equals(this.name, person.name);
    }

    @Override
    public int hashCode(){

        return Objects.hash(name, age);

    }

}
