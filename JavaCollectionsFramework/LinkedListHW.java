package JavaCollectionsFramework;

//  1.Write a Java program to append the specified element to the end of a linked list.
//  2.Write a Java program to iterate through all elements in a linked list.
//  3.Write a Java program to iterate through all elements in a linked list starting at the specified position.
//  4.Write a Java program to iterate a linked list in reverse order.
//  5.Write a Java program to insert the specified element at the specified position in the linked list.
//  6.Write a Java program to insert elements into the linked list at the first and last position.
//  7.Write a Java program to insert the specified element at the front of a linked list.
//  8.Write a Java program to insert the specified element at the end of a linked list.
//  9.Write a Java program to insert some elements at the specified position into a linked list.
//  10.Write a Java program to get the first and last occurrence of the specified elements in a linked list.
//  11.Write a Java program to display the elements and their positions in a linked list.
//  12.Write a Java program to remove a specified element from a linked list.
//  13.Write a Java program to remove first and last element from a linked list.
//  14.Write a Java program to remove all the elements from a linked list.
//  15.Write a Java program of swap two elements in a linked list.
//  16.Write a Java program to shuffle the elements in a linked list.
//  17.Write a Java program to join two linked lists.
//  18.Write a Java program to clone an linked list to another linked list.
//  19.Write a Java program to remove and return the first element of a linked list.
//  20.Write a Java program to retrieve but does not remove, the first element of a linked list.

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListHW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Leu");
        lista.add("Tigru");
        lista.add("Leopard");
        System.out.println("Lista initiala: " + lista);
        lista.addLast("Ghepard");
        System.out.println("Lista la care a fost adaugat un element pe ultima pozitie: " + lista);

        //2
        System.out.println("Iterare prin elementele listei: ");
        for (String animal : lista){

            System.out.println(animal);

        }

        //3
        System.out.println("Iterare prin lista de la o anumita pozitie specificata: ");
        System.out.println("Introduceti pozitia de la care sa inceapa iterarea: ");
        int pozitie = scanner.nextInt();
        scanner.nextLine();
        for (int i = pozitie; i < lista.size(); i++ ){

            System.out.println(lista.get(i));

        }

        //4
        System.out.println("Itarare lista in ordine inversa: ");
        for (int i = (lista.size()-1); i >= 0; i-- ){

            System.out.println(lista.get(i));

        }

        //5
        System.out.println("Inserare element specific la o pozitie specifica in lista: ");
        System.out.println("Introducere element specific:");
        String elementSpecific = scanner.nextLine();
        System.out.println("Introducere pozitie specifica: ");
        int pozitieSpecifica = scanner.nextInt();
        scanner.nextLine();
        lista.add(pozitieSpecifica, elementSpecific);
        System.out.println("Lista cu inserarea elementului specific la pozitia specifica: " + lista);

        //6
        System.out.println("Inserare elemente in lista, la inceputul si la finalul listei:");
        System.out.println("Introducere element care sa fie inserat la inceputul listei: ");
        String elementIceput = scanner.nextLine();
        System.out.println("Introducere element care se afla la finalul listei: ");
        String elementFinal = scanner.nextLine();
        lista.addFirst(elementIceput);
        lista.addLast(elementFinal);
        System.out.println("Lista cu element final si element de incaput adaugate: " + lista);

        //7
        System.out.println("Inserare element la inceputul listei: ");
        System.out.println("Introduceti elementul care sa fie pozitional la inceputul listei: ");
        String element = scanner.nextLine();
        lista.addFirst(element);
        System.out.println("Lista cu element adaugat la inceputul listei: " + lista);

        //8
        System.out.println("Inserare element la sfarsitul listei: ");
        System.out.println("Introduceti elementul care sa fie pozitional la sfarsitul listei: ");
        String elementSfarsit = scanner.nextLine();
        lista.addFirst(elementSfarsit);
        System.out.println("Lista cu element adaugat la sfarsitul listei: " + lista);


        //9
        System.out.println("Inserare elemente la pozitii specifice: ");
        System.out.println("Cate elemente doriti sa inserati: ");
        int elemente = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < elemente; i ++){

            System.out.println("Introduceti elementul pe care doriti sa il inserati: ");
            String element2 = scanner.nextLine();
            System.out.println("Introduceti pozitia la care doriti sa inserati elementul: ");
            int pozitie1 = scanner.nextInt();
            scanner.nextLine();
            lista.add(pozitie1, element2);

        }

        System.out.println("Lista cu cele " + elemente + " adaugate este: " + lista);

        //10
        System.out.println("Obtinerea primei si ultimei aparitii al unui element din lista: ");
        System.out.println("Introduceti elementul pe care il cautati din lista: ");
        String elementCautat = scanner.nextLine();
        lista.add(1, "Leu");
        lista.add(3, "Leu");
        System.out.println("Lista este " + lista);
        System.out.println("Prima aparitie a elementului " + elementCautat + " in lista, este la pozitia " + lista.indexOf(elementCautat));
        System.out.println("Ultima aparitie a elementului " + elementCautat + " in lista, este la pozitia " + lista.lastIndexOf(elementCautat));

        //11
        System.out.println("Afisare elemente din lista si pozitiile lor: ");
        for (int i = 0; i < lista.size(); i ++){

            System.out.println("Elementul " + lista.get(i) + " din lista, se afla la pozitia " + i + ".");

        }

        //12
        System.out.println("Stergere element specific din lista: ");
        System.out.println("Lista initiala: " + lista);
        System.out.println("Introduceti elementul pe care doriti sa il stergeti din lista: ");
        String elementSters = scanner.nextLine();
        if (lista.contains(elementSters)){

            lista.remove(elementSters);
            System.out.println("Element sters cu succes!");
            System.out.println("lista dupa stergere: " + lista);

        }else {

            System.out.println("Elementul nu se afla in lista!");

        }

        //13
        System.out.println("Stergere primul si ultimul element din lista: ");
        System.out.println("Lista este: " + lista);
        lista.removeFirst();
        lista.removeLast();
        System.out.println("Lista dupa stergere: " + lista);

        //14
        System.out.println("Stergere toate elementele din lista:");
        LinkedList<String>clonaLista = new LinkedList<>(lista);
        System.out.println("Lista completa: " + clonaLista);
        clonaLista.removeAll(clonaLista);
        System.out.println("Lista dupa stergere: " + clonaLista);


        //15
        System.out.println("Schimbare pozitii elemente din lista: ");
        System.out.println("Lista initiala: " + lista);
        System.out.println("Care este primul element: ");
        String firstElement = scanner.nextLine();
        System.out.println("Care este al doilea element: ");
        String secondElement = scanner.nextLine();
        Collections.swap(lista, lista.indexOf(firstElement), lista.indexOf(secondElement));
        System.out.println("Lista dupa inversare pozitii elemente: " + lista);

        //16
        System.out.println("Amestecare elemente din lista: ");
        System.out.println("Lista initiala: " + lista);
        Collections.shuffle(lista);
        System.out.println("Lista amestecata: " + lista);

        //17
        System.out.println("Combinare 2 liste: ");
        System.out.println("Prima lista: " + lista);
        LinkedList<String>listaNoua = new LinkedList<>();
        listaNoua.add("Crevete");
        listaNoua.add("Papaya");
        listaNoua.add("Rac");
        System.out.println("A doua lista: " + listaNoua);
        lista.addAll(listaNoua);
        System.out.println("Lista combinata: " + lista);

        //18
        System.out.println("Clonare lista la alta lista: ");
        LinkedList<String>clonareLista = new LinkedList<>(lista);
        System.out.println("Lista clonata: " + clonareLista);

        //19
        System.out.println("Eliminare si returnare primul element dintr-o lista: ");
        System.out.println("Lista completa este: " + lista);
        String firstElement1 = lista.removeFirst();
        System.out.println("Primul element din lista care a fost si sters este: " + firstElement1 + ", iar lista dupa stergere este: " + lista);

        //20
        System.out.println("Returnare primul element din lista, fara stergerea acestuia: ");
        System.out.println("Lista initiala: " + lista);
        String primulElement = lista.peekFirst();
        System.out.println("Primul element din lista (fara stergerea acestuia din lista) este: " + primulElement + "; iar lista ramane neschimbata si este: " + lista);

        scanner.close();

    }

}
