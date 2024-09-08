package FitnessTrackingSystemOOPconcepts;

import java.util.ArrayList;
import java.util.Scanner;

public class FitnessTrackingSystem {

    static ArrayList<Running> runningDays = new ArrayList<>();
    static ArrayList<Weightlifting> liftingDays = new ArrayList<>();
    static ArrayList<Yoga> yogaDays = new ArrayList<>();
    static WeeklyGoal weeklyGoal;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean status = true;

        while (status) {

            System.out.println("Alegeti o optiune:");

            System.out.println("1 - Adauga zi de alergat.");
            System.out.println("2 - Adauga zi de lifting.");
            System.out.println("3 - Adauga zi de yoga.");
            System.out.println("4 - Setare goal saptamanal.");
            System.out.println("5 - Genereaza rezumat saptamanal.");
            System.out.println("6 - Cauta antrenamente.");
            System.out.println("7 - Inchidere program.");

            String alegere = scanner.nextLine();

            switch (alegere) {

                case "1" -> adaugaZiAlergat(scanner);

                case "2" -> adaugaZiLifting(scanner);

                case "3" -> adaugaZiYoga(scanner);

                case "4" -> adaugaGoal(scanner);

                case "5" -> genereazaRezumatSaptamanal();

                case "6" -> cautaAntrenamente(scanner);

                case "7" -> status = false;

                default -> System.out.println("Alegere incorecta!");

            }

        }

        scanner.close();
    }

    public static void adaugaZiAlergat(Scanner scanner) {

        System.out.print("Introduceti cati km ati alergat astazi: ");

        float distance = scanner.nextFloat();
        scanner.nextLine();

        Running running = new Running(distance);

        runningDays.add(running);
        System.out.println("Zi de alergat adaugata cu succes!");

    }

    public static void adaugaZiLifting(Scanner scanner) {

        System.out.print("Introduceti greutatea ridicata astazi (kg): ");

        float weight = scanner.nextFloat();
        scanner.nextLine();

        Weightlifting lifting = new Weightlifting(weight);

        liftingDays.add(lifting);
        System.out.println("Zi de lifting adaugata cu succes!");

    }

    public static void adaugaZiYoga(Scanner scanner) {

        System.out.print("Introduceti durata sesiunii de yoga astazi (ore): ");

        float duration = scanner.nextFloat();
        scanner.nextLine();

        Yoga yoga = new Yoga(duration);

        yogaDays.add(yoga);
        System.out.println("Zi de yoga adaugata cu succes!");

    }

    public static void adaugaGoal(Scanner scanner) {

        System.out.println("Setati goal-ul pentru fiecare activitate. Daca nu doriti sa setati un goal, introduceti 0.");

        System.out.print("Goal saptamanal pentru alergat (km): ");
        float goalRunning = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Goal saptamanal pentru lifting (kg): ");
        float goalLifting = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Goal saptamanal pentru yoga (ore): ");
        float goalYoga = scanner.nextFloat();
        scanner.nextLine();

        weeklyGoal = new WeeklyGoal(goalRunning, goalLifting, goalYoga);

        System.out.println("Goal saptamanal setat cu succes!");
    }

    public static void genereazaRezumatSaptamanal() {

        System.out.println("Rezumatul saptamanal:");

        float totalDistance = 0, totalWeight = 0, totalYogaTime = 0;

        for (Running run : runningDays) {

            totalDistance += run.distance;

        }

        for (Weightlifting lift : liftingDays) {

            totalWeight += lift.weightLifted;

        }

        for (Yoga yoga : yogaDays) {

            totalYogaTime += yoga.duration;

        }

        System.out.println("Total distanta alergata: " + totalDistance + " km.");
        System.out.println("Total greutate ridicata: " + totalWeight + " kg.");
        System.out.println("Total timp yoga: " + totalYogaTime + " ore.");

        if (weeklyGoal != null) {

            System.out.println("Goal alergat: " + weeklyGoal.goalRunning + " km.");
            System.out.println("Goal lifting: " + weeklyGoal.goalLifting + " kg.");
            System.out.println("Goal yoga: " + weeklyGoal.goalYoga + " ore.");

            if (totalDistance == weeklyGoal.goalRunning) {

                System.out.println("Felicitari! Ati atins goal-ul pentru alergat.");

            } else if (totalDistance > weeklyGoal.goalRunning){

                System.out.println("Felicitari! Ati depasit goal-ul pentru alergat.");

            } else {

                System.out.println("Nu ati atins goal-ul pentru alergat.");

            }

            if (totalWeight == weeklyGoal.goalLifting) {

                System.out.println("Felicitari! Ati atins goal-ul pentru ridicat greutati.");

            } else if (totalWeight > weeklyGoal.goalLifting){

                System.out.println("Felicitari! Ati depasit goal-ul pentru greutati.");

            } else {

                System.out.println("Nu ati atins goal-ul pentru ridicat greutati.");

            }

            if (totalYogaTime == weeklyGoal.goalYoga) {

                System.out.println("Felicitari! Ati atins goal-ul pentru yoga.");

            } else if (totalYogaTime > weeklyGoal.goalYoga){

                System.out.println("Felicitari! Ati depasit goal-ul pentru yoga.");

            } else {

                System.out.println("Nu ati atins goal-ul pentru yoga.");

            }

        } else {

            System.out.println("Nu a fost setat niciun goal pentru aceasta saptamana.");

        }

    }

    public static void cautaAntrenamente(Scanner scanner) {

        System.out.println("Introduceti tipul de activitate pentru cautare (1 - Alergat, 2 - Lifting, 3 - Yoga): ");

        int optiune = scanner.nextInt();
        scanner.nextLine();

        switch (optiune) {

            case 1 -> {

                System.out.println("Antrenamente alergat:");
                int zi = 1;

                for (Running run : runningDays) {

                    System.out.println("Distanta alergata in ziua " + zi + " (km): " + run.distance);
                    zi++;

                }

            }

            case 2 -> {

                System.out.println("Antrenamente lifting:");
                int zi = 1;

                for (Weightlifting lift : liftingDays) {

                    System.out.println("Greutate ridicata in ziua " + zi + " (kg): " + lift.weightLifted);
                    zi++;

                }

            }

            case 3 -> {

                System.out.println("Antrenamente yoga:");
                int zi = 1;

                for (Yoga yoga : yogaDays) {

                    System.out.println("Durata yoga in ziua " + zi + " (ore): " + yoga.duration);
                    zi++;

                }

            }

            default -> System.out.println("Optiune invalida!");
        }

    }

}
