package ArraysVsArrayListVsLinkedListAndWrapperClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Arrays_vs_ArrayList_vs_LinkedList_And_Wrapper_Classes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        shoppingList(scanner);

        christmasWishlist(scanner);

        Ex3(scanner);

        evenOdd(scanner);

        cityNames(scanner);

        studentNames(scanner);

        fruitsName(scanner);

        movieTitles(scanner);

        binaryNumber(scanner);

        personalDiary(scanner);

        scanner.close();

    }

    // Create a shopping list with Array and print the values
    private static void shoppingList(Scanner scanner) {

        System.out.println();
        System.out.println("EX1_________________________________________________________________________________________");
        System.out.println();

        System.out.println("Introduceti numarul de articole: ");

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] shoppingList = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("v[" + (i + 1) + "]= ");
            shoppingList[i] = scanner.nextLine();
        }

        System.out.println("Shopping list: " + Arrays.toString(shoppingList));

        System.out.println();
        System.out.println("TERMINAT____________________________________________________________________________________");

    }

    // Create a wishlist for christmas with ArrayList and print the values
    private static void christmasWishlist(Scanner scanner) {

        System.out.println();
        System.out.println("EX2_________________________________________________________________________________________");
        System.out.println();

        System.out.println("Introduceti numarul de cadouri pentru lista de dorinte pentru Craciun: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> christmasWishlist = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("L[" + (i + 1) + "]= ");
            christmasWishlist.add(scanner.nextLine());
        }

        System.out.println("Lista de dorinte pentru Craciun este: " + christmasWishlist);


        System.out.println();
        System.out.println("TERMINAT____________________________________________________________________________________");
    }

    // Create:
    //  -> 2 empty ArrayLists: studentList and graduateStudentList
    //  -> populate studentList with 10 students
    //  -> copy values from studentList to graduateStudentList
    //  -> iterate through graduateStudentList and print each graduated student
    private static void Ex3(Scanner scanner) {

        System.out.println();
        System.out.println("EX3_________________________________________________________________________________________");
        System.out.println();

        ArrayList<String> studentList = new ArrayList<>(10);
        ArrayList<String> graduateStudentList = new ArrayList<>();

        System.out.println("Introduceti 10 studenti: ");

        int n = 10;

        while (n <= 10 && n >= 1) {
            studentList.add(scanner.nextLine());
            n -= 1;
        }

        graduateStudentList.addAll(studentList);

        for (int i = 0; i < graduateStudentList.size(); i++) {
            System.out.println("Studentii care au promovat sunt: " + graduateStudentList.get(i));
        }

        System.out.println();
        System.out.println("TERMINAT____________________________________________________________________________________");
    }

    // Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
    private static void evenOdd(Scanner scanner) {

        System.out.println();
        System.out.println("EX4_________________________________________________________________________________________");
        System.out.println();

        System.out.println("Introduceti cele 10 numere: ");

        int[] numbers = new int[10];

        int nrPare = 0;
        int nrImare = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("v[" + (i + 1) + "]=");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                nrPare += 1;
            } else {
                nrImare += 1;
            }
        }

        System.out.println("In vector avem " + nrPare + " numere pare si " + nrImare + " numere impare!");

        System.out.println();
        System.out.println("TERMINAT____________________________________________________________________________________");

    }

    // Create an ArrayList that stores city names.
    // Add at least five city names initially.
    // Then, prompt the user to add a city name.
    // If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.
    private static void cityNames(Scanner scanner) {

        System.out.println();
        System.out.println("EX5_________________________________________________________________________________________");
        System.out.println();

        System.out.println("Introduceti numarul de orase (minim 5): ");

        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> cityNames = new ArrayList<>();

        if (n < 5) {
            System.out.println("Adaugati mai multe orase!");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Orasul [" + (i + 1) + "]= ");
                String numeOras = scanner.nextLine();
                if (cityNames.contains(numeOras)) {
                    System.out.println("Este duplicat!");
                    break;
                } else {
                    cityNames.add(numeOras);
                }
            }
            System.out.println("Lista cu nunmele oraselor este: " + cityNames);
        }

        System.out.println();
        System.out.println("TERMINAT____________________________________________________________________________________");

    }

    // Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list.
    // If it does, remove that name from the list.
    private static void studentNames(Scanner scanner) {

        System.out.println();
        System.out.println("EX6_________________________________________________________________________________________");
        System.out.println();

        System.out.println("Introduceti numarul de studenti din lista: ");

        int n = scanner.nextInt();
        scanner.nextLine();

        LinkedList<String> studentNames = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("L[" + (i + 1) + "]=");
            studentNames.add(scanner.nextLine());
        }
        System.out.println("Lista cu studenti este: " + studentNames);

        System.out.print("Introduceti numele Studentului pe care doriti sa il stergeti din lista: ");
        String student = scanner.nextLine();

        if (studentNames.contains(student)) {
            studentNames.remove(student);
            System.out.println("Lista actualizata este: " + studentNames);
        } else {
            System.out.println("Studentul nu se afla in lista!");
        }

        System.out.println();
        System.out.println("TERMINAT____________________________________________________________________________________");

    }

    // Create an ArrayList containing names of fruits.
    // Implement a custom sorting mechanism to arrange them in descending order based on their length.
    // If two fruits have the same length, sort them in alphabetical order.
    private static void fruitsName(Scanner scanner) {

        System.out.println();
        System.out.println("EX7_________________________________________________________________________________________");
        System.out.println();

        System.out.print("Introduceti numarul de fructe: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> fruitNames = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Fruct[" + (i + 1) + "]= ");
            fruitNames.add(scanner.nextLine());
        }

        for (int i = 0; i < (n - 1); i++) {
            for (int j = i + 1; j < n; j++) {
                String fruct1 = fruitNames.get(i);
                String fruct2 = fruitNames.get(j);

                if (fruct1.length() < fruct2.length()) {
                    fruitNames.set(i, fruct2);
                    fruitNames.set(j, fruct1);
                }
                if (fruct1.length() == fruct2.length() && fruct1.compareToIgnoreCase(fruct2) > 0) {
                    fruitNames.set(i, fruct2);
                    fruitNames.set(j, fruct1);
                }
            }
        }

        System.out.println("Lista cu fructe este: " + fruitNames);


        System.out.println();
        System.out.println("TERMINAT____________________________________________________________________________________");
    }

    // In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists.
    // If it does, print out its position in the array.
    private static void movieTitles(Scanner scanner) {

        System.out.println();
        System.out.println("EX8_________________________________________________________________________________________");
        System.out.println();

        System.out.print("Introduceti numarul de filme: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] movieTitles = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Film[" + i + "]=");
            movieTitles[i] = scanner.nextLine();
        }

        Arrays.sort(movieTitles);

        System.out.println("Filmele sortate sunt: ");
        for (int i = 0; i < n; i++) {
            System.out.println(movieTitles[i]);
        }
        System.out.println();

        System.out.println("Introduceti numele filmului pe care il cautati: ");
        String cautare = scanner.nextLine();

        boolean filmGasit = false;

        for (int i = 0; i < n; i++) {
            if (movieTitles[i].equalsIgnoreCase(cautare)) {
                System.out.println("Filmul  cautat, se afla in array, pe pozitia: " + i);
                filmGasit = true;
                break;
            }
        }

        if (!filmGasit) {
            System.out.println("Filmul cautat nu se afla printre titlurile filmelor existente!");
        }

        System.out.println();
        System.out.println("TERMINAT____________________________________________________________________________________");

    }

    // Accept a string representation of a binary number, e.g., "1011".
    // Convert this string into an Integer using the Integer wrapper class and the method that parses binary.
    // Print out the decimal representation of this number.

    private static void binaryNumber(Scanner scanner) {

        System.out.println();
        System.out.println("EX9_________________________________________________________________________________________");
        System.out.println();

        System.out.println("Introduceti numarul in binar: ");
        String str = scanner.nextLine();

        Integer decimalNr = Integer.parseInt(str, 2);

        System.out.println("Numarul convertit in deccimal este: " + decimalNr);


        System.out.println();
        System.out.println("TERMINAT____________________________________________________________________________________");

    }

    //  Write a program that manages a personal diary using an ArrayList.
    //  Each entry in the diary is a string that contains a date in the format "YYYY-MM-DD" followed by a colon and the diary entry for that day.
    //  Your program should allow the user to:
    //  Add a new entry (but ensure there's no duplicate date).
    //  Edit an existing entry based on the date.
    //  Delete an entry by date.
    //  Display all entries in reverse chronological order (latest first).
    //
    //  Ensure that all these operations are efficient, especially the addition of new entries, which should keep the list sorted without resorting it every time.
    private static void personalDiary(Scanner scanner) {

        System.out.println();
        System.out.println("EX10________________________________________________________________________________________");
        System.out.println();

        ArrayList<String> diary = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (true) {
            System.out.println();
            System.out.println("Alegeti o optiune:");
            System.out.println("1 -> Adaugati o intrare in jurnal.");
            System.out.println("2 -> Editati o intrare.");
            System.out.println("3 -> Stergeti o intrare.");
            System.out.println("4 -> Afisati intraile in ordine inversa.");
            System.out.println("5 -> Iesiti din program.");
            System.out.println();

            String optiune = scanner.nextLine();

            switch (optiune) {
                case "1" -> {
                    System.out.println();
                    System.out.print("Introduceti data in format \"yyyy-MM-dd\": ");
                    String data = scanner.nextLine();
                    LocalDate date = LocalDate.parse(data, formatter);
                    boolean duplicat = false;

                    for (String intrare : diary) {
                        if (intrare.startsWith(data)) {
                            System.out.println();
                            System.out.println("Duplicat de data!");
                            System.out.println();
                            duplicat = true;
                            break;
                        }
                    }

                    if (!duplicat) {
                        System.out.println();
                        System.out.print("Introduceti continutul intrarii jurnalului: ");
                        String continut = scanner.nextLine();
                        String intrareJurnal = date + " : " + continut;
                        diary.add(intrareJurnal);
                        System.out.println();
                        System.out.println("Intrare adaugata!");
                        System.out.println();
                    }
                }
                case "2" -> {
                    System.out.println();
                    System.out.println("Introduceti data intrarii de editat (YYYY-MM-DD): ");
                    String dataEditare = scanner.nextLine();
                    LocalDate dateEditare = LocalDate.parse(dataEditare, formatter);
                    boolean gasit = false;
                    for (int i = 0; i < diary.size(); i++) {
                        if (diary.get(i).startsWith(dataEditare)) {
                            System.out.println();
                            System.out.println("Introduceti noul continut: ");
                            String noulContinut = scanner.nextLine();
                            System.out.println();
                            diary.set(i, dateEditare + " : " + noulContinut);
                            System.out.println();
                            System.out.println("Intrare modificata!");
                            System.out.println();
                            gasit = true;
                            break;
                        }
                    }
                    if (!gasit) {
                        System.out.println();
                        System.out.println("Intrarea nu a fost gasita");
                        System.out.println();
                    }
                }
                case "3" -> {
                    System.out.println();
                    System.out.println("Introduceti data intrarii de șters (YYYY-MM-DD): ");
                    String dataStergere = scanner.nextLine();
                    LocalDate dateStergere = LocalDate.parse(dataStergere, formatter);
                    Boolean gresit = false;
                    for (int i = 0; i < diary.size(); i++) {
                        if (diary.get(i).startsWith(dataStergere)) {
                            diary.remove(i);
                            System.out.println();
                            System.out.println("Intrare stearsa!");
                            System.out.println();
                            gresit = true;
                            break;
                        }
                    }

                    if (!gresit) {
                        System.out.println();
                        System.out.println("Intrarea nu a fost gasita!");
                        System.out.println();
                    }
                }
                case "4" -> {
                    System.out.println();
                    System.out.println("Intrarile din jurnal in ordine cronologica inversa:");
                    diary.sort(Collections.reverseOrder());
                    System.out.println();
                    for (String intrare : diary) {
                        System.out.println(intrare);
                    }
                    System.out.println();
                }
                case "5" -> {
                    System.out.println();
                    System.out.println("TERMINAT____________________________________________________________________________________");
                    System.out.println();
                    return;
                }
                default -> {
                    System.out.println();
                    System.out.println("Optiunea aleasa este invalida. Incercati din nou!");
                    System.out.println();
                }
            }
        }
    }
}
