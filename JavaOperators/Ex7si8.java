package JavaOperators;

import java.util.Scanner;

public class Ex7si8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti valoarea variabilei de tip int: ");

        int a = scanner.nextInt();

        System.out.println("Introduceti valaorea variabilei de tip double: ");

        double b = scanner.nextDouble();

        System.out.println("Adunare: " + a + " " + "+" + " " + b + " " + "=" + " " + (a+b));
        System.out.println("Scadere: " + a + " " + "-" + " " + b + " " + "=" + " " + (a-b));
        System.out.println("Inmultire: " + a + " " + "*" + " " + b + " " + "=" + " " + (a*b));
        System.out.println("Impartire: " + a + " " + "/" + " " + b + " " + "=" + " " + (a/b));
        System.out.println("Modulo: " + a + " " + "%" + " " + b + " " + "=" + " " + (a%b));
        System.out.println("Când se efectuează operații aritmetice între tipuri de date diferite (în acest caz, între int și double), Promoția Numerică transformă automat tipul inferior într-un tip superior pentru a evita pierderea de date și pentru a obține un rezultat precis. Rezultatul va fi deasemenea de tip double.");

        System.out.println("Introduceti prima valoare a unei variabile de tip byte: ");

        byte c = scanner.nextByte();

        System.out.println("Introduceti a doua valoare pentru a doua variabila de tip byte: ");

        byte d = scanner.nextByte();

        byte suma = (byte)(c + d);

        System.out.println("Suma celor 2 variabile de tip byte este: " + suma);

        System.out.println("În Java, operatorii aritmetici (+, -, *, /) efectuează promoția numerică automată a operandului la cel puțin tipul int atunci când se aplică la tipuri de date mai mici, cum ar fi byte, short, sau char. Chiar dacă byte1 și byte2 sunt de tip byte, rezultatul adunării lor este implicit promovat la int.\n" +
                "Prin urmare, atunci când încercăm să stocăm rezultatul într-o variabilă de tip byte (byte result = byte1 + byte2;), se va genera o eroare de compilare, deoarece int nu poate fi automat convertit în byte fără pierderi de date. Pentru a rezolva problema, trebuie să facem un cast explicit la byte: (byte) (byte1 + byte2).\n" +
                "Acest cast forțează conversia rezultatului din int în byte. Un byte în Java poate stoca valori între -128 și 127. Dacă suma depășește acest interval, rezultatul va \"depăși\" (overflow) și va da un rezultat neașteptat datorită conversiei în byte. Astfel, daca am avea: 100 + 30 = 130. Deoarece 130 depășește intervalul maxim pentru un byte (care este 127), rezultatul va fi -126, deoarece byte-ul \"revine\" la începutul intervalului său (-128) și continuă de acolo.");

        scanner.close();
    }
}
