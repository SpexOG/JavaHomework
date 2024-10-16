package JAVA_Lambda_Expressions_and_Functional_Interfaces;

// Create a functional interface that takes a string and an integer n as parameters and returns a string. Implement it using a lambda expression that returns the first n characters of the string.
// If n is larger than the length of the string, it should return the full string.
@FunctionalInterface
interface firstCharacters{

    String returnMethod(String str, int n);

}

public class Ex7 {

    public static void main(String[] args) {

        firstCharacters firstCharacters = ((str, n) -> {

            if (n > str.length()){
                return str;
            }else {
             String str2 = str.substring(0, n);
                return str2;
            }
        });

        String str3 = "Animal";
        int n = 3;
        String rezultat = firstCharacters.returnMethod(str3, n);

        System.out.println(rezultat);

    }

}
