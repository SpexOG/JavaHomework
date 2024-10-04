package Java_Equals_and_Hashcode_Generics_Enum;

public class Ex11 {

    public static void main(String[] args) {

        Integer[] arrayInt = {4,34,5567,0,8,786,98,9,10};

        for (Integer i : arrayInt){

            System.out.print(i + " ");

        }

        System.out.println();

        swap(arrayInt, 3, 6);

        for (Integer i : arrayInt){

            System.out.print(i + " ");

        }

        System.out.println();

        String[] arrayStr={"Mere", "pere", "Ananas", "Etc"};

        for (String i : arrayStr){

            System.out.print(i + " ");

        }

        System.out.println();

        swap(arrayStr, 3, 1);

        for (String i : arrayStr){

            System.out.print(i + " ");

        }

    }

    public static <T> void swap (T[] array, int index1, int index2){

        T index = array[index1];
        array[index1]=array[index2];
        array[index2]=index;

    }

}
