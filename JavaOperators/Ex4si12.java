package JavaOperators;

import java.util.Scanner;

public class Ex4si12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i=0;
        while (i < 10){
            i++;
            System.out.println(i);
            if (i == 10){
                while (i > 1){
                    i--;
                    System.out.println(i);
                }break;
            }
        }

        System.out.println("Introducere numar pentru incrementare si decrementare: ");

        int numar = scanner.nextInt();

        System.out.println("Numar incrementat: " + ++numar);
        System.out.println("Numar decrementat: " + --numar);



        scanner.close();
    }

}
