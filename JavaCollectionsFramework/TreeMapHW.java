package JavaCollectionsFramework;

//  1.Write a Java program to associate the specified value with the specified key in a Tree Map.
//  2.Write a Java program to copy a Tree Map content to another Tree Map.
//  3.Write a Java program to search a key in a Tree Map.
//  4.Write a Java program to search a value in a Tree Map.
//  5.Write a Java program to get all keys from the given a Tree Map.
//  6.Write a Java program to delete all elements from a given Tree Map.
//  7.Write a Java program to sort keys in Tree Map by using comparator.
//  8.Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
//  9.Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
//  10.Write a Java program to get a reverse order view of the keys contained in a given map.
//  11.Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
//  12.Write a Java program to get the greatest key less than or equal to the given key.
//  13.Write a Java program to get the portion of a map whose keys are strictly less than a given key.
//  14.Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
//  15.Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
//  16.Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
//  17.Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.

import java.util.*;

public class TreeMapHW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println("Ascociere cheie specifica cu o valoare specifica intr-un TreeMap: ");
        TreeMap<Integer, String>treeMap = new TreeMap<>();
        treeMap.put(1, "Pizza");
        treeMap.put(2, "Macaroane");
        treeMap.put(3, "Omleta");
        System.out.println("Introduceti cheia valorii: ");
        int cheie = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduceti valoarea cheii: ");
        String valoare = scanner.nextLine();
        treeMap.put(cheie, valoare);
        System.out.println("TreeMap-ul rezultat: " + treeMap);

        //2
        System.out.println("Copiere continut TreeMap in alt TreeMap: ");
        TreeMap<Integer, String>cloneTreeMap = new TreeMap<>(treeMap);
        System.out.println("Clona TreeMap-ului: " + cloneTreeMap);

        //3
        System.out.println("Cautare cheie intr-un TreeMap: ");
        System.out.println("Introduceti cheia pe care o cautati: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        if (treeMap.containsKey(key)){

            System.out.println("Cheia " + key + " exista in TreeMap si valoarea ei este: " + treeMap.get(key));

        }else {

            System.out.println("Nu exista cheia in TreeMap!");

        }

        //4
        System.out.println("Cautare valoare intr-un TreeMap: ");
        System.out.println("Introduceti valoarea pe care o cautati: ");
        String value = scanner.nextLine();
        if (treeMap.containsValue(value)){

            System.out.println("Valoarea " + value + " exista in TreeMap.");

        }else {

            System.out.println("Nu exista valoarea "+ value + " in TreeMap!");

        }

        //5
        System.out.println("Returnare toate cheile dintr-un TreeMap: ");
        Set<Integer>set = treeMap.keySet();
        System.out.println("Cheile din TreeMap: " + set);

        //6
        System.out.println("Stergere toate elementele dintr-un TreeMap: ");
        System.out.println("TreeMap inainte de stergere: " + cloneTreeMap);
        cloneTreeMap.clear();
        System.out.println("TreeMap dupa stergere: " + cloneTreeMap);

        //7
        System.out.println("Sortati cheile in TreeMap folosind un comparator: ");
        Comparator<Integer>comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        TreeMap<Integer, String>treeMapForCompare = new TreeMap<>(comparator);
        treeMapForCompare.put(23, "Mere");
        treeMapForCompare.put(99, "Pere");
        treeMapForCompare.put(2, "Portocale");
        treeMapForCompare.put(-4, "Prune");
        treeMapForCompare.put(50, "Capsuni");

        System.out.println("TreeMap cu elementele sortate crescator: " + treeMapForCompare);

        //8
        System.out.println("Obținere asociere cheie-valoare pentru cea mai mare și cea mai mică cheie dintr-un TreeMap");
        System.out.println("Prima asociere este: " + treeMap.firstEntry());
        System.out.println("Ultima asociere este: " + treeMap.lastEntry());

        //9
        System.out.println("Obținere prima (cea mai mică) cheie și ultima (cea mai mare) cheie dintr-un TreeMap");
        System.out.println("Cea mai mica intrare este: " + treeMap.firstKey());
        System.out.println("Cea mai mare intrare este: " + treeMap.lastKey());

        //10
        System.out.println("Vedere inversată a cheilor dintr-un TreeMap: ");
        Set<Integer>set2 = treeMap.descendingKeySet();
        System.out.println("Vedere inversata a cheilor: " + set2);

        //11
        System.out.println("Asociere cheie-valoare asociată cu cea mai mare cheie care este mai mică sau egală cu o cheie dată într-un TreeMap: ");
        System.out.println("TreeMap-ul este: " + treeMap);
        System.out.println("Introduceti cheia cautata: ");
        int key3 = scanner.nextInt();
        scanner.nextLine();
        Map.Entry<Integer, String>entry = treeMap.floorEntry(key3);
        if (entry != null){

            System.out.println("Cea mai mare cheie mai mica sau egala cu " + key3 + " este " + entry.getKey() + ", cu valoarea: " + entry.getValue() + ".");

        }else {

            System.out.println("Nu exista o cheie mai mica sau egala cu " + key3 + " in TreeMap.");

        }

        //12
        System.out.println("Obținere cea mai mare cheie care este mai mică sau egală cu o cheie dată într-un TreeMap: ");
        System.out.println("TreeMap-ul este: " + treeMap);
        System.out.println("Introduceti cheia cautata: ");
        int key2 = scanner.nextInt();
        scanner.nextLine();
        Map.Entry<Integer, String> entry2 = treeMap.floorEntry(key2);
        if (entry2 != null){

            System.out.println("Cea mai mare cheie mai mica sau egala cu " + key2 + " este " + entry2.getKey());

        }else {

            System.out.println("Nu exista o cheie mai mica sau egala cu " + key2 + " in TreeMap.");

        }

        //13
        System.out.println("Obținere porțiune a unui TreeMap al cărui chei sunt strict mai mici decât o cheie dată");
        System.out.println("Introduceti cheia data: ");
        int cheieData = scanner.nextInt();
        scanner.nextLine();
        System.out.println("TreeMap complet: " + treeMap);
        Map<Integer, String> portiune = treeMap.headMap(cheieData);
        System.out.println("Portiunea cu chei strict mai mici decat " + cheieData + " este: " + portiune);

        //14
        System.out.println("Obținere porțiune a unui TreeMap al cărui chei sunt mai mici sau, opțional, egale cu o cheie dată: ");
        System.out.println("Introduceti cheia pana la care sa fie portiunea: ");
        int key4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Doresti sa inclusi si cheia in portiunea (da sau nu ) ?");
        String decizie = scanner.nextLine();
        boolean inclusiv = false;
        System.out.println("TreeMap intreg: " + treeMap);
        if (decizie.equalsIgnoreCase("da")){

            inclusiv = true;

        }else if (decizie.equalsIgnoreCase("nu")){

            inclusiv = false;

        }else {

            System.out.println("Optiune gresita! Cheia nu va fi inclusa in portiune!");

        }
        System.out.println("TreeMap initial: " + treeMap);
        Map<Integer, String>portiune1 = treeMap.headMap(key4, inclusiv);
        System.out.println("Porțiunea cu chei mai mici (sau egale, dacă inclusiv este true) decât " + key4 + " : " + portiune1);

        //15
        System.out.println("Obținere cea mai mică cheie care este strict mai mare decât o cheie dată într-un TreeMap: ");
        System.out.println("TreeMap intreg: " + treeMap);
        System.out.println("Introduceti cheia: ");
        int cheieCautata = scanner.nextInt();
        scanner.nextLine();
        Integer ceaMaiMicaCheie = treeMap.higherKey(cheieCautata);
        if (ceaMaiMicaCheie != null){

            System.out.println("Cea mai mica cheie strict mai mare decat " + cheieCautata + " este " + ceaMaiMicaCheie + ".");

        }else {

            System.out.println("Nu există o cheie strict mai mare decât " + cheieCautata + " in TreeMap.");

        }

        //16
        System.out.println("Obținere asociere cheie-valoare asociată cu cea mai mare cheie care este strict mai mică decât o cheie dată într-un TreeMap: ");
        System.out.println("TreeMap-ul intreg: " + treeMap);
        System.out.println("Introduce cheia pentru care vrei să obții asocierea cheie-valoare: ");
        int cheie1 = scanner.nextInt();
        scanner.nextLine();
        Map.Entry<Integer, String> entry1 = treeMap.lowerEntry(cheie1);
        if (entry1 != null){

            System.out.println("Asocierea cheie-valoare pentru cea mai mare cheie strict mai mică decât " + cheie1 + " este: " + entry1 + ".");

        }else {

            System.out.println("Nu există o cheie strict mai mică decât " + cheie1 + " in TreeMap.");

        }

        //17
        System.out.println("Obținere cea mai mare cheie care este strict mai mică decât o cheie dată într-un TreeMap: ");
        System.out.println("TreeMap intreg: " + treeMap);
        System.out.println("Introduce cheia pentru care vrei să obții cea mai mare cheie strict mai mică: ");
        int key5 = scanner.nextInt();
        scanner.nextLine();
        Integer ceaMaiMareCheie = treeMap.lowerKey(key5);
        if (ceaMaiMareCheie != null){

            System.out.println("Cea mai mare cheie strict mai mică decât " + key5 + " este: " + ceaMaiMareCheie + ".");

        }else {

            System.out.println("Nu există o cheie strict mai mică decât " + key5 + " in TreeMap.");

        }

        scanner.close();

    }

}
