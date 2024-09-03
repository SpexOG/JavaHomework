package Recapitulare1;

import java.util.Random;
import java.util.Scanner;

public class Recapitulare1 {
    public static void main(String[] args) {

        boolean continuaJoc = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Introduceti numarul de incercari: ");
            int incercari = scanner.nextInt();
            System.out.println("Ai " + incercari + " incercari sa ghicesti numarul corect!");
            System.out.print("Introduceti numarul pe care incercati sa il ghiciti: ");
            ghicesteNumarul(scanner, incercari);
            System.out.print("Doriti sa mai jucati odata? (Introduceti da sau nu) : ");
            String raspuns = scanner.nextLine();
            if (raspuns.equalsIgnoreCase("da")) {
                continuaJoc = true;
            } else if (raspuns.equalsIgnoreCase("nu")) {
                continuaJoc = false;
            }
        } while (continuaJoc == true);

        scanner.close();

    }

    //  Ghicește numărul
    //  Creați un joc simplu în care utilizatorul trebuie să ghicească un număr aleatoriu generat de calculator.
    //  Programul va oferi feedback pentru fiecare încercare, indicând dacă numărul ghicit este prea mare sau prea mic.
    //  Jocul continuă până când utilizatorul ghicește corect numărul.
    //  Utilizați clasa Random pentru a genera un număr aleatoriu între 1 și 100.
    //  Utilizați clasa Scanner pentru a citi numerele introduse de utilizator de la tastatură.
    //  Implementați o buclă care continuă până când utilizatorul ghicește corect numărul.
    //  Odată ce numărul a fost ghicit corect, afișați un mesaj de felicitare și ieșiți din buclă.
    //  Oferiți utilizatorului opțiunea de a juca din nou sau de a ieși din program.
    //
    //  Pentru cei care termina foarte repede implementarea pentru cele de mai sus pot lucra la o varianta mai extensa a jocului "Ghicește numărul" cu încercări limitate și scor.
    //  Setarea numărului maxim de încercări:
    //  Stabiliți un număr maxim de încercări, de exemplu, 10
    //  Afișați utilizatorului numărul de încercări rămase după fiecare ghicire
    //  Calculul punctajului:
    //  Scorul inițial este egal cu numărul maxim de încercări
    //  Pentru fiecare ghicire corectă, utilizatorul primește un scor egal cu numărul de încercări rămase.
    //  Feedback și finalizare:
    //  Dacă utilizatorul ghicește numărul înainte de epuizarea încercărilor, afișați scorul obținut.
    //  Dacă utilizatorul nu reușește să ghicească numărul după toate încercările, afișați un mesaj de încurajare și dezvăluiți numărul corect.
    private static void ghicesteNumarul(Scanner scanner, int incercari) {

        scanner.nextLine();
        Random random = new Random();
        int numarRandom = random.nextInt(100) + 1;
        boolean ghicit = false;
        while (!ghicit) {
            int numar = scanner.nextInt();
            scanner.nextLine();
            incercari--;
            if (numar == numarRandom) {
                System.out.println("Felicitari! Ai ghicit numarul! (" + numarRandom + ")");
                System.out.println("Scorul tau este: " + (incercari + 1) + ".");
                ghicit = true;
                continue;
            }
            if (numar < numarRandom) {
                if (incercari > 1) {
                    System.out.println("Numarul este mai MARE decat " + numar + " ! Mai incearca!");
                    System.out.println("Mai ai " + incercari + " incercari!");
                }else if (incercari == 1){
                    System.out.println("Numarul este mai MARE decat " + numar + " ! Mai incearca!");
                    System.out.println("Mai ai o incercare!");
                }
            } else {
                if (incercari > 1) {
                    System.out.println("Numarul este mai MIC decat " + numar + " ! Mai incearca!");
                    System.out.println("Mai ai " + incercari + " incercari!");
                }else if (incercari == 1){
                    System.out.println("Numarul este mai MIC decat " + numar + " ! Mai incearca!");
                    System.out.println("Mai ai o incercare!");
                }
            }
            if (incercari == 0) {
                System.out.println("Nu mai ai incercari!");
                System.out.println("Scorul tau este: " + incercari + ".");
                System.out.println("Nu te descuraja! Mai poti juca inca odata. Numarul corect era: " + numarRandom + ".");
                break;
            }
        }
    }
}
