package Java_Concurency;

import java.util.Scanner;

public class JavaConcurencyHomework1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("linii[A]: ");
        int m = scanner.nextInt();
        System.out.println("coloane[A]: ");
        int n = scanner.nextInt();

        System.out.println("linii[B]: ");
        int p = scanner.nextInt();
        System.out.println("coloane[B]: ");
        int k = scanner.nextInt();

        if (n != p) {
            System.out.println("Înmulțirea nu este posibilă.");
        }

        int[][] A = new int[m][n];
        int[][] B = new int[p][k];
        int[][] C = new int[m][k];

        System.out.println("Numerele din matricea A: ");

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){

                A[i][j] = scanner.nextInt();

            }
        }

        System.out.println("Numerele din matricea B: ");

        for (int i = 0; i < p; i++){
            for (int j = 0; j < k; j++){

                B[i][j] = scanner.nextInt();

            }
        }

        System.out.println("Matricea A: ");

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){

                System.out.print(A[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Matricea B: ");

        for (int i = 0; i < p; i++){
            for (int j = 0; j < k; j++){

                System.out.print(B[i][j] + " ");

            }

            System.out.println();

        }

        Long startSingleThread = System.currentTimeMillis();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < k; j++){
                C[i][j] = 0;
                for (int q = 0; q < n; q++) {
                    C[i][j] = C[i][j] + A[i][q] * B[q][j];
                }
            }
        }

        System.out.println("Matricea C: ");

        for (int i = 0; i < m; i++){
            for (int j = 0; j < k; j++){

                System.out.print(C[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println();

        Long endSingleThread = System.currentTimeMillis();
        System.out.println("Timp execuție single-threaded: " + (endSingleThread - startSingleThread) + "ms");

        int[][] D = new int[m][k];

        int nrThreaduri = 4;
        Thread[] threads = new Thread[nrThreaduri];
        int rowsPerThread = m / nrThreaduri;
        long startMultiThread = System.currentTimeMillis();

        for (int i = 0; i < nrThreaduri; i++) {
            int startRow = i * rowsPerThread;
            int endRow = (i == nrThreaduri - 1) ? m : startRow + rowsPerThread;
            System.out.println("Thread " + i + " procesează rândurile " + startRow + " până la " + (endRow - 1));
            threads[i] = new MatriceMultiThread(A, B, D, startRow, endRow);
            threads[i].start();

        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endMultiThread = System.currentTimeMillis();
        System.out.println("Timp execuție multithreaded: " + (endMultiThread - startMultiThread) + "ms");
        System.out.println();
        System.out.println("Matricea rezultată (D): ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }
}


class MatriceMultiThread extends Thread{

    private int [][] A, B, D;
    private int startRow, endRow;

    public MatriceMultiThread(int[][] A, int[][] B, int[][] D, int startRow, int endRow){

        this.A = A;
        this.B = B;
        this.D = D;
        this.startRow = startRow;
        this.endRow = endRow;

    }

    @Override
    public void run(){

        int n = B.length;
        int k = B[0].length;

        for (int i = startRow; i < endRow; i++) {
            for (int j = 0; j < k; j++) {
                D[i][j] = 0;
                for (int q = 0; q < n; q++) {
                    D[i][j] = D[i][j] + A[i][q] * B[q][j];
                }
            }
        }
    }
}


