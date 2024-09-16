package OOP_Abstraction.Ex1;

// Create an abstract class 'Parent' with a method 'message'.
// It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively.
// Call the methods 'message' by creating an object for each subclass.

public class Main {
    public static void main(String[] args) {

        Subclass_1 subclass1 = new Subclass_1();
        Subclass_2 subclass2 = new Subclass_2();

        subclass1.message();
        subclass2.message();

    }

}
