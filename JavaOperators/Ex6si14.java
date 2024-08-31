package JavaOperators;

import java.util.Scanner;

public class Ex6si14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primul numar este: ");

        double primulNumar = scanner.nextDouble();

        System.out.println("Al doilea numar este: ");

        double alDoileaNumar = scanner.nextDouble();

        if (primulNumar > alDoileaNumar)
            System.out.println("Primul numar (" + primulNumar + ") este mai mare decat al doilea numar (" + alDoileaNumar + ")!");
        else if (primulNumar < alDoileaNumar) {
            System.out.println("Primul numar (" + primulNumar + ") este mai mic decat al doilea numar (" + alDoileaNumar + ")!");
        }else
            System.out.println("Primul numar (" + primulNumar + ") este egal cu al doilea numar (" + alDoileaNumar + ")!");

        System.out.println("Introdu numarul pentru verificarea acestuia la apartenenta intervalului 99 - 500: ");

        int numar = scanner.nextInt();

        if (numar >= 99 && numar <= 500)
            System.out.println("Numarul introdus se afla in intervalul 99 - 500!");
        else
            System.out.println("Numarul introdus nu se afla in intervalul 99 - 500!");

        scanner.close();
    }
}
