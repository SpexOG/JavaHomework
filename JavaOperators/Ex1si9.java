package JavaOperators;

import java.util.Scanner;

public class Ex1si9 {
    public static void main(String[] args) {

        double arieDreptunghi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti cele doua numere");
        System.out.println("Introduceti primul numar: ");

        double primulNumar = scanner.nextDouble();

        System.out.println("Introduceti al doilea numar: ");

        double alDoileaNumar = scanner.nextDouble();

        System.out.println("Adunearea celor doua numere are rezultatul: " + (primulNumar + alDoileaNumar));
        System.out.println("Scaderea celor doua numere are rezultatul: " + (primulNumar - alDoileaNumar));
        System.out.println("Inmultirea celor doua numere are rezultatul: " + (primulNumar * alDoileaNumar));
        System.out.println("Impartirea celor doua numere are rezultatul: " + (primulNumar / alDoileaNumar));
        System.out.println("Modulo celor doua numere are rezultatul: " + (primulNumar % alDoileaNumar));

        System.out.println("Introduceti lungimea si latimea dreptunghiului pentru calcularea ariei acestuia: ");
        System.out.println("Lungimea dreptunghiului: ");

        double lungimeDreptunghi = scanner.nextDouble();

        System.out.println("Latimea dreptunghiului: ");

        double latimeDreptunghi = scanner.nextDouble();

        if (lungimeDreptunghi > latimeDreptunghi)
        System.out.println("Aria dreptunghiului este egala cu " + (lungimeDreptunghi * latimeDreptunghi) + " " + "unitati patrate.");
        else
            System.out.println("Latimea nu poate fi mai mare decat lungimea!");

        scanner.close();
    }
}
