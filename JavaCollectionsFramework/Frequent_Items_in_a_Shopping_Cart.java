package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequent_Items_in_a_Shopping_Cart {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<String>> cosuri = new ArrayList<>();

        System.out.println("Cate cosuri de cumparaturi vrei sa aveti?");
        System.out.print("Numar cosuri cumparaturi: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        adaugaCosuri(n, scanner, cosuri, 0);

        System.out.println("Doriti sa mai adaugati alte cosuri de cumparaturi ?");
        System.out.println(" 1- Da");
        System.out.println(" 2- Nu");
        String choice = scanner.nextLine();
        switch (choice) {

            case "1" -> adaugaCosNou(scanner, cosuri);
            case "2" -> System.out.println("Ok.");
            default -> System.out.println("Optiune invalida, consideram ca ati ales 'Nu' ");

        }

        System.out.println("Doriti sa se afiseze cosurile de cumparaturi curente? ");
        System.out.println(" 1 - Da");
        System.out.println(" 2 - Nu");
        String alege = scanner.nextLine();

        switch (alege) {

            case "1" -> afisareCosuri(cosuri);
            case "2" -> System.out.println("Ok!");
            default -> System.out.println("Optiune gresita, consideram ca ati ales 'Nu'.");

        }

        System.out.println("Cate elemente frecvente doriti sa vedeti ? (K): ");
        int k = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> itemeFrecvente = gasireElementeFrecvente(cosuri, k);

        System.out.println("Cele mai frecvente " + k + " elemente sunt: " + itemeFrecvente);

    }

    public static void adaugaCosNou(Scanner scanner, ArrayList<ArrayList<String>> cosuri) {

        System.out.println("Cate cosuri de cumparaturi vrei sa adaugi?");
        System.out.print("Numar cosuri cumparaturi noi adaugate: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        adaugaCosuri(n, scanner, cosuri, cosuri.size());

    }

    public static void adaugaCosuri(int n, Scanner scanner, ArrayList<ArrayList<String>> cosuri, int startIndex) {

        for (int i = 0; i < n; i++) {

            cosuri.add(new ArrayList<>());

        }

        for (int i = startIndex; i < startIndex + n; i++) {

            System.out.println("Cate elemente vrei sa adaugi in cosul " + (i + 1) + " ?");
            System.out.print("Introdu numarul de elemente: ");
            int numarElemente = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < numarElemente; j++) {

                System.out.print("Introdu elementul " + (j + 1) + " : ");
                String element = scanner.nextLine();
                cosuri.get(i).add(element);

            }

        }

    }

    public static void afisareCosuri(ArrayList<ArrayList<String>> cosuri) {

        for (int i = 0; i < cosuri.size(); i++) {

            System.out.println("Cosul " + (i + 1) + " contine: " + cosuri.get(i));

        }

    }

    public static ArrayList<String> gasireElementeFrecvente(ArrayList<ArrayList<String>> cosuri, int k) {

        HashMap<String, Integer> contorizareItemMap = new HashMap<>();

        for (ArrayList<String> cos : cosuri) {

            for (String item : cos) {

                contorizareItemMap.put(item, contorizareItemMap.getOrDefault(item, 0) + 1); //Returneaza valoarea asociata cu cheia data sau o valoare default (0) daca cheia nu e prezenta in mapa. Aici se va incrementa cu 1 in cazul in care itemul este gasit din nou in cos. Practic actualizeaza cheia cu numarul de aparitii al elementului.

            }

        }

        ArrayList<Map.Entry<String, Integer>> listaIteme = new ArrayList<>(contorizareItemMap.entrySet());

        listaIteme.sort((a, b) -> b.getValue().compareTo(a.getValue())); //Sortare frecventa in ordine descrescatoare.

        ArrayList<String> itemeFrecvente = new ArrayList<>();

        for (int i = 0; i < Math.min(k, listaIteme.size()); i++){

            itemeFrecvente.add(listaIteme.get(i).getKey());

        }

        return itemeFrecvente;

    }

}
