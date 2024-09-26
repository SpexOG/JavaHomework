package JavaCollectionsFramework;

//  1.Write a Java program to associate the specified value with the specified key in a HashMap.
//  2.Write a Java program to count the number of key-value (size) mappings in a map.
//  3.Write a Java program to copy all of the mappings from the specified map to another map.
//  4.Write a Java program to remove all of the mappings from a map.
//  5.Write a Java program to check whether a map contains key-value mappings (empty) or not.
//  6.Write a Java program to get a shallow copy of a HashMap instance.
//  7.Write a Java program to test if a map contains a mapping for the specified key.
//  8.Write a Java program to test if a map contains a mapping for the specified value.
//  9.Write a Java program to create a set view of the mappings contained in a map.
//  10.Write a Java program to get the value of a specified key in a map.
//  11.Write a Java program to get a set view of the keys contained in this map.
//  12.Write a Java program to get a collection view of the values contained in this map.

import java.util.*;

public class HashMapHW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        HashMap<Integer, String>hashMap = new HashMap<>();
        hashMap.put(1, "Masina");
        hashMap.put(2, "Motocicleta");
        hashMap.put(3, "Bicicleta");
        System.out.println("Introduceti cheia valorii: ");
        int cheie = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti valoarea cheii: ");
        String valoare = scanner.nextLine();
        hashMap.put(cheie, valoare);
        System.out.println("Element adaugat!");
        System.out.println("HashMap-ul este: " + hashMap);

        //2
        System.out.println("Marimea HashMap-ului: ");
        System.out.println("Marimea HashMap-ului este de: " + hashMap.size());

        //3
        System.out.println("Copiere toate mapele dintr-un HashMap in alt HashMap: ");
        HashMap<Integer, String> altHashMap = new HashMap<>(hashMap);
        System.out.println("Copia Mapei este: " + altHashMap);

        //4
        System.out.println("Stergere toate maparile dintr-un HashMap: ");
        System.out.println("HashMap inainte de stergere: " + altHashMap);
        altHashMap.clear();
        System.out.println("HashMap dupa stergere: " + altHashMap);

        //5
        System.out.println("Verificare daca un map este gol sau nu: ");
        if (hashMap.isEmpty()){

            System.out.println("HashMap-ul este gol!");

        }else {

            System.out.println("HashMap-ul NU este gol!");

        }

        //6
        System.out.println("Obținere copie superficială (shallow copy) a unui HashMap: ");
        HashMap<Integer, String> copieHashMap = (HashMap<Integer, String>)hashMap.clone();
        System.out.println("Copia superficiala a unui HashMap este: " + copieHashMap);

        //7
        System.out.println("Verificare daca o mapa are valoare pentru o anumita cheie: ");
        System.out.println("Mapa este: " + hashMap);
        System.out.println("Introduceti cheia pentru care doriti sa verificati maparea: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        if (hashMap.containsKey(key)){

            System.out.println("Cheia " + key + " este prezenta in HashMap si are valaorea: " + hashMap.get(key));

        }else {

            System.out.println("Cheia " + key + " NU este prezenta in HashMap!");

        }

        //8
        System.out.println("Verificare daca o mapa are cheie pentru o anumita valoare: ");
        System.out.println("Mapa este: " + hashMap);
        System.out.println("Introduceti valoarea pentru care doriti sa verificati cheia: ");
        String value = scanner.nextLine();
        if (hashMap.containsValue(value)){

            System.out.println("Valoarea " + value + " este prezenta in HashMap");

        }else {

            System.out.println("Cheia " + value + " NU este prezenta in HashMap!");

        }

        //9
        System.out.println("Vizualizare a unei Mape sub forma de Set: ");
        System.out.println("HashMap-ul este: " + hashMap);
        Set<Map.Entry<Integer, String>>setView = hashMap.entrySet();

        System.out.println("Vizualizare sub forma de Set a HashMap-ului: ");
        for (Map.Entry<Integer, String> entry : setView){

            System.out.println("Cheie: " + entry.getKey() + ", valoare: " + entry.getValue());

        }

        //10
        System.out.println("Obtinere valoare a unei chei specifice in Java: ");
        System.out.println("HashMap-ul este: " + hashMap);
        System.out.println("Introduceti cheia a carei valori doriti sa o vedeti: ");
        int key2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Valoarea cheii " + key2 + " este: " + hashMap.get(key2));


        //11
        System.out.println("Obtinere vizualizare sub forma de Set a cheilor continute intr-un Map: ");
        Set<Integer>set=hashMap.keySet();
        System.out.println("Cheile sub forma de Set: " + set);

        //12
        System.out.println("Vizualizare sub forma de Colectie a valorilor dintr-un HashMap: ");
        Collection<String>collection = hashMap.values();
        System.out.println("Valorile sub forma de Colectie: " + collection);

        scanner.close();

    }

}
