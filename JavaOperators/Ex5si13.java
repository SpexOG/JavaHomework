package JavaOperators;

import java.util.Scanner;

public class Ex5si13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducere valoare variabila a: ");

        int a = scanner.nextInt();

        System.out.println("Introducere valoare variabila b: ");

        int b = scanner.nextInt();

        System.out.println("Introducere valoare variabila c: ");

        int c = scanner.nextInt();

        System.out.println("Introducere valoare variabila d: ");

        int d = scanner.nextInt();

        a += b;

        b *= d;

        c -= a;

        d /= c;

        System.out.println("Valoarea lui a dupa folosirea operatorului de atribuire compus += este: " + a);
        System.out.println("Valoarea lui b dupa folosirea operatorului de atribuire compus *= este: " + b);
        System.out.println("Valoarea lui c dupa folosirea operatorului de atribuire compus -= este: " + c);
        System.out.println("Valoarea lui d dupa folosirea operatorului de atribuire compus /= este: " + d);

        System.out.println("introduceti pretul initial al produsului: ");

        double pretInitial = scanner.nextDouble();

        System.out.println("Pretul initial al produsului este de " + pretInitial + " " + "RON");

        System.out.println("Introduceti procentul de reducere: ");

        double procentReducere = scanner.nextDouble();

        System.out.println("Reducerea este de " + procentReducere + "%");

        double valoareReducere = (procentReducere / 100) * pretInitial;

        pretInitial -= valoareReducere;

        System.out.println("Valoarea produsului dupa reducere este: " + pretInitial + " " + "RON");

        scanner.close();
    }
}
