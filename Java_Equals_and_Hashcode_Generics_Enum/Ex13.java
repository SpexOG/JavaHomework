package Java_Equals_and_Hashcode_Generics_Enum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<DAYS, String> map = new HashMap<>();
        boolean running = true;

        while (running) {
            System.out.println("Selectati optiunea: ");
            System.out.println("1 - Adaugati activitati");
            System.out.println("2 - Stergeti activitati");
            System.out.println("3 - Afisare program");
            System.out.println("0 - Iesire");

            int optiune = scanner.nextInt();
            scanner.nextLine();

            switch (optiune) {
                case 1 -> {
                    System.out.println("Selectati ziua pentru a adauga activitatea: ");
                    showDaysMenu();
                    int zi = scanner.nextInt();
                    scanner.nextLine();
                    DAYS day = getDayFromInput(zi);
                    if (day != null) {
                        System.out.println("Introdu activitatea pentru " + day + ": ");
                        String activitate = scanner.nextLine();
                        map.put(day, activitate);
                    } else {
                        System.out.println("Zi invalida.");
                    }
                }

                case 2 -> {
                    System.out.println("Selectati ziua pentru a sterge activitatea: ");
                    showDaysMenu();
                    int zi = scanner.nextInt();
                    scanner.nextLine(); // Consuma newline
                    DAYS day = getDayFromInput(zi);
                    if (day != null && map.containsKey(day)) {
                        map.remove(day);
                        System.out.println("Activitatea din ziua de " + day + " a fost stearsa.");
                    } else {
                        System.out.println("Zi invalida sau nicio activitate pentru a sterge.");
                    }
                }

                case 3 -> {
                    System.out.println("Afisare program: ");
                    if (map.isEmpty()) {
                        System.out.println("Nu exista activitati programate.");
                    } else {
                        for (DAYS day : map.keySet()) {
                            String activitate = map.get(day);
                            System.out.println("In ziua de " + day + " aveti activitatea: " + activitate);
                        }
                    }
                }

                case 0 -> {
                    running = false;
                    System.out.println("Program incheiat.");
                }

                default -> System.out.println("Optiune invalida.");
            }
        }

        scanner.close();
    }

    private static void showDaysMenu() {
        System.out.println("1 - Luni");
        System.out.println("2 - Marti");
        System.out.println("3 - Miercuri");
        System.out.println("4 - Joi");
        System.out.println("5 - Vineri");
        System.out.println("6 - Sambata");
        System.out.println("7 - Duminica");
    }

    private static DAYS getDayFromInput(int i) {
        return switch (i) {
            case 1 -> DAYS.LUNI;
            case 2 -> DAYS.MARTI;
            case 3 -> DAYS.MIERCURI;
            case 4 -> DAYS.JOI;
            case 5 -> DAYS.VINERI;
            case 6 -> DAYS.SAMBATA;
            case 7 -> DAYS.DUMINICA;
            default -> null;
        };

    }

}

enum DAYS {
    LUNI,
    MARTI,
    MIERCURI,
    JOI,
    VINERI,
    SAMBATA,
    DUMINICA
}
