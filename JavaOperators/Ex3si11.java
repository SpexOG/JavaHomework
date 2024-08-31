package JavaOperators;

import java.util.Scanner;

public class Ex3si11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducere numar: ");

        int numar = scanner.nextInt();
        boolean paritate = numar < 0;

        if (!paritate && numar != 0)
            System.out.println("Numarul este pozitiv!");
        else if (numar == 0) {
            System.out.println("Numarul este 0!");
        }else
            System.out.println("Numarul este negativ!");

        System.out.println("Introduceti prima intrare booleana: ");

        boolean primulBoolean = scanner.nextBoolean();

        System.out.println("Introduceti a doua intrare booleana: ");

        boolean alDoileaBoolean = scanner.nextBoolean();

        boolean negarePrimulBoolean = !primulBoolean;
        boolean negareAlDoileaBoolean = !alDoileaBoolean;

        System.out.println("Negarea primului boolean: " + negarePrimulBoolean);
        System.out.println("Negare al doilea boolean: " + negareAlDoileaBoolean);

        scanner.close();
    }
}
