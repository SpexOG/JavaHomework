package JavaCollectionsFramework;

//  1.Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
//  2.Write a Java program to iterate through all elements in a tree set.
//  3.Write a Java program to add all the elements of a specified tree set to another tree set.
//  4.Write a Java program to create a reverse order view of the elements contained in a given tree set.
//  5.Write a Java program to get the first and last elements in a tree set.
//  6.Write a Java program to clone a tree set list to another tree set.
//  7.Write a Java program to get the number of elements in a tree set.
//  8.Write a Java program to compare two tree sets.
//  9.Write a Java program to find the numbers less than 7 in a tree set.
//  10.Write a Java program to get the element in a tree set which is greater than or equal to the given element.
//  11.Write a Java program to get the element in a tree set which is less than or equal to the given element.
//  12.Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
//  13.Write a Java program to get an element in a tree set which is strictly less than the given element.
//  14.Write a Java program to retrieve and remove the first element of a tree set.
//  15.Write a Java program to retrieve and remove the last element of a tree set.
//  16.Write a Java program to remove a given element from a tree set.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetHW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        TreeSet<String>colors = new TreeSet<>();
        System.out.println("Cate elemente doriti sa inserati in TreeSet: ");
        int elemente = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < elemente; i++){

            System.out.print("Scrieti elementul pe care doriti sa il inserati in TreeSet: ");
            String element = scanner.nextLine();
            System.out.println();
            colors.add(element);

        }

        System.out.println("TreeSet-ul creat este: " + colors);

        //2
        System.out.println("Iterare elemente din TreeSet: ");
        for (String color : colors){

            System.out.println(color);

        }

        //3
        System.out.println("Adaugare elemente din TreeSet in alt TreeSet: ");
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Kiwi");
        treeSet2.add("Mere");
        treeSet2.add("Mandarine");
        System.out.println("Primul TreeSet: " + colors);
        System.out.println("Al doilea TreeSet: " + treeSet2);
        colors.addAll(treeSet2);
        System.out.println("TreeSet dupa adaugare alte elemente din alt TreeSet: " + colors);

        //4
        System.out.println("Vedere inversata a elementelor dintr-un TreeSet: ");
        TreeSet<String>reversedTreeSet = (TreeSet<String>) colors.descendingSet();
        System.out.println("TreeSet inversat: " + reversedTreeSet);

        //5
        System.out.println("Obtinere primul si ultimul element dintr-un TreeSet: ");
        System.out.println("Primul element dintr-un TreeSet: " + colors.getFirst());
        System.out.println("Ultimul element dintr-un TreeSet: " + colors.getLast());

        //6
        System.out.println("Clonare TreeSet in alt TreeSet: ");
        TreeSet<String>clona = new TreeSet<>(colors);
        System.out.println("TreeSet original: " + colors);
        System.out.println("TreeSet clona: " + clona);

        //7
        System.out.println("Determinare numar de elemente dintr-un TreeSet: ");
        System.out.println("Numarul de elemente din TreeSet-ul: " + colors + " este " + colors.size() + ".");

        //8
        System.out.println("Comparare 2 TreeSet-uri: ");
        if (colors.equals(treeSet2)){

            System.out.println("Cele 2 TreeSet-uri sunt egale!");

        }else {

            System.out.println("Cele 2 TreeSet-uri NU sunt egale!");
        }

        //9
        System.out.println("Gasire numere mai mici decat 7 dintr-un TreeSet: ");
        TreeSet<Integer>numere = new TreeSet<>();
        System.out.println("Cate numere doriti sa introduceti in TreeSet: ");
        int elemente1 = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < elemente1; i++){

            System.out.print("Introduceti numarul: ");
            int numar = scanner.nextInt();
            scanner.nextLine();
            numere.add(numar);

        }

        System.out.println("TreeSet-ul este: " + numere);

        List<Integer>numereMaiMiciDecat7 = new ArrayList<>();

        for (int numar : numere){

            if (numar < 7){

                numereMaiMiciDecat7.add(numar);

            }

        }

        if (!numereMaiMiciDecat7.isEmpty()){

            System.out.println("Numerele mai mici decat 7 din TreeSet sunt: " + numereMaiMiciDecat7);

        }else {

            System.out.println("Nu exista numere mai mici decat 7 in TreeSet!");

        }

        //10
        System.out.println("Obținere element dintr-un TreeSet care este mai mare sau egal cu un element dat: ");
        System.out.println("Element dat: ");
        int comparat = scanner.nextInt();
        scanner.nextLine();
        Integer rezultat = numere.ceiling(comparat);
        if (rezultat != null){

            System.out.println("Elementul mai mare sau egal cu " + comparat + " este: " + rezultat);

        }else {

            System.out.println("Nu exista elemente mai mari sau egale cu " + comparat + " in TreeSet.");

        }

        //11
        System.out.println("Obținere element dintr-un TreeSet care este mai mic sau egal cu un element dat: ");
        System.out.println("Element dat: ");
        int comparat1 = scanner.nextInt();
        scanner.nextLine();
        Integer rezultat1 = numere.floor(comparat1);
        if (rezultat1 != null){

            System.out.println("Elementul mai mic sau egal cu " + comparat1 + " este: " + rezultat1);

        }else {

            System.out.println("Nu exista elemente mai mici sau egale cu " + comparat1 + " in TreeSet.");

        }

        //12
        System.out.println("Obținere element dintr-un TreeSet care este strict mai mare cu un element dat: ");
        System.out.println("Element dat: ");
        int comparat2 = scanner.nextInt();
        scanner.nextLine();
        Integer rezultat2 = numere.higher(comparat2);
        if (rezultat2 != null){

            System.out.println("Elementul mai mare strict decat " + comparat2 + " este: " + rezultat2);

        }else {

            System.out.println("Nu exista elemente mai mari strict decat " + comparat2 + " in TreeSet.");

        }

        //13
        System.out.println("Obținere element dintr-un TreeSet care este strict mai mic cu un element dat: ");
        System.out.println("Element dat: ");
        int comparat3 = scanner.nextInt();
        scanner.nextLine();
        Integer rezultat3 = numere.lower(comparat3);
        if (rezultat3 != null){

            System.out.println("Elementul mai mic strict decat " + comparat3 + " este: " + rezultat3);

        }else {

            System.out.println("Nu exista elemente mai mici strict decat " + comparat3 + " in TreeSet.");

        }

        //14
        System.out.println("Returnare si eliminare a primului element dintr-un TreeSet: ");
        System.out.println("TreeSet-ul este: " + numere);
        int primulNr = numere.pollFirst();
        System.out.println("Primul element din TreeSet care a fost si eliminat este: " + primulNr + ", iar TreeSet-ul a devenit: " + numere);

        //15
        System.out.println("Returnare si eliminare a ultimului element dintr-un TreeSet: ");
        System.out.println("TreeSet-ul este: " + numere);
        int ultimulNr = numere.pollLast();
        System.out.println("Ultimul element din TreeSet care a fost si eliminat este: " + ultimulNr + ", iar TreeSet-ul a devenit: " + numere);



        //16
        System.out.println("Eliminare anumit element din TreeSet: ");
        System.out.println("Introducere element care vrei sa fie eliminat: ");
        int eliminat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("TreeSet-ul inainte de eliminare este: " + numere);
        if (numere.contains(eliminat)){

            System.out.println("Element eliminat cu succes!");
            numere.remove(eliminat);
            System.out.println("TreeSet-ul devine: " + numere);

        }else {

            System.out.println("Nu exista elementul " + eliminat + " in TreeSet!");
            System.out.println("TreeSet-ul ramane neschimbat: " + numere);

        }

        scanner.close();

    }

}
