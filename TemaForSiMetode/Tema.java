package TemaForSiMetode;

import java.util.ArrayList;
import java.util.Scanner;

public class Tema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ex1();

        int firstNumber, secondNumber;
        System.out.println("Exercitiul 2--------------------------------------------------------------------------------------------");
        System.out.println("Introduceti primul numar: ");
        firstNumber = scanner.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        secondNumber = scanner.nextInt();
        Ex2(firstNumber, secondNumber);

        Ex3();

        System.out.println("Exercitiul 4--------------------------------------------------------------------------------------------");
        int heightOne, heightTwo;
        System.out.println("Introduceti prima inaltime: ");
        heightOne = scanner.nextInt();
        System.out.println("Introduceti a doua inaltime: ");
        heightTwo = scanner.nextInt();

        Tema main = new Tema();
        int valoareEx4 = main.Ex4(heightOne, heightTwo);
        if (heightOne == heightTwo)
            System.out.println("Inaltimile sunt egale: " + valoareEx4);
        else System.out.println("Inaltimea mai mare este: " + valoareEx4);
        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

        Ex5();

        System.out.println("Exercitiul 6--------------------------------------------------------------------------------------------");
        int temp;
        System.out.println("Introduceti valoarea temperaturii: ");
        temp = scanner.nextInt();
        Ex6(temp);

        System.out.println("Exercitiul 7--------------------------------------------------------------------------------------------");
        int sideOne, sideTwo, sideThree;
        System.out.println("Introduceti lungimea primei laturi a triunghiului: ");
        sideOne = scanner.nextInt();
        System.out.println("Introduceti lungimea celei de-a doua laturi a triunghiului: ");
        sideTwo = scanner.nextInt();
        System.out.println("Introduceti lungiumea celei de-a treia laturi a triunghiului: ");
        sideThree = scanner.nextInt();
        Ex7(sideOne, sideTwo, sideThree);

        System.out.println("Exercitiul 8--------------------------------------------------------------------------------------------");
        int numarFactorial;
        System.out.println("Introduceti numarul: ");
        numarFactorial = scanner.nextInt();
        Ex8(numarFactorial);

        System.out.println("Exercitiul 9--------------------------------------------------------------------------------------------");
        String countryOne, countryTwo;
        System.out.println("Introduceti valoarea pentru primul String: ");
        countryOne = scanner.next();
        System.out.println("Introduceti valoarea pentru al doilea String: ");
        countryTwo = scanner.next();
        Ex9(countryOne, countryTwo);

        Ex10();

        Ex11();

        Ex12();

        Ex13();

        Ex14();

        Ex15();

        Ex16();

        System.out.println("Exercitiul 17--------------------------------------------------------------------------------------------");
        System.out.println("Introduceti valoarea booleana pentru hasUsername: ");
        boolean hasUsername = scanner.nextBoolean();
        System.out.println("Introduceti valoarea booleana pentru hasPassword: ");
        boolean hasPassword = scanner.nextBoolean();
        Ex17(hasUsername, hasPassword);

        Ex18();

        System.out.println("Exercitiul 19--------------------------------------------------------------------------------------------");
        int age;
        System.out.println("Introduceti varsta persoanei: ");
        age = scanner.nextInt();
        Ex19(age);

        System.out.println("Exercitiul 20--------------------------------------------------------------------------------------------");
        int a, b, c;
        System.out.println("Introduceti ptimul numar (a): ");
        a = scanner.nextInt();
        System.out.println("Introduceti al doilea numar (b): ");
        b = scanner.nextInt();
        System.out.println("Introduceti al treilea numar (c): ");
        c = scanner.nextInt();
        int celMaiMareNumar = main.Ex20(a, b, c);
        if (a == b && b == c)
            System.out.println("Numerele sunt egale, toate au valoarea " + celMaiMareNumar);
        else if (a == b && b > c) {
            System.out.println("Numerele a(" + celMaiMareNumar + ") si b(" + celMaiMareNumar + ") sunt egale si sunt mai mari decat numarul c" + "(" + c + ").");
        } else if (a == c && c > b) {
            System.out.println("Numerele a(" + celMaiMareNumar + ") si c(" + celMaiMareNumar + ") sunt egale si sunt mai mari decat numarul b" + "(" + b + ").");
        } else if (c == b && b > a) {
            System.out.println("Numerele b(" + celMaiMareNumar + ") si c(" + celMaiMareNumar + ") sunt egale si sunt mai mari decat numarul a" + "(" + a + ").");
        } else if (a > b && a > c) {
            System.out.println("Cel mai mare numar este a: " + celMaiMareNumar);
        } else if (b > a && b > c) {
            System.out.println("Cel mai mare numar este b: " + celMaiMareNumar);
        } else if (c > a && c > b) {
            System.out.println("Cel mai mare numar este c: " + celMaiMareNumar);
        }
        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

        System.out.println("Exercitiul 21--------------------------------------------------------------------------------------------");
        double score;
        System.out.println("Introduceti nota: ");
        score = scanner.nextDouble();
        System.out.println("Nota introdusa este: " + score);
        Ex21(score);

        scanner.close();

    }

    //1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI".
    // Check and print whether they refer to the same object.
    private static void Ex1() {

        System.out.println("Exercitiul 1--------------------------------------------------------------------------------------------");

        String StringOne = new String("OpenAI");
        String StringTwo = new String("OpenAI");

        if (StringOne == StringTwo)
            System.out.println("Se refera la acelasi obiect!" + " " + "(" + (StringOne == StringTwo) + ")");
        else System.out.println("Nu se refera la acelasi obiect!" + " " + "(" + (StringOne == StringTwo) + ")");

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");
    }

    // 2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
    // Use an equality operator to compare these two numbers and print the result.
    // Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison.
    // Print the result.
    private static void Ex2(int firstNumber, int secondNumber) {

        System.out.println("Primul numar este: " + firstNumber);

        System.out.println("Al doilea numar este: " + secondNumber);

        String firstString = new String("Ceva");

        String secondString = new String("Ceva");

        System.out.println("Primul string este: " + firstString);

        System.out.println("Al doilea string este: " + secondString);

        if (firstNumber > secondNumber)
            System.out.println("Primul numar" + " (" + firstNumber + ") " + "este mai mare decat al doilea numar" + " (" + secondNumber + ").");
        else if (secondNumber > firstNumber) {
            System.out.println("Al doilea numar" + " (" + secondNumber + ") " + "este mai mare decat primul numar" + " (" + firstNumber + ").");
        } else System.out.println("Numerele sunt egale!");

        if (firstString.equals(secondString))
            System.out.println("Valoarea / Rezultatul comparatiei dintre cele doua Stringuri este:" + " " + firstString.equals(secondString));

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");
    }

    // 3.  Write a Java program that declares an integer variable age with a value of 20.
    // Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".
    private static void Ex3() {

        System.out.println("Exercitiul 3--------------------------------------------------------------------------------------------");

        String a;

        int varsta = 20;

        a = (varsta >= 18) ? "I am adult!" : "I am not adult!";

        System.out.println(a);
        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    // 4.  Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
    // Use a ternary operator to determine the greater height and assign it to a variable maximumHeight.
    // Print the result.
    public int Ex4(int heightOne, int heightTwo) {

        int maximumHeight = (heightOne > heightTwo) ? heightOne : ((heightTwo == heightOne) ? heightOne : heightTwo);

        return maximumHeight;

    }

    //  5. Write a Java program to print the numbers from 1 to 10 using a for loop.
    //  As a next step, modify your program to print only the even numbers from 1 to 10.

    private static void Ex5() {

        System.out.println("Exercitiul 5--------------------------------------------------------------------------------------------");

        System.out.println("Numerele de la 1 la 10 folosind bucla for: ");
        for (int i = 1; i <= 10; i++)
            System.out.println(i);

        System.out.println("Numerele pare de la 1 la 10 modificand bucla for: ");
        for (int j = 1; j <= 10; j++)
            if (j % 2 == 0)
                System.out.println(j);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");
    }

    // 6. Write a Java program where you declare an integer variable temperature.
    // Assign a value to it and print "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
    private static void Ex6(int temp) {

        if (temp > 30)
            System.out.println("Hot!");
        else if (temp >= 20 && temp <= 30) {
            System.out.println("Warm.");
        } else System.out.println("Cold!");

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  7. Write a Java program that determines the type of a triangle based on its sides.
    //  Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
    //  Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
    private static void Ex7(int sideOne, int sideTwo, int sideThree) {

        String triangleType;

        triangleType = (sideOne == sideTwo && sideThree == sideOne) ? "Equilateral" : ((sideThree != sideTwo && sideOne != sideThree && sideOne != sideTwo) ? "Scalene" : "Isosceles");

        System.out.println("Tipul triunghiului este: " + triangleType);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    // 8. Write a Java program to calculate the factorial of a number using a for loop.
    // Declare an integer variable number and assign a value to it.
    // Then calculate and print the factorial of number.

    private static void Ex8(int numarFactorial) {

        int copieI = numarFactorial;
        int factorial = 1;
        for (; numarFactorial >= 1; numarFactorial--)
            factorial = factorial * numarFactorial;
        System.out.println("Factorialul numarului " + copieI + " " + "este: " + factorial);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA".
    //  Check if countryOne and countryTwo are equal using the equals() method and print the result.
    //  Then change the value of countryTwo to "UK" and check for equality again. Print the result.
    private static void Ex9(String countryOne, String countryTwo) {

        System.out.println("Cele doua Stringuri sunt egale: " + (countryOne.equals(countryTwo)));

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
    //  Add some elements to listOne and assign listOne to listTwo.
    //  Now modify listOne by adding a new element. Print both lists and observe the output.
    private static void Ex10() {

        System.out.println("Exercitiul 10--------------------------------------------------------------------------------------------");

        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();

        listOne.add("Portocale");
        listOne.add("Nectarine");
        listOne.add("Ananas");

        listTwo = listOne; // listTwo = listOne, face ca listTwo să fie o referință la aceeași listă la care face referire listOne.

        listOne.add("ACAB");

        System.out.println("Output-ul primei liste este: " + listOne);
        System.out.println("Output-ul celei de a doua liste este: " + listTwo);

        //Deoarece listOne și listTwo se referă la același obiect ArrayList, modificarea listOne se va reflecta și în listTwo.
        // Ambele liste vor afișa aceleași elemente, inclusiv noul element adaugat.
        //Acest lucru se întâmplă, deoarece listTwo nu este o copie separată a listOne, este doar o altă referire la același obiect din memorie.

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  11. Write a Java program where you declare four integer variables: a, b, c, and d.
    //  Assign them values of 10, 20, 30, and 40 respectively.
    //  Create two more variables additionResult and multiplicationResult.
    //  Set additionResult to the sum of a and b and multiplicationResult to the product of c and d.
    //  Print the values of additionResult and multiplicationResult.
    private static void Ex11() {

        System.out.println("Exercitiul 11--------------------------------------------------------------------------------------------");


        int a, b, c, d;

        a = 10;
        b = 20;
        c = 30;
        d = 40;

        int additionResult, multiplicationResult;

        additionResult = a + b;
        multiplicationResult = c * d;

        System.out.println("Valoarea adunarii este: " + additionResult);
        System.out.println("Valoarea inmultirii este: " + multiplicationResult);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");


    }

    //  12. Write a Java program where you declare an integer variable number with a value of 25.
    //  Use unary minus operator to change the sign of number and assign it to a variable negativeNumber.
    //  Print the values of number and negativeNumber.
    private static void Ex12() {

        System.out.println("Exercitiul 12--------------------------------------------------------------------------------------------");

        int number = 25;

        int negativeNumber = -number;

        System.out.println("Valoarea pozitiva a numarului este: " + number);
        System.out.println("Valoarea negativa a numarului este: " + negativeNumber);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively.
    //  Use the logical complement operator to negate the values of both variables and print the new values.
    private static void Ex13() {

        System.out.println("Exercitiul 13--------------------------------------------------------------------------------------------");

        boolean isRaining = true;
        boolean isSunny = false;

        boolean negatedIsRaining = !true;
        boolean negatedIsSunny = !false;

        System.out.println("Valoare originala isRaining: " + isRaining);
        System.out.println("Valoare originala isSunny: " + isSunny);
        System.out.println("Valoare negata isRaining: " + negatedIsRaining);
        System.out.println("Valoare negata isSunny: " + negatedIsSunny);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  14. Write a Java program where you declare an integer variable counter with a value of 0.
    //  Use the increment operator to increase the value of counter by 1 and then print the value.
    //  After that, use the decrement operator to decrease the value of counter by 1 and then print the value.
    private static void Ex14() {

        System.out.println("Exercitiul 14--------------------------------------------------------------------------------------------");

        int counter = 0;

        ++counter;

        System.out.println("Valoarea incrementata a contorului este: " + counter);

        --counter;

        System.out.println("Valoare decrementata a contorului este: " + counter);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  15. Write a Java program where you declare an integer variable total with a value of 100.
    //  Use the compound assignment operator to decrease the total by 20 and then print the value.
    //  Next, use another compound assignment operator to multiply the total by 2 and then print the value.
    private static void Ex15() {

        System.out.println("Exercitiul 15--------------------------------------------------------------------------------------------");

        int total = 100;

        total -= 20;

        System.out.println("Valoarea variabilei total dupa o scadere de 20 este egala cu: " + total);

        total *= 2;

        System.out.println("Valoarea variabilei total dupa o inmultire cu 2 este egala cu: " + total);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50.
    //  First, negate number, then take the absolute value, and finally increment it by 1.
    //  Print the result at each step.
    private static void Ex16() {
        System.out.println("Exercitiul 16--------------------------------------------------------------------------------------------");

        int number = 50;

        System.out.println("Numar original: " + number);

        int negateNumber = -number;

        System.out.println("Numarul negat: " + negateNumber);

        int absoluteValueNumber = Math.abs(negateNumber);

        System.out.println("Valoarea absoluta: " + absoluteValueNumber);

        int incrementedValueNumber = ++absoluteValueNumber;

        System.out.println("Valoarea incrementata: " + incrementedValueNumber);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  17. Write a Java program that simulates a simple authentication system.
    //  Declare a boolean variable hasUsername and hasPassword.
    //  Set up a series of logical conditions using these two variables that will check the following conditions:
    //
    //If both hasUsername and hasPassword are true, print "Authentication successful".
    //If either hasUsername or hasPassword is false, print "Authentication failed".
    //If hasUsername is true but hasPassword is false, print "Password is incorrect".
    private static void Ex17(boolean hasUsername, boolean hasPassword) {

        if (hasUsername == true && hasPassword == true)
            System.out.println("Authentication successful!");
        else if (hasUsername == true && hasPassword == false) {
            System.out.println("Password is incorrect!");
        } else if (hasUsername == false || hasPassword == false) {
            System.out.println("Authentication failed!");
        }

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  18. Write a Java program where you declare an integer array with 5 elements.
    //  Use a for loop to initialize the array such that each element is equal to its index incremented by 1.
    //  Then use another for loop to decrement each element by 1.
    //  Print the array before and after the decrement operation using a for-each loop.
    private static void Ex18() {

        System.out.println("Exercitiul 18--------------------------------------------------------------------------------------------");

        int[] array = new int[5];

        System.out.println("Vectorul initializat (inainte de decrementare) este: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int element : array)
            System.out.println(element + " ");

        System.out.println("Vectorul dupa decrementare este: ");

        for (int i = 0; i < array.length; i++) {
            --array[i];
        }

        for (int element1 : array)
            System.out.println(element1 + " ");

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  19. Write a Java program that takes an integer variable age as input.
    //  Use a ternary operator to classify the person into one of the following categories:
    //  "Child" (age < 12),
    //  "Teenager" (age between 12 and 17),
    //  "Adult" (age between 18 and 64),
    //  and "Senior" (age 65 and above). Print the resulting classification.
    private static void Ex19(int age) {

        String clasificare;

        clasificare = (age < 12) ? "Child" : ((age >= 12 && age <= 17) ? "Teenager" : (age >= 18 && age <= 64) ? "Adult" : "Senior");

        System.out.println("Persoana este clasificata in functie de varsta ca fiind: " + clasificare);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

    //  20. Write a Java program that takes three integer variables a, b, and c as input.
    //  Use nested ternary operators to find and print the largest number among the three.
    public int Ex20(int a, int b, int c) {

        int largestNumber;

        largestNumber = (a >= b && a >= c) ? a : ((b >= a && b >= c) ? b : c);

        return largestNumber;

    }

    // 21. Write a Java program that takes a double variable score representing a student’s score on a test.
    // Use a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following scale:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59
    //Print the resulting letter grade.
    private static void Ex21(double score) {

        String letterGrade;

        letterGrade = (score >= 90 && score <= 100) ? "Nota exprimata in Letter Grades este: A" : ((score >= 80 && score <= 89) ? "Nota exprimata in Letter Grades este: B" : (score >= 70 && score <= 79) ? "Nota exprimata in Letter Grades este: C" : (score >= 60 && score <= 69) ? "Nota exprimata in Letter Grades este: D" : ((score >= 0 && score <= 59) ? "Nota exprimata in Letter Grades este: F" : (score < 0) ? "Valoare prea mica introdusa (valoare gresita introdusa)!" : "Valoare prea mare introdusa (valoare gresita introdusa)!"));

        System.out.println(letterGrade);

        System.out.println("TERMINAT---------------------------------------------------------------------------------------------------------");

    }

}