package JAVA_Lambda_Expressions_and_Functional_Interfaces;
// Create a functional interface called PairMaker which takes two parameters of type T and U and returns a Pair object that holds both values.
// The Pair class should be a generic class that can hold two values of any types.
// Your task is to implement the PairMaker using a lambda expression to instantiate Pair objects with the given values.

@java.lang.FunctionalInterface
interface PairMaker<T, U> {

    Pair<T, U> createPair(T first, U second);

}

public class Ex14 {

    public static void main(String[] args) {

        PairMaker pairMaker = (first, second) -> new Pair<>(first, second);

        Pair<Integer, String> pair = pairMaker.createPair(99, "Spex");

        System.out.println(pair);

    }

}

class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString(){
        return "Pair{" + "first = " + first + ", second = " + second + "}";
    }
}