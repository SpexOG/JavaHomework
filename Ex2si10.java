import java.util.Scanner;

public class Ex2si10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducere variabila: ");

        int variabila = scanner.nextInt();

        int a = variabila ++;
        int b = ++variabila;
        int c = variabila --;
        int d = --variabila;

        System.out.println("Valoare variabila dupa prima incrementare: " + a);
        System.out.println("Valoare variabila dupa a doua incrementare: " + b);
        System.out.println("Valoare variabila dupa prima decrementare: " + c);
        System.out.println("Valoare variabila dupa a doua decrementare: " + d);

        System.out.println("Introduceti numarul intreg: ");

        int numarIntreg = scanner.nextInt();

        System.out.println("Inversarea semnului numarului intreg: " + (-numarIntreg));

        scanner.close();
    }
}
