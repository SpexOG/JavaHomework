package CoreJavaAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CoreJavaAPI {
    public static void main(String[] args) {

        reversedString();

        palindrome();

        concatenate();

        vowels();

        capitalize();

        occurences();

        duplicate();

        specifiedIndex();

        frequency();

        morse();

        caesarCipher();

        convert();

        compressed();

        remove();

        anagrams();

        toggle();

        romanNumbers();

    }


    // Write a program to reverse an input string using StringBuilder.
    private static void reversedString() {

        System.out.println("EX1_______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        String str;

        System.out.print("Introduceti cuvantul: ");

        str = scanner.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb = sb.reverse();

        System.out.println("Cuvantul inversat este: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }


    // Check if a string is a palindrome using StringBuilder.
    private static void palindrome() {

        System.out.println("EX2_______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        String str;

        System.out.print("Introduceti cuvantul: ");

        str = scanner.nextLine();

        StringBuilder sb = new StringBuilder(str);

        String sbToString = sb.reverse().toString();

        if (str.equalsIgnoreCase(sbToString)) {
            System.out.println("Cuvantul este palindrom!");
        } else System.out.println("Cuvantul nu este palindrom!");

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Efficiently concatenate multiple strings into one using StringBuilder.
    private static void concatenate() {

        System.out.println("EX3_______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul de String-uri: ");

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Introduceti String-ul cu numarul " + (i + 1) + " : ");
            array[i] = scanner.nextLine();
        }

        System.out.println("String-urile sunt: ");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
        }

        System.out.println();

        StringBuilder sb = new StringBuilder();

        for (String str : array) {
            sb.append(str).append(" ");
        }

        System.out.println("String-urile concatenate sunt : " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Remove all vowels from a string using StringBuilder.
    private static void vowels() {

        System.out.println("EX4_______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti cuvantul: ");

        String str = scanner.nextLine();
        String str1;

        StringBuilder sb = new StringBuilder(str);
        str1 = sb.toString();

        while (str1.indexOf("a") != -1 || str1.indexOf("e") != -1 || str1.indexOf("i") != -1 || str1.indexOf("o") != -1 || str1.indexOf("u") != -1) {
            if (str1.indexOf("a") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("a")).toString();
            }
            if (str1.indexOf("e") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("e")).toString();
            }
            if (str1.indexOf("i") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("i")).toString();
            }
            if (str1.indexOf("o") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("o")).toString();
            }
            if (str1.indexOf("u") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("u")).toString();
            }
            if (str1.indexOf("A") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("A")).toString();
            }
            if (str1.indexOf("E") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("E")).toString();
            }
            if (str1.indexOf("I") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("I")).toString();
            }
            if (str1.indexOf("O") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("O")).toString();
            }
            if (str1.indexOf("U") != -1) {
                str1 = sb.deleteCharAt(sb.indexOf("U")).toString();
            }
        }

        System.out.println("Rezultat vocale eliminate: " + str1);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Capitalize the first letter of every word in a sentence using StringBuilder.
    private static void capitalize() {

        System.out.println("EX5_______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        String prop;

        System.out.println("Introduceti propozitia: ");

        prop = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        String[] split = prop.split("\\s+");

        for (String cuvant : split) {
            if (cuvant.length() > 0) {
                sb.append(Character.toUpperCase(cuvant.charAt(0)));
                sb.append(cuvant.substring(1).toLowerCase());
            }
            sb.append(" ");
        }

        System.out.println("Propozitia noua este: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Replace all occurrences of a substring in a string using StringBuilder.
    private static void occurences() {

        System.out.println("EX6_______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti fraza: ");
        String str = scanner.nextLine();

        System.out.println("Introduceti substring-ul care sa fie inlocuit: ");
        String inclouire = scanner.nextLine();
        String replace = "";

        if (str.contains(inclouire)) {
            System.out.println("Introduceti cuvantul cu care doriti sa inlocuiti substring-ul anterior: ");
            replace = scanner.nextLine();
        } else {
            System.out.println("Nu exista un substring cu acest continut!");
        }
        int startIndexing = 0;
        int length = inclouire.length();
        int index;

        StringBuilder sb = new StringBuilder();

        while ((index = str.indexOf(inclouire, startIndexing)) != -1) {
            sb.append(str, startIndexing, index);
            sb.append(replace);
            startIndexing = index + length;
        }

        sb.append(str.substring(startIndexing));

        System.out.println("Fraza noua este: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Remove duplicate characters from a string using StringBuilder.
    private static void duplicate() {

        System.out.println("EX7_______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti String-ul: ");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        if (str.length() > 0) {
            sb.append(str.charAt(0));
        }

        for (int index = 1; index < str.length(); index++) {

            char charCurent = str.charAt(index);
            char charAnterior = str.charAt(index - 1);

            if (charCurent != charAnterior) {
                sb.append(charCurent);
            }

        }

        System.out.println("String-ul fara caractere duplicate este: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Insert a string at a specified index in another string using StringBuilder.
    private static void specifiedIndex() {

        System.out.println("EX8_______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti fraza: ");

        String fraza = scanner.nextLine();

        System.out.println("Introduceti String-ul de introdus: ");

        String strIntrodus = scanner.nextLine();

        System.out.println("Introduceti index-ul la care sa fie inserat primul String: ");

        int index = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        sb.append(fraza).insert(index, strIntrodus);

        System.out.println("Fraza noua este: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Count the frequency of each character in a string using StringBuilder.
    private static void frequency() {

        System.out.println("EX9_______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti String-ul: ");

        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        while (str.length() > 0) {
            char c = str.charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            sb.append(c).append(" : ").append(count).append("\n");
            str = str.replace(Character.toString(c), "");
        }

        System.out.println(sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();
    }

    // Convert a string to Morse code using StringBuilder.
    private static void morse() {

        System.out.println("EX10______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti String-ul / fraza: ");

        String str = scanner.nextLine();

        System.out.println("Fraza completa / String-ul complet este: " + str);

        StringBuilder sb = new StringBuilder();
        StringBuilder morse = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(c);
            switch (c) {
                case 'a' -> morse.append(".- ");
                case 'A' -> morse.append(".- ");
                case 'b' -> morse.append("-... ");
                case 'B' -> morse.append("-... ");
                case 'c' -> morse.append("-.-. ");
                case 'C' -> morse.append("-.-. ");
                case 'd' -> morse.append("-.. ");
                case 'D' -> morse.append("-.. ");
                case 'e' -> morse.append(". ");
                case 'E' -> morse.append(". ");
                case 'f' -> morse.append("..-. ");
                case 'F' -> morse.append("..-. ");
                case 'g' -> morse.append("--. ");
                case 'G' -> morse.append("--. ");
                case 'h' -> morse.append(".... ");
                case 'H' -> morse.append(".... ");
                case 'i' -> morse.append(".. ");
                case 'I' -> morse.append(".. ");
                case 'j' -> morse.append(".--- ");
                case 'J' -> morse.append(".--- ");
                case 'k' -> morse.append("-.- ");
                case 'K' -> morse.append("-.- ");
                case 'l' -> morse.append(".-.. ");
                case 'L' -> morse.append(".-.. ");
                case 'm' -> morse.append("-- ");
                case 'M' -> morse.append("-- ");
                case 'n' -> morse.append("-. ");
                case 'N' -> morse.append("-. ");
                case 'o' -> morse.append("--- ");
                case 'O' -> morse.append("--- ");
                case 'p' -> morse.append(".--. ");
                case 'P' -> morse.append(".--. ");
                case 'q' -> morse.append("--.- ");
                case 'Q' -> morse.append("--.- ");
                case 'r' -> morse.append(".-. ");
                case 'R' -> morse.append(".-. ");
                case 's' -> morse.append("... ");
                case 'S' -> morse.append("... ");
                case 't' -> morse.append("- ");
                case 'T' -> morse.append("- ");
                case 'u' -> morse.append("..- ");
                case 'U' -> morse.append("..- ");
                case 'v' -> morse.append("...- ");
                case 'V' -> morse.append("...- ");
                case 'w' -> morse.append(".-- ");
                case 'W' -> morse.append(".-- ");
                case 'x' -> morse.append("-..- ");
                case 'X' -> morse.append("-..- ");
                case 'y' -> morse.append("-.-- ");
                case 'Y' -> morse.append("-.-- ");
                case 'z' -> morse.append("--.. ");
                case 'Z' -> morse.append("--.. ");
                case ' ' -> morse.append("/ ");
                case '?' -> morse.append("..--.. ");
                case '!' -> morse.append("-.-.-- ");
                case '.' -> morse.append("E ");
                case ',' -> morse.append("--..-- ");
                case '0' -> morse.append("----- ");
                case '1' -> morse.append(".---- ");
                case '2' -> morse.append("..--- ");
                case '3' -> morse.append("...-- ");
                case '4' -> morse.append("....- ");
                case '5' -> morse.append("..... ");
                case '6' -> morse.append("-.... ");
                case '7' -> morse.append("--... ");
                case '8' -> morse.append("---.. ");
                case '9' -> morse.append("----. ");
            }
        }
        System.out.println("Fraza in codul morse: " + morse);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();
    }

    // Implement a Caesar Cipher encoder and decoder using StringBuilder.
    private static void caesarCipher() {

        System.out.println("EX11______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti String-ul / fraza: ");

        String str = scanner.nextLine();

        System.out.println("Fraza completa / String-ul complet este: " + str);
        System.out.println("Introduceti valoarea shift-ului: ");

        int n = scanner.nextInt();

        StringBuilder encryption = new StringBuilder();
        StringBuilder decryption = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                char shift = (char) (((c - 'A' + n + 26) % 26) + 'A');
                encryption.append(shift);
            } else if (Character.isLowerCase(c)) {
                char shift = (char) (((c - 'a' + n + 26) % 26) + 'a');
                encryption.append(shift);
            } else {
                encryption.append(c);
            }
        }

        System.out.println("Fraza criptata este: " + encryption);

        for (int i = 0; i < encryption.length(); i++) {
            char d = encryption.charAt(i);
            if (Character.isUpperCase(d)) {
                char shift = (char) (((d - 'A' - n + 26) % 26) + 'A');
                decryption.append(shift);
            } else if (Character.isLowerCase(d)) {
                char shift = (char) (((d - 'a' - n + 26) % 26) + 'a');
                decryption.append(shift);
            } else {
                decryption.append(d);
            }
        }

        System.out.println("Fraza decriptata este: " + decryption);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Convert a CamelCase string to snake_case using StringBuilder.
    private static void convert() {

        System.out.println("EX12______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti String-ul / fraza: ");

        String str = scanner.nextLine();

        System.out.println("Fraza completa / String-ul complet este: " + str);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                char d = Character.toLowerCase(c);
                if (i == 0) {
                    sb.append(d);
                } else {
                    sb.append('_').append(d);
                }
            } else {
                sb.append(c);
            }
        }

        System.out.println("camelCase to snake_case: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Expand a compressed string (e.g., "a3b2c4" -> "aaabbcccc") using StringBuilder.
    private static void compressed() {

        System.out.println("EX13______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti String-ul / fraza: ");

        String str = scanner.nextLine();

        System.out.println("Fraza completa / String-ul complet este: " + str);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                int count = 0;
                while ((i + 1) < str.length() && Character.isDigit(str.charAt(i + 1))) {
                    count = count * 10 + (str.charAt(i + 1) - '0'); //'0' are valoarea ASCII 48, '1' are valoarea 49, etc.
                    // Daca se scade '0' dintr-un caracter numeric (de exemplu, '1' - '0'), se obține valoarea numerică a acelui caracter.
                    i++;
                }
                if (count == 0) {
                    count = 1;
                }
                for (int j = 0; j < count; j++) {
                    sb.append(c);
                }
            }
        }

        System.out.println("String expandat: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Remove single line (//) and multi-line (/* */) comments from code using StringBuilder.

    private static void remove() {

        System.out.println("EX14______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti String-ul / fraza: ");

        String str = scanner.nextLine();

        System.out.println("Fraza completa / String-ul complet este: " + str);

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < str.length()) {
            if (i < str.length() - 1 && str.charAt(i) == '/' && str.charAt(i + 1) == '/') {
                while (i < str.length() && str.charAt(i) != '\n') {
                    i++; // se ignora pana la finalul liniei
                }
            } else if (i < str.length() - 1 && str.charAt(i) == '/' && str.charAt(i + 1) == '*') {
                i = i + 2; // se trece de "/*"
                while (i < str.length() - 1 && str.charAt(i) != '*' && str.charAt(i + 1) != '/') {
                    i++; // se ignora ce este intre /* */
                }
                i = i + 2; // se trece si de "*/"
            } else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        System.out.println("Codul fara comentarii: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Check if two strings are anagrams using StringBuilder.

    private static void anagrams() {

        System.out.println("EX15______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul String: ");
        String str1 = scanner.nextLine();

        System.out.println("Introduceti al doilea String: ");
        String str2 = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        if (str1.length() == str2.length()) {

            Arrays.sort(array1);
            Arrays.sort(array2);

            array1.toString();
            array2.toString();

            sb.append(array1);
            sb2.append(array2);

            if (sb.toString().equalsIgnoreCase(sb2.toString())) {
                System.out.println("Cele 2 String-uri sunt anagrame!");
            } else {
                System.out.println("Cele 2 String-uri nu sunt anagrame!!");
            }
        } else {
            System.out.println("Cele doua String-uri nu au acelasi numar de litere!");
        }

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Toggle the case of every character in a string using StringBuilder.
    private static void toggle() {

        System.out.println("EX16______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti String-ul: ");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        System.out.println("String-ul cu caracterele inversate este: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

    // Integer To Roman
    private static void romanNumbers() {

        System.out.println("EX17______________________________________________________________________________________");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numarul: ");
        int numar = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int [] valori = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};


        if (numar > 0 && numar <= 4000) {
            for (int i = 0; i < valori.length; i++){
                while (numar >= valori[i]){
                    sb.append(roman[i]);
                    numar = numar - valori[i];
                }
            }
        }else{
            System.out.println("Numarul este in afara range-ului!");
        }

        System.out.println("Numarul exprimat in numere romane este: " + sb);

        System.out.println();
        System.out.println("TERMINAT__________________________________________________________________________________");
        System.out.println();

    }

}
