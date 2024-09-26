package JavaCollectionsFramework;

//  1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
//  2. Write a Java program to iterate through all elements in a array list.
//  3. Write a Java program to insert an element into the array list at the first position.
//  4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//  5. Write a Java program to update specific array element by given element.
//  6. Write a Java program to remove the third element from a array list.
//  7. Write a Java program to search an element in a array list.
//  8. Write a Java program to sort a given array list.
//  9. Write a Java program to copy one array list into another.
//  10. Write a Java program to shuffle elements in a array list.
//  11. Write a Java program to reverse elements in a array list.
//  12. Write a Java program to extract a portion of a array list.
//  13. Write a Java program to compare two array lists.
//  14. Write a Java program of swap two elements in an array list.
//  15. Write a Java program to join two array lists.
//  16. Write a Java program to clone an array list to another array list.
//  17. Write a Java program to empty an array list.
//  18. Write a Java program to test an array list is empty or not.
//  19. Write a Java program to trim the capacity of an array list the current list size.
//  20. Write a Java program to increase the size of an array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListHW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1
        ArrayList <String> colors = new ArrayList<>();

        System.out.println("Cate culori doriti sa adaugati in lista?");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Scrieti culorile pe care doriti sa le adaugati:");

        for (int i = 0; i < n; i++){

            colors.add(scanner.nextLine());

        }

        System.out.println("Lista este: " + colors);


        //2
        System.out.println("Iterare prin elementele unei liste: ");
        for (String color : colors) {

            System.out.println(color);

        }

        //3
        System.out.println("Scrieti o culoare noua pentru a fi inserata pe prima pozitie in ArrayList: ");
        String culoareNoua = scanner.nextLine();

        colors.addFirst(culoareNoua);
        System.out.println("Lista cu noua culoare pe prima pozitie este: " + colors);

        //4
        System.out.println("Scrieti index-ul elementului pe care doriti sa il vizualizati din lista: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Elementul de la indexul " + index + " este: " + colors.get(index));

        //5
        System.out.println("Introduceti elementul care vreti sa fie actualizat: ");
        String element = scanner.nextLine();
        System.out.println("Introduceti elementul actualizat: ");
        String elementActualizat = scanner.nextLine();

        if (colors.contains(element)){

            colors.set(colors.indexOf(element), elementActualizat);
            System.out.println("Lista actualizata: " + colors);

        }

        //6
        System.out.println("Stergere al treilea element din ArrayList: ");
        colors.remove(2);
        System.out.println("ArrayList cu elementul sters: " + colors);

        //7
        System.out.println("Scrieti elementul pe care il cautati din lista: ");
        String cautare = scanner.nextLine();
        if (colors.contains(cautare)){

            System.out.println("Elementul se afla in lista la pozitia: " + (colors.indexOf(cautare) + 1));

        }else {

            System.out.println("Elementul nu se afla in lista!");

        }

        //8
        System.out.println("Lista sortata: ");
        Collections.sort(colors);
        System.out.println(colors);

        //9
        System.out.println("Copiere ArrayList in alt ArrayList: ");
        ArrayList<String> list2 = new ArrayList<>(colors);
        //sau
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list2);
        System.out.println("Lista copiata: " + list2);
        System.out.println("Lista copiata 2 : " + list3);

        //10
        System.out.println("Amestecare elemente din lista colors: ");
        Collections.shuffle(colors);
        System.out.println(colors);

        //11
        System.out.println("Lista cu elemente inversate: ");
        Collections.reverse(colors);
        System.out.println(colors);

        //12
        System.out.println("Portiune din lista: ");
        List<String> sublista;
        sublista = colors.subList(0, 3);
        System.out.println(sublista);

        //13
        System.out.println("Comparare 2 liste: ");
        ArrayList<String> comparableList = new ArrayList<>();
        comparableList.add("Corai");
        comparableList.add("gri");
        comparableList.add("Verde");

        if (colors.equals(comparableList)){

            System.out.println("Listele sunt egale.");

        }else {

            System.out.println("Listele nu sunt egale.");

        }

        //14
        System.out.println("Interschimbare elemente liste: ");
        System.out.println("Introduceti index-urile care sa fie schimbate:");
        System.out.println("Index pentru primul element: ");
        int index1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Index pentru al doilea element: ");
        int index2 = scanner.nextInt();
        scanner.nextLine();
        Collections.swap(colors, index1, index2);
        System.out.println(colors);

        //15
        System.out.println("Combinare 2 liste: ");
        colors.addAll(comparableList);
        System.out.println(colors);

        //16
        System.out.println("Clonare lista: ");
        ArrayList<String> listaClona = (ArrayList<String>)colors.clone();
        System.out.println("Lista originala: " + colors);
        System.out.println("Lista clonata: " + listaClona);

        //17
        System.out.println("Golire un ArrayList: ");
        System.out.println("Lista plina: " + listaClona);
        listaClona.removeAll(listaClona);
        System.out.println("Lista goala: " + listaClona);

        //18
        System.out.println("Verificare daca ArrayList este gol: ");
        if (colors.isEmpty()){

            System.out.println("Lista este goala.");

        }else {

            System.out.println("Lista nu este goala.");

        }

        //19
        System.out.println("Ajustare capacitate lista: ");
        ArrayList<String> lista = new ArrayList<>(10);
        lista.add("Mere");
        lista.add("Pere");
        lista.add("Visine");
        System.out.println("Lista initiala: " + lista);
        System.out.println("Capacitatea listei initiale este 10");
        lista.trimToSize();
        System.out.println("Lista ajustata: " + lista);
        System.out.println("Capacitatea listei ajustate: " + lista.size());

        //20
        System.out.println("Marire dimesniune ArrayList: ");
        System.out.println("Dimensiune initiala lista: " + lista.size());
        lista.add("Morcovi");
        lista.add("Cal");
        lista.add("Fier");
        System.out.println("Dimeniune lista dupa marire: " + lista.size());
        lista.ensureCapacity(40);
        System.out.println("Dimeniune lista dupa marire 40");


        scanner.close();

    }

}
