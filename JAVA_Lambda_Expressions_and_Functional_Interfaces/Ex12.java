package JAVA_Lambda_Expressions_and_Functional_Interfaces;
// Create a functional interface with a method that takes two strings and returns a string.
// Implement this interface using a lambda expression to create a utility that joins two strings with a space in between.

@java.lang.FunctionalInterface
interface SpaceBetween{

    String spaceStrings (String str1, String str2);

}

public class Ex12 {

    public static void main(String[] args) {

        SpaceBetween spaceBetween = (str1, str2) -> str1=str1.concat(" ").concat(str2);

        String s1 = "Aici";
        String s2 = "Spatiu";

        String rezultat = spaceBetween.spaceStrings(s1,s2);
        System.out.println(rezultat);

    }

}
