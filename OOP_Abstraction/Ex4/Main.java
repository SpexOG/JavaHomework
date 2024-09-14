package OOP_Abstraction.Ex4;

// An abstract class has a constructor which prints "This is constructor of abstract class", an abstract method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
// A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract method".
// Now create an object of 'SubClass' and call the abstract method and the non-abstract method. (Analyse the result)

public class Main {
    public static void main(String[] args) {

        SubClass subClass = new SubClass();

        subClass.a_method();
        subClass.nonAbstractClass();

        //  Constructorul clasei abstracte este apelat în momentul în care obiectul clasei derivate este creat. Acesta este comportamentul standard în moștenire.
        //  Metoda abstractă a_method() este implementată în clasa derivată și este apelată prin intermediul obiectului SubClass.
        //  Metoda neabstractă poate fi apelată direct din clasa abstractă, deoarece a fost moștenită.

    }
}
