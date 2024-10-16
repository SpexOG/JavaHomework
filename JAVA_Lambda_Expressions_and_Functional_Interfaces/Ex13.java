package JAVA_Lambda_Expressions_and_Functional_Interfaces;

// Create a functional interface that takes a single double as a parameter and returns a double.
// Implement it using a lambda expression to create a utility that returns the square root of the input value.

@java.lang.FunctionalInterface
interface Radical {

    double squareRoot (double n);

}

public class Ex13 {

    public static void main(String[] args) {

        Radical radical = n -> Math.sqrt(n);

        double m = 1522.36;

        double rezultat = radical.squareRoot(m);
        System.out.println(rezultat);

    }

}
