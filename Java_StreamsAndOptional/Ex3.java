package Java_StreamsAndOptional;

//Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.

import java.util.stream.IntStream;

public class Ex3 {

    public static class Main {
        public static void main(String[] args) {

            IntStream.rangeClosed(1, 100)
                    .filter(Main::isPrime)
                    .forEach(System.out::println);
        }

        private static boolean isPrime(int number) {

            if (number < 1){

                return false;

            }

            for (int i = 2; i < number; i++){

                if (number % i == 0){

                    return false;

                }

            }

            return true;

        }

    }

}
