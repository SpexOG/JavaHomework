package Java_Equals_and_Hashcode_Generics_Enum;

import java.time.LocalDateTime;

public class Ex14 {

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println(Semafor.Rosu + " " + Semafor.Rosu.getStr() + " durata: " + Semafor.Rosu.getSecunde() + " secunde");
            sleep(Semafor.Rosu.getSecunde() * 1000);

            System.out.println(Semafor.Galben + " " + Semafor.Galben.getStr() + " durata: " + Semafor.Galben.getSecunde() + " secunde");
            sleep(Semafor.Galben.getSecunde() * 1000);

            System.out.println(Semafor.Verde + " " + Semafor.Verde.getStr() + " durata: " + Semafor.Verde.getSecunde() + " secunde");
            sleep(Semafor.Verde.getSecunde() * 1000);

            running = false;
        }

    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Sleep was interrupted.");
        }
    }

}
 enum Semafor {

    Rosu ("Opreste", 30),
     Galben ("Trece doar daca nu poti opri la timp", 5),
     Verde("Trecere libera", 45);

    private String str;
    private int secunde;

    Semafor(String str, int secunde){

        this.secunde=secunde;
        this.str=str;

    }

     public String getStr() {
         return str;
     }

     public int getSecunde() {
         return secunde;
     }
 }