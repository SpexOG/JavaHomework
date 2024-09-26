package JavaCollectionsFramework;

//  1.Write a Java program to append the specified element to the end of a hash set.
//  2.Write a Java program to iterate through all elements in a hash list.
//  3.Write a Java program to get the number of elements in a hash set.
//  4.Write a Java program to empty a hash set.
//  5.Write a Java program to test a hash set is empty or not.
//  6.Write a Java program to clone a hash set to another hash set.
//  7.Write a Java program to convert a hash set to an array.
//  8.Write a Java program to convert a hash set to a tree set.
//  9.Write a Java program to convert a hash set to a List/ArrayList.
//  10.Write a Java program to compare two hash set.
//  11.Write a Java program to compare two sets and retain elements which are same on both sets.
//  12.Write a Java program to remove all of the elements from a hash set.

import java.util.*;

public class HashSetHW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println("Adaugare element specific la finalul set-ului: ");
        HashSet<String>hashSet = new HashSet<String>();
        hashSet.add("Banane");
        hashSet.add("Struguri");
        hashSet.add("Portocale");
        System.out.println("Introducere element specific: ");
        String specificElement = scanner.nextLine();
        System.out.println("Set-ul inainte de adaugare: " + hashSet);
        hashSet.add(specificElement);
        System.out.println("Set-ul dupa adaugare element la final: " + hashSet);

        //2
        System.out.println("Iterare prin elementele unui Set: ");
        for (String fructe : hashSet){

            System.out.println(fructe);

        }

        //3
        System.out.println("Determinare numar de elemente din Set: ");
        System.out.println("Set-ul" + hashSet + "are " + hashSet.size() + " elemente.");

        //4
        System.out.println("Golire HashSet: ");
        HashSet<String> hashSetClone = new HashSet<>(hashSet);
        System.out.println("HashSet intreg: " + hashSetClone);
        hashSetClone.clear();
        System.out.println("HashSet golit: " + hashSetClone);

        //5
        System.out.println("Testare HashSet gol: ");
        if (hashSet.isEmpty()){

            System.out.println("HashSet-ul este gol!");

        }else {

            System.out.println("HashSet-ul nu este gol, iar continutul Set-ului este: " + hashSet);

        }

        //6
        System.out.println("Cloneare HashSet la alt HashSet: ");
        HashSet<String>clona = new HashSet<>(hashSet);
        System.out.println("Set original: " + hashSet);
        System.out.println("Set clonat: " + clona);

        //7
        System.out.println("Convertire HashSet la Array: ");
        String[] array = hashSet.toArray(new String[0]);
        System.out.println("HashSet convertit la Array: " + Arrays.toString(array));

        //8
        System.out.println("Convertire HashSet la TreeSet: ");
        TreeSet<String>treeSet = new TreeSet<>(hashSet);
        System.out.println("HashSet convertit la TreeSet: " + treeSet);

        //9
        System.out.println("Convertire HashSet la List");
        List<String>list = new ArrayList<>(hashSet);
        System.out.println("HashSet convertit la List: " + list);
        System.out.println("Convertire HashSet la ArrayList");
        ArrayList<String>arrayList = new ArrayList<>(hashSet);
        System.out.println("HashSet convertit ArrayList: " + arrayList);

        //10
        System.out.println("Comparare 2 HashSet-uri: ");
        HashSet<String>fructe = new HashSet<>();
        fructe.add("Mango");
        fructe.add("Cocos");
        fructe.add("Ananas");
        if (hashSet.equals(fructe)){

            System.out.println("Cele 2 HashSet-uri sunt egale!");

        }else {

            System.out.println("Cele 2 HashSet-uri nu sunt egale!");

        }

        //11
        System.out.println("Comparare 2 Set-uri si pastrare doar elementele care sunt comune in ambele: ");
        HashSet<String>set1 = new HashSet<>();
        HashSet<String>set2 = new HashSet<>();
        HashSet<String>set3 = new HashSet<>();
        set1.add("Maro");
        set1.add("Rosu");
        set1.add("Galben");

        set2.add("Galben");
        set2.add("Gri");
        set2.add("Rosu");

        set3.addAll(set1);

        set1.retainAll(set2);
        System.out.println("Primul Set: " + set3);
        System.out.println("Al doilea Set: " + set2);
        System.out.println("Elementele comune ramase in urma compararii: " + set1);

        //12
        System.out.println("Stergere toate elementele dintr-un HashSet: ");
        System.out.println("Set initial: " + hashSet);
        hashSet.removeAll(hashSet);
        System.out.println("Set dupa golire: " + hashSet);


        scanner.close();

    }

}
