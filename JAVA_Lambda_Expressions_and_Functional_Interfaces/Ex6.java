package JAVA_Lambda_Expressions_and_Functional_Interfaces;

// Create a functional interface with a method that takes two strings as input and returns an integer.
// Implement this interface using a lambda expression to create a custom comparator that compares strings based on their length (not lexicographically).

@FunctionalInterface
interface stringLength{

    int result (String str1, String str2);

}

public class Ex6 {

    public static void main(String[] args) {

        stringLength stringLength = (str1, str2) -> Integer.compare(str1.length(), str2.length());

        String str1 = "Nimic";
        String str2 = "Ceva";

        int rezultat = stringLength.result(str1, str2);


        if (rezultat < 0){
            System.out.println(str1 + " este mai scurt decât " + str2);
        } else if (rezultat > 0) {
            System.out.println(str1 + " este mai lung decât " + str2);
        } else {
            System.out.println(str1 + " are aceeași lungime ca " + str2);
        }

    }

}
