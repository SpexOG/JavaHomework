package OOP_Abstraction.Ex5;

// Create an abstract class 'Animal' with two abstract methods 'cats' and 'dogs'.
// Now create a class 'Cat' with a method 'cats' which prints "Cats meow" and a class 'Dog' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animal'.
// Now create an object for each of the subclasses and call their respective methods.

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.cats();
        dog.dogs();

    }
}
