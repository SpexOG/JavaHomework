package OOP_Concepts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CollegeManagementSystem {

    static ArrayList<Students> listaStudenti = new ArrayList<>();
    static ArrayList<Proffesors> listaProfesori = new ArrayList<>();
    static ArrayList<Courses> listaCursuri = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean status = true;

        while (status) {

            System.out.println("Alegeti o optiune: ");

            System.out.println("1 - Afisati detaliile studentilor.");
            System.out.println("2 - Afisati detaliile profesorilor.");
            System.out.println("3 - Afisati detaliile Cursurilor.");
            System.out.println("4 - Adaugati un student nou.");
            System.out.println("5 - Adaugati un profesor nou.");
            System.out.println("6 - Adaugati un curs nou.");
            System.out.println("7 - Inchideti programul.");

            System.out.print("Introduceti numarul optiunii: ");

            String alegere = scanner.nextLine();

            switch (alegere) {

                case "1" -> afisareStudenti();

                case "2" -> afisareProfesori();

                case "3" -> afisareCursuri();

                case "4" -> adaugareStudent(scanner);

                case "5" -> adaugareProfesor(scanner);

                case "6" -> adaugareCurs(scanner);

                case "7" -> status = false;

                default -> System.out.println("Optiune invalida!");

            }

        }

        scanner.close();

    }

    public static void afisareStudenti() {

        if (listaStudenti.isEmpty()) {

            System.out.println("Nu exista studenti inregistrati.");

        } else {
            for (Students student : listaStudenti) {

                student.studentDetails();

                System.out.println("........................................");

            }

        }

    }

    public static void afisareProfesori() {

        if (listaProfesori.isEmpty()) {

            System.out.println("Nu exista profesori inregistrati.");

        } else {

            for (Proffesors profesor : listaProfesori) {

                profesor.proffesorDetails();

                System.out.println("........................................");

            }

        }

    }

    public static void afisareCursuri() {

        if (listaCursuri.isEmpty()) {

            System.out.println("Nu exista cursuri inregistrate.");

        } else {

            for (Courses curs : listaCursuri) {

                curs.courseDetails();

                System.out.println("........................................");

            }

        }

    }

    public static void adaugareStudent(Scanner scanner) {

        System.out.println("Introduceti detaliile noului student: ");

        System.out.print("Prenume: ");
        String firstName = scanner.nextLine();

        System.out.print("Nume: ");
        String lastName = scanner.nextLine();

        System.out.print("Sex: ");
        String sex = scanner.nextLine();

        System.out.print("Varsta: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Data nasterii (yyyy-mm-dd): ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        System.out.print("CNP: ");
        long CNP = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Adresa: ");
        String address = scanner.nextLine();

        Students studentNou = new Students(firstName, lastName, sex, age, dateOfBirth, CNP, address);
        listaStudenti.add(studentNou);

        System.out.println("Student adaugat cu succes!");

    }

    public static void adaugareProfesor(Scanner scanner) {

        System.out.println("Introduceti detaliile noului profesor: ");

        System.out.print("Prenume: ");
        String firstName = scanner.nextLine();

        System.out.print("Nume: ");
        String lastName = scanner.nextLine();

        System.out.print("Sex: ");
        String sex = scanner.nextLine();

        System.out.print("Varsta: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Data nasterii (yyyy-mm-dd): ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        System.out.print("CNP: ");
        long CNP = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Adresa: ");
        String address = scanner.nextLine();

        Proffesors profesorNou = new Proffesors(firstName, lastName, sex, age, dateOfBirth, CNP, address);
        listaProfesori.add(profesorNou);

        System.out.println("Profesor adaugat cu succes!");

    }

    public static void adaugareCurs(Scanner scanner) {

        System.out.println("Introduceti detaliile noului curs: ");

        System.out.print("Introduceti numele cursului: ");
        String name = scanner.nextLine();

        System.out.print("Introduceti programul cursului: ");
        String schedule = scanner.nextLine();

        System.out.print("Introduceti durata cursului: ");
        String duration = scanner.nextLine();

        System.out.print("Introduceti descrierea cursului: ");
        String description = scanner.nextLine();

        afisareProfesori();

        System.out.println("Selectati indexul profesorului pentru a-l asigna cursului (incepand de la 0): ");

        int indexProfesor = scanner.nextInt();
        scanner.nextLine();

        if (indexProfesor >= 0 && indexProfesor < listaProfesori.size()) {

            Proffesors assignedProffesor = listaProfesori.get(indexProfesor);
            Courses cursNou = new Courses(name, schedule, duration, description, assignedProffesor);
            listaCursuri.add(cursNou);
            System.out.println("Curs adaugat cu succes!");

        } else {

            System.out.println("Index invalid pentru profesor.");

        }

    }

}